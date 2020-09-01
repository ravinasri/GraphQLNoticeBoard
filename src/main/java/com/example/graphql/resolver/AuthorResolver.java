package com.example.graphql.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphql.model.Author;
import com.example.graphql.repository.AuthorRepository;



@Component
public class AuthorResolver implements GraphQLQueryResolver {

	private AuthorRepository authorRepository;

	@Autowired
	public AuthorResolver(AuthorRepository authorRepository) {
		this.authorRepository = authorRepository;
	}

	public Iterable<Author> findAllAuthors() {
		return authorRepository.findAll();
	}

}
