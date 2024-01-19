package com.pradeep.graphQL.resolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.pradeep.graphQL.model.Author;
import com.pradeep.graphQL.model.Tutorial;
import com.pradeep.graphQL.repository.AuthorRepository;
import com.pradeep.graphQL.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class Query implements GraphQLQueryResolver {
    private AuthorRepository authorRepository;
    private TutorialRepository tutorialRepository;

    @Autowired
    public Query(AuthorRepository authorRepository, TutorialRepository tutorialRepository) {
        this.authorRepository = authorRepository;
        this.tutorialRepository = tutorialRepository;
    }

    public Iterable<Author> findAllAuthors() {
        return authorRepository.findAll();
    }

    public Iterable<Tutorial> findAllTutorials() {
        return tutorialRepository.findAll();
    }

    public long countAuthors() {
        return authorRepository.count();
    }

    public long countTutorials() {
        return tutorialRepository.count();
    }

}
