package dam.mtribor.taskcalendarservice;

import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

public interface CustomTaskRepository {

    List<TaskVO> findAllFilteredByQuery(final Query query);

}
