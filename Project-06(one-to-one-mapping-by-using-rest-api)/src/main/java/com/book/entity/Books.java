package com.book.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;



@Entity
public class Books {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookId;
	private String bookName;
	
	@OneToOne(cascade = CascadeType.ALL)
	private BookAuthor bookAuthor;

	public BookAuthor getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(BookAuthor bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Books(int bookId, String bookName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
	}

	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}

}
