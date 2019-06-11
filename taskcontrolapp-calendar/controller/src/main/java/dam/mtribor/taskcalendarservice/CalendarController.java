package dam.mtribor.taskcalendarservice;


import dam.mtribor.taskcalendarservice.api.CalendarApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class CalendarController implements CalendarApi {

    @Autowired
    private CalendarService calendarService;

    @Override
    public ResponseEntity<TaskDTO> insert(final TaskDTO task) {
        return ResponseEntity.ok(calendarService.insert(task));
    }

    @Override
    public ResponseEntity<List<TaskDTO>> getAll(final TaskFilterDTO filter) {
        return ResponseEntity.ok(calendarService.getAll(filter));
    }

    @Override
    public ResponseEntity<TaskDTO> getById(final String taskID) {
        return ResponseEntity.ok(calendarService.getById(taskID));
    }

    @Override
    public ResponseEntity<TaskDTO> update(final String taskID, @Valid final TaskDTO taskDTO) {
        return ResponseEntity.ok(calendarService.update(taskDTO, taskID));
    }

    @Override
    public ResponseEntity<Void> delete(final String taskID) {
        calendarService.delete(taskID);
        return ResponseEntity.noContent().build();
    }
}
