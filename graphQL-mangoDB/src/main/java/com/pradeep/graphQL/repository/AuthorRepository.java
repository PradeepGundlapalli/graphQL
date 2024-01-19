package com.pradeep.graphQL.repository;

import com.pradeep.graphQL.model.Author;
import org.springframework.data.mongodb.repository.MongoRepository;



public interface AuthorRepository extends MongoRepository<Author, String> {

}