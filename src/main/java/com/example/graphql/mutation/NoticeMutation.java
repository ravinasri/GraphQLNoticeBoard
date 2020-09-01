package com.example.graphql.mutation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.graphql.model.Author;
import com.example.graphql.model.Board;
import com.example.graphql.model.Notice;
import com.example.graphql.repository.NoticeRepository;

import javassist.NotFoundException;


@Component
public class NoticeMutation implements GraphQLMutationResolver {
	private NoticeRepository noticeRepository;

	@Autowired
	public NoticeMutation(NoticeRepository noticeRepository) {
		this.noticeRepository = noticeRepository;

	}

	 public Notice createNotice(String title, String description,Long author_id,Long id) {
		 Notice notice = new Notice();
		 
	     notice.setAuthor(new Author(author_id));
	     notice.setBoard(new Board(id));
	    
		    notice.setTitle(title);
		    notice.setDescription(description);

		    noticeRepository.save(notice);
		    System.out.println(notice);

		    return notice;
		  }
	 
	 public boolean deleteNotice(Long id) {
		 noticeRepository.deleteById(id);
		    return true;
		  }

		  public Notice updateNotice(Long id, String title, String description) throws NotFoundException {
		    Optional<Notice> optTutorial = noticeRepository.findById(id);

		    if (optTutorial.isPresent()) {
		      Notice tutorial = optTutorial.get();

		      if (title != null)
		        tutorial.setTitle(title);
		      if (description != null)
		        tutorial.setDescription(description);

		      noticeRepository.save(tutorial);
		      return tutorial;
		    }

		    throw new NotFoundException("Not found Tutorial to update!");
		  }

		}


