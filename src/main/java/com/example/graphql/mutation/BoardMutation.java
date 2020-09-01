package com.example.graphql.mutation;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.graphql.model.Board;
import com.example.graphql.model.Notice;
import com.example.graphql.repository.BoardRepository;


@Component
public class BoardMutation implements GraphQLMutationResolver {
	private BoardRepository boardRepository;

	@Autowired
	public BoardMutation(BoardRepository boardRepository) {
		this.boardRepository = boardRepository;

	}

	public Board createBoard(String title) {
		Board board = new Board();
		board.setTitle(title);
		
		
		boardRepository.save(board);
		System.out.println(board);
		return board;
	}

}
