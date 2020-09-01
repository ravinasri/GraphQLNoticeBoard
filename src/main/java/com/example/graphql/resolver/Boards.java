package com.example.graphql.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphql.model.Board;
import com.example.graphql.repository.BoardRepository;


@Component
public class Boards implements GraphQLQueryResolver {

	private BoardRepository boardRepository;

	@Autowired
	public Boards(BoardRepository boardRepository) {
		this.boardRepository = boardRepository;
	}

	public Iterable<Board> findAllBoard() {
		return boardRepository.findAll();
	}

}
