package dam.mtribor.taskcontrolservice.converter;

import dam.mtribor.taskcontrolservice.ControlDTO;
import dam.mtribor.taskcontrolservice.ControlVO;
import org.springframework.stereotype.Component;

@Component
public class ControlConverter {

    public ControlDTO convertEntityToDTO(ControlVO controlVO) {
        return ControlDTO.builder().alum_reference(controlVO.getAlum_reference())
                .controlDate(controlVO.getControlDate()).difficultComment(controlVO.getDifficultComment())
                .difficultValuation(controlVO.getDifficultValuation()).id(controlVO.getId())
                .task_reference(controlVO.getTask_reference()).workLoadComment(controlVO.getWorkLoadComment())
                .workLoadValuation(controlVO.getWorkLoadValuation()).build();
    }

    public ControlVO convertDTOToEntity(ControlDTO controlDTO) {
        return ControlVO.builder().alum_reference(controlDTO.getAlum_reference())
                .controlDate(controlDTO.getControlDate()).difficultComment(controlDTO.getDifficultComment())
                .difficultValuation(controlDTO.getDifficultValuation()).id(controlDTO.getId())
                .task_reference(controlDTO.getTask_reference()).workLoadComment(controlDTO.getWorkLoadComment())
                .workLoadValuation(controlDTO.getWorkLoadValuation()).build();
    }


}
