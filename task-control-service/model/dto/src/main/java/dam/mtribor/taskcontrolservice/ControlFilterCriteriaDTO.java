package dam.mtribor.taskcontrolservice;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ControlFilterCriteriaDTO {

    private String task_reference;
    private String alum_reference;
    private Date controlDate;
    private Integer workLoadValuation;
    private Integer difficultValuation;
}
