package dam.mtribor.taskcalendarservice;

import java.util.List;

public interface CalendarService {

    TaskDTO insert(final TaskDTO task);

    List<TaskDTO> getAll(final TaskFilterDTO filter);

    TaskDTO getById(final String taskID);

    TaskDTO update(final TaskDTO taskDTO, String taskID);

    void delete(String taskID);

}
