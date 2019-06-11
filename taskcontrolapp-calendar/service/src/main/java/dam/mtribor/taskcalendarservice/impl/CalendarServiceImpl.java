package dam.mtribor.taskcalendarservice.impl;

import dam.mtribor.taskcalendarservice.*;
import dam.mtribor.taskcalendarservice.converters.TaskConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;


@Service
public class CalendarServiceImpl implements CalendarService {

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private TaskConverter taskConverter;

    @Override
    public TaskDTO insert(final TaskDTO taskDTO) {
        return taskConverter.convertEntityToDTO(taskRepository.insert(completeNewTask(taskDTO)));
    }

    @Override
    public List<TaskDTO> getAll(final TaskFilterDTO filter) {
        return taskRepository.findAllFilteredByQuery(taskQueryBuilder(filter)).stream()
                .map(taskVO -> taskConverter.convertEntityToDTO(taskVO))
                .collect(Collectors.toList());
    }

    @Override
    public TaskDTO getById(final String taskID) {
        TaskVO taskVO = taskRepository.findById(taskID).orElseThrow(() -> new NoSuchElementException(
                "The task with id=" + taskID + " was not found"));

        return taskConverter.convertEntityToDTO(taskVO);
    }

    @Override
    public TaskDTO update(final TaskDTO taskDTO, final String taskID) {
        validateTaskDate(taskDTO);
        TaskVO oldTaskVO = taskRepository.findById(taskID).orElseThrow(() -> new NoSuchElementException(
                "The task with id=" + taskID + " was not found"));

        TaskVO updatedTaskVO = taskConverter.convertDTOToEntity(taskDTO);
        updatedTaskVO.setId(oldTaskVO.getId());

        return taskConverter.convertEntityToDTO(taskRepository.save(updatedTaskVO));
    }

    @Override
    public void delete(final String taskID) {
        taskRepository.deleteById(taskID);
    }


    private TaskVO completeNewTask(final TaskDTO taskDTO) {
        TaskVO taskReceived = taskConverter.convertDTOToEntity(taskDTO);
        taskReceived.setCreationDate(new Date());
        validateTaskDate(taskDTO);
        return taskReceived;
    }

    private void validateTaskDate(TaskDTO taskDTO) {
        if (taskDTO.getLimitDate().after(new Date()))
            throw new NullPointerException();//EventDateNotValidException("The start date cannot be after the end date of the event");
    }

    private Query taskQueryBuilder(final TaskFilterDTO search) {
        Criteria criteria = new Criteria();
        Query query = new Query();

        if (search.getCreationDate() != null)
            query.addCriteria(criteria.where("creationDate").is(search.getCreationDate()));
        if (search.getLimitDate() != null)
            query.addCriteria(criteria.and("limitDate").is(search.getLimitDate()));
        if (search.getTeacher_reference() != null)
            query.addCriteria(criteria.where("teacher_reference").is(search.getTeacher_reference()));
        if (search.getCourse() != null)
            query.addCriteria(criteria.where("course").is(search.getCourse()));
        if (search.getAlum_reference() != null)
            query.addCriteria(criteria.where("alum_reference")
                    .elemMatch(Criteria.where("reference").is(search.getAlum_reference())));
        return query;
    }

}
