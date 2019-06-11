package dam.mtribor.taskcontrolservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskControlRepository extends JpaRepository<ControlVO, Integer> {
}
