package com.book.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class BookAuthor {

	@Id
	@GeneratedValue
	private int id;
	private String name;

	@OneToOne(mappedBy = "bookAuthor", cascade = CascadeType.ALL)
	private Books books;

	@Override
	public String toString() {
		return "BookAuthor [id=" + id + ", name=" + name + "]";
	}

	public BookAuthor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookAuthor(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Books getBooks() {
		return books;
	}

	public void setBooks(Books books) {
		this.books = books;
	}

}
