package com.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book.entity.BookAuthor;
import com.book.entity.Books;
import com.book.service.BooksDao;


@RestController
@RequestMapping
public class BookController {

	@Autowired
	private BooksDao dao;
	
	
	@GetMapping("/")
	public String run() {
		return "Login Successfull....!";
	}
	
	
	
	@PostMapping("/add")
	public Books addBook(@RequestBody Books book) {
		System.out.println(book.getBookName());
		
		BookAuthor author = new BookAuthor();
		
		author.setName("Durgesh");
		book.setBookAuthor(author);
		
		return this.dao.addBook(book);
	}
	@GetMapping("/allBooks")
	public List<Books> allBook(){
		
		return this.dao.getAllbooks();
	}
	
	
	
	@PutMapping("/update/{bookId}")
	public Books updateBook(@RequestBody Books book) {
	
		
		return this.dao.addBook(book);
	}
	
	
	@DeleteMapping("/delete/{bookId}")
	public String deleteBook(@PathVariable int bookId) {
		return this.dao.deleteBook(bookId);
	}
}
