package com.pradeep.graphQL.repository;

import com.pradeep.graphQL.model.Tutorial;
import org.springframework.data.mongodb.repository.MongoRepository;



public interface TutorialRepository extends MongoRepository<Tutorial, String> {

}
