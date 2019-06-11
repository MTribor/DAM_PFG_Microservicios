package dam.mtribor.taskcalendarservice.api;

import dam.mtribor.taskcalendarservice.TaskDTO;
import dam.mtribor.taskcalendarservice.TaskFilterDTO;
import dam.mtribor.taskcalendarservice.constants.EndPointUris;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RequestMapping(EndPointUris.TASKS)
public interface CalendarApi {

    @PostMapping
    ResponseEntity<TaskDTO> insert(@Valid @RequestBody final TaskDTO event);

    @GetMapping
    ResponseEntity<List<TaskDTO>> getAll(@Valid final TaskFilterDTO filter);

    @GetMapping(EndPointUris.TASK_ID)
    ResponseEntity<TaskDTO> getById(@PathVariable(value = "taskId") final String taskID);

    @PutMapping(EndPointUris.TASK_ID)
    ResponseEntity<TaskDTO> update(@PathVariable(value = "taskId") final String taskID, @RequestBody @Valid final TaskDTO taskDTO);

    @DeleteMapping(EndPointUris.TASK_ID)
    ResponseEntity<Void> delete(@PathVariable(value = "taskId") final String taskID);

}
