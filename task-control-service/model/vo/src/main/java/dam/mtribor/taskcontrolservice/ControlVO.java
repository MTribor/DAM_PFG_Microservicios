package dam.mtribor.taskcontrolservice;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class ControlVO {

    @GeneratedValue
    @Id
    private Integer id;
    private String task_reference;
    private String alum_reference;
    private Date controlDate;
    private Integer workDoneQuantityValuation;
    private String workDoneQuantityComment;
    private Integer workLoadValuation;
    private String workLoadComment;
    private Integer difficultValuation;
    private String difficultComment;
}
