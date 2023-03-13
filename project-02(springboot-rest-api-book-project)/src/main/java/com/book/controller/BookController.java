package com.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.book.entity.Book;
import com.book.services.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;
	
	
	//get all the books
	
	@GetMapping("/getbooks")
	public List<Book> getBooks(){
		return this.bookService.getAllBooks();
		
	}
	
	//get books by id
	
	@GetMapping("/books/{id}")
	public Book getBook(@PathVariable("id") int id) {
		return this.bookService.getBookById(id);
	}
	
	
	//create a handler 
	
	@PostMapping("/addbooks")
	public Book addBook(@RequestBody Book book) {
		Book b=this.bookService.addBook(book);
		System.out.println(b);
		return book;
	}
	
	//delete book handler
	@PostMapping("/deletebook")
	public Book deleteBook(@PathVariable("bookId") int bookId) {
		this.bookService.deleteBook(bookId);
		return null;
		
	}
	//update book handler
	@PostMapping("/updatebook")
	public Book updateBook(@RequestBody Book book,@PathVariable("bookId") int bookId) {
		
		this.bookService.updateBook(book, bookId);
		return book;
	}
	
}
