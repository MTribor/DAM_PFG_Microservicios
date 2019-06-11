package dam.mtribor.taskcalendarservice.impl;

import dam.mtribor.taskcalendarservice.CustomTaskRepository;
import dam.mtribor.taskcalendarservice.TaskVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

public class CustomTaskRepositoryImpl implements CustomTaskRepository {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<TaskVO> findAllFilteredByQuery(final Query query) {
        return mongoTemplate.find(query, TaskVO.class);
    }

}
