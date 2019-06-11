package dam.mtribor.taskcalendarservice;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Tasks")
public class TaskVO {
    @Id
    private String id;
    private String title;
    private String description;
    private TaskTypeVO taskType;
    private Date creationDate;
    private Date limitDate;
    private String course;
    private String teacher_reference;
    private String subject_reference;
    private List<String> alums_references;
}
