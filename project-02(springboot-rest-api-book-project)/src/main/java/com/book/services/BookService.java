package com.book.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.book.entity.Book;
import com.book.repository.BookRepository;

@Component
public class BookService {

	@Autowired
	private BookRepository bookRepo;

	private static List<Book> list = new ArrayList<>();

	static {
		list.add(new Book(101, "movie", "arnab"));
		list.add(new Book(101, "cricket", "ashwini"));
		list.add(new Book(101, "book", "shstik"));
	}

	// get all books
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		// List<Book> list=(List<Book>) this.bookRepo.findAll();

		return list;
	}

	// get single book by id

	public Book getBookById(int id) {
		// TODO Auto-generated method stub

		Book book = null;

		// using stream api

		book = list.stream().filter(e -> e.getBookId() == id).findFirst().get();
		return book;
	}

	// adding the book

	public Book addBook(Book b) {
		list.add(b);
		return b;
	}

	// delete the book

	public void deleteBook(int bid) {
		list = list.stream().filter(book -> book.getBookId() == bid).collect(Collectors.toList());
	}

	// update the book

	public void updateBook(Book book,int bookId) {
		/*
		 * list=list.stream().map(b-> { //condition if(b.getBookId()==bookId) {
		 * b.setTitle(book.getTitle()); b.setAuthor(book.getAuthor()); }
		 * 
		 * 
		 * }).collect(Collectors.toList());
		 */

}
}


