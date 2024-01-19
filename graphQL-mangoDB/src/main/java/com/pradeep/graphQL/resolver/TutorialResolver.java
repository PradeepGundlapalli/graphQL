package com.pradeep.graphQL.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.pradeep.graphQL.model.Author;
import com.pradeep.graphQL.model.Tutorial;
import com.pradeep.graphQL.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class TutorialResolver implements GraphQLResolver<Tutorial> {
    @Autowired
    private AuthorRepository authorRepository;

    public TutorialResolver(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author getAuthor(Tutorial tutorial) {
        return authorRepository.findById(tutorial.getAuthorId()).
                orElseThrow(null);
    }
}
