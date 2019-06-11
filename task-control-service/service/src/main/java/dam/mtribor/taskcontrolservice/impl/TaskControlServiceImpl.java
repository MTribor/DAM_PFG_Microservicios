package dam.mtribor.taskcontrolservice.impl;

import dam.mtribor.taskcontrolservice.*;
import dam.mtribor.taskcontrolservice.converter.ControlConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
public class TaskControlServiceImpl implements TaskControlService {

    @Autowired
    private TaskControlRepository taskControlRepository;

    @Autowired
    private ControlConverter controlConverter;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public ControlDTO create(final ControlDTO controlDTO) {
        return controlConverter.convertEntityToDTO(taskControlRepository
                .save(controlConverter.convertDTOToEntity(controlDTO)));
    }

    @Override
    public List<ControlDTO> getAll(final ControlFilterCriteriaDTO search) {
        TypedQuery<ControlVO> q = entityManager.createQuery(controlCriteriaQueryBuilder(search));

        return q.getResultList().stream()
                .map(controlVO -> controlConverter.convertEntityToDTO(controlVO))
                .collect(Collectors.toList());
    }

    @Override
    public ControlDTO getById(int controlId) {
        return controlConverter.convertEntityToDTO(taskControlRepository
                .findById(controlId).orElseThrow(NoSuchElementException::new));
    }

    @Transactional
    @Override
    public void delete(final int controlId) {
        taskControlRepository.deleteById(controlId);
    }

    @Transactional
    @Override
    public ControlDTO update(final int controlId, final ControlDTO controlDTO) {
        ControlVO res = controlConverter.convertDTOToEntity(controlDTO);
        taskControlRepository.findById(controlId).orElseThrow(NoSuchElementException::new);
        return controlConverter.convertEntityToDTO(taskControlRepository.save(res));
    }

    private CriteriaQuery controlCriteriaQueryBuilder(final ControlFilterCriteriaDTO params) {

        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<ControlVO> query = builder.createQuery(ControlVO.class);
        Root r = query.from(ControlVO.class);

        final String alum_reference = params.getAlum_reference();
        final String task_reference = params.getTask_reference();
        final Date controlDate = params.getControlDate();
        final Integer workLoadValuation = params.getWorkLoadValuation();
        final Integer difficultValuation = params.getDifficultValuation();

        Predicate predicateAlum_reference = builder.equal(r.get("alum_reference"), alum_reference);
        Predicate predicateTask_reference = builder.equal(r.get("task_reference"), task_reference);
        Predicate predicateControlDate = builder.equal(r.get("controlDate"), controlDate);
        Predicate predicateWorkLoadValuation = builder.equal(r.get("workLoadValuation"), workLoadValuation);
        Predicate predicateDifficultValuation = builder.equal(r.get("difficultValuation"), difficultValuation);

        List<Predicate> predicates = new ArrayList<>();

        if (alum_reference != null) {
            predicates.add(builder.and(predicateAlum_reference));
        }
        if (task_reference != null) {
            predicates.add(builder.and(predicateTask_reference));
        }
        if (controlDate != null) {
            predicates.add(builder.and(predicateControlDate));
        }
        if (workLoadValuation != null) {
            predicates.add(builder.and(predicateWorkLoadValuation));
        }
        if (difficultValuation != null) {
            predicates.add(builder.and(predicateDifficultValuation));
        }
        query.select(r).where(predicates.toArray(new Predicate[0]));

        return query;

    }

}
