package com.example.graphql.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.graphql.model.Author;
import com.example.graphql.model.Notice;
import com.example.graphql.repository.AuthorRepository;
import com.example.graphql.repository.NoticeRepository;


@Component
public class NoticeResolver implements GraphQLResolver<Notice>  {

	
	private AuthorRepository authorRepository;

	@Autowired
	public NoticeResolver(AuthorRepository authorRepository) {
		
		this.authorRepository=authorRepository;
	}

//	public Iterable<Notice> findAllNotices() {
//		return noticeRepository.findAll();
//	}
	
	public Author getAuthor(Notice notice) {
		return authorRepository.findById(notice.getAuthor().getId()).orElseThrow(null);
	}

}
