package com.example.graphql.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.coxautodev.graphql.tools.GraphQLResolver;

import com.example.graphql.model.Notice;
import com.example.graphql.repository.AuthorRepository;
import com.example.graphql.repository.NoticeRepository;


@Component
public class Notices implements GraphQLQueryResolver  {

	private NoticeRepository noticeRepository;
	

	@Autowired
	public Notices(NoticeRepository noticeRepository) {
		this.noticeRepository = noticeRepository;
		
	}

	public Iterable<Notice> findAllNotices() {
		return noticeRepository.findAll();
	}
}