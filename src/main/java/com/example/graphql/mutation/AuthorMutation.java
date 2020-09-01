package com.example.graphql.mutation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.graphql.model.Author;
import com.example.graphql.repository.AuthorRepository;


@Component
public class AuthorMutation implements GraphQLMutationResolver {
	private AuthorRepository authorRepository;

	@Autowired
	public AuthorMutation(AuthorRepository authorRepository) {
		this.authorRepository = authorRepository;

	}

	 public Author createAuthor(String firstName, String lastName) {
		    Author author = new Author();
		    author.setFirstName(firstName);
		    author.setLastName(lastName);

		    authorRepository.save(author);
            System.out.println(author);
		    return author;
		  }

}
