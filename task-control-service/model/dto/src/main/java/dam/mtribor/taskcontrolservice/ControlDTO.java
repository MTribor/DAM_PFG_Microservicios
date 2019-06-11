package dam.mtribor.taskcontrolservice;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ControlDTO {
    private Integer id;
    private String task_reference;
    private String alum_reference;
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private Date controlDate;
    @NotNull(message = "The valuation for the quantity of the work done can't be null!")
    private Integer workDoneQuantityValuation;
    @NotBlank(message = "The comment for the quantity of the work done can't be null!")
    private String workDoneQuantityComment;
    @NotNull(message = "The valuation for the workload can't be null!")
    private Integer workLoadValuation;
    @NotBlank(message = "The comment for the workload can't be null!")
    private String workLoadComment;
    @NotNull(message = "The valuation for the difficult can't be null!")
    private Integer difficultValuation;
    @NotBlank(message = "The comment for the difficult can't be null!")
    private String difficultComment;
}
