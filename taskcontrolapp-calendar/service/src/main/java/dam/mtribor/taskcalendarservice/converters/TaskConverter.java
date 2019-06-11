package dam.mtribor.taskcalendarservice.converters;

import dam.mtribor.taskcalendarservice.TaskDTO;
import dam.mtribor.taskcalendarservice.TaskTypeVO;
import dam.mtribor.taskcalendarservice.TaskVO;
import org.springframework.stereotype.Component;

@Component
public class TaskConverter {

    public TaskDTO convertEntityToDTO(final TaskVO taskVO) {

        return TaskDTO.builder().alumns_references(taskVO.getAlums_references()).creationDate(taskVO.getCreationDate())
                .description(taskVO.getDescription()).title(taskVO.getTitle()).limitDate(taskVO.getLimitDate())
                .subject_reference(taskVO.getSubject_reference()).teacher_reference(taskVO.getTeacher_reference())
                .taskType(taskVO.getTaskType().getValue()).course(taskVO.getCourse()).build();
    }

    public TaskVO convertDTOToEntity(final TaskDTO taskDTO) {

        return TaskVO.builder().alums_references(taskDTO.getAlumns_references()).creationDate(taskDTO.getCreationDate())
                .description(taskDTO.getDescription()).title(taskDTO.getTitle()).limitDate(taskDTO.getLimitDate())
                .subject_reference(taskDTO.getSubject_reference()).teacher_reference(taskDTO.getTeacher_reference())
                .taskType(TaskTypeVO.valueOf(taskDTO.getTaskType())).course(taskDTO.getCourse()).build();

    }
}


