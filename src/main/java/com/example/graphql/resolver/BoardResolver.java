package com.example.graphql.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.graphql.model.Author;
import com.example.graphql.model.Board;
import com.example.graphql.model.Notice;
import com.example.graphql.repository.AuthorRepository;
import com.example.graphql.repository.BoardRepository;
import com.example.graphql.repository.NoticeRepository;


@Component
public class BoardResolver implements GraphQLResolver<Notice>  {

	
	private BoardRepository boardRepository;

	@Autowired
	public BoardResolver(BoardRepository boardRepository) {
		
		this.boardRepository=boardRepository;
	}


	
	public Board getBoard(Notice notice) {
		return boardRepository.findById(notice.getBoard().getId()).orElseThrow(null);
	}

}
