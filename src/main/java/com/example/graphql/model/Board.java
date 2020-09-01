package com.example.graphql.model;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Board  {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    @Column
    private String title;

    @OneToMany(mappedBy="board",fetch = FetchType.EAGER)
    private List<Notice> noticeList;

	public Board() {
		super();
	}

	public Board(Long id) {
		super();
		this.id = id;
	}

	public Board(String title, List<Notice> noticeList) {
		super();
		this.title = title;
		this.noticeList = noticeList;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Notice> getNoticeList() {
		return noticeList;
	}

	public void setNoticeList(List<Notice> noticeList) {
		this.noticeList = noticeList;
	}

	@Override
	public String toString() {
		return "Board [id=" + id + ", title=" + title + ", noticeList=" + noticeList + "]";
	}
    
    
    
    
}
