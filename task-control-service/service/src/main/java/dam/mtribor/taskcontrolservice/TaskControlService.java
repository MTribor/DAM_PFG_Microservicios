package dam.mtribor.taskcontrolservice;

import java.util.List;

public interface TaskControlService {

    ControlDTO create(final ControlDTO controlDTO);

    List<ControlDTO> getAll(final ControlFilterCriteriaDTO search);

    ControlDTO getById(final int controlId);

    void delete(final int controlId);

    ControlDTO update(final int controlId, final ControlDTO controlDTO);

}
