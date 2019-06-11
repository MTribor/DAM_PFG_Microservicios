package dam.mtribor.taskcalendarservice;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TaskDTO {
    private String id;
    @NotBlank(message = "Title cannot be empty")
    private String title;
    @NotBlank(message = "Description cannot be empty")
    private String description;
    private Integer taskType;
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private Date creationDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private Date limitDate;
    @NotBlank(message = "Course cannot be empty!")
    private String course;
    @NotBlank(message = "The task have to be assigned by a teacher")
    private String teacher_reference;
    @NotBlank(message = "The task have to be assigned to a subject")
    private String subject_reference;
    private List<String> alumns_references;
}
