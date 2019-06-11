package dam.mtribor.taskcontrolservice.api;

import dam.mtribor.taskcontrolservice.ControlDTO;
import dam.mtribor.taskcontrolservice.ControlFilterCriteriaDTO;
import dam.mtribor.taskcontrolservice.constants.EndPointUris;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping(EndPointUris.CONTROLS)
public interface TaskControlApi {

    @PostMapping
    ResponseEntity<ControlDTO> create(@Valid @RequestBody final ControlDTO controlDTO);

    @GetMapping
    ResponseEntity<List<ControlDTO>> getAll(final ControlFilterCriteriaDTO search);

    @GetMapping(EndPointUris.CONTROL)
    ResponseEntity<ControlDTO> getById(@PathVariable(value = "id") final int controlId);

    @DeleteMapping(EndPointUris.CONTROL)
    ResponseEntity<Void> delete(@PathVariable(value = "id") final int controlId);

    @PutMapping(EndPointUris.CONTROL)
    ResponseEntity<ControlDTO> update(@PathVariable(value = "id") final int controlId,
                                      @Valid @RequestBody final ControlDTO controlDTO);

}
