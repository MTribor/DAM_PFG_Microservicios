package dam.mtribor.taskcalendarservice;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends MongoRepository<TaskVO, String>, CustomTaskRepository {
}
