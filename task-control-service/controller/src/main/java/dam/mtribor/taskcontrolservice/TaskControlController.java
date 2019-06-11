package dam.mtribor.taskcontrolservice;

import dam.mtribor.taskcontrolservice.api.TaskControlApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class TaskControlController implements TaskControlApi {

    @Autowired
    private TaskControlService taskControlService;

    @Override
    public ResponseEntity<ControlDTO> create(@Valid ControlDTO controlDTO) {
        return ResponseEntity.ok(taskControlService.create(controlDTO));
    }

    @Override
    public ResponseEntity<List<ControlDTO>> getAll(ControlFilterCriteriaDTO search) {
        return ResponseEntity.ok(taskControlService.getAll(search));
    }

    public ResponseEntity<ControlDTO> getById(@PathVariable(value = "id") final int controlId) {
        return ResponseEntity.ok(taskControlService.getById(controlId));
    }


    @Override
    public ResponseEntity<Void> delete(int controlId) {
        return ResponseEntity.noContent().build();
    }

    @Override
    public ResponseEntity<ControlDTO> update(int controlId, @Valid ControlDTO controlDTO) {
        return ResponseEntity.ok(taskControlService.update(controlId, controlDTO));
    }
}
