package com.book.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.entity.Books;
import com.book.repository.BooksRepository;


@Service
public class BooksDao {
	
	@Autowired
	private BooksRepository repo;
	
	
	public Books addBook(Books book) {
		System.out.println("repo" + book);
		return repo.save(book);
	}
	
	public List<Books> getAllbooks() {

		List<Books> allBooks = new ArrayList<>();
		allBooks = (List<Books>) repo.findAll();
		System.out.println(allBooks);
		return allBooks;
		
   
	}
	 public String deleteBook(int bookId) {
	    	this.repo.deleteById(bookId);
	    	return "Dletion Succesfuill";
	    }
	 
		/*
		 * public void update(Books books, int bookid) { booksRepository.save(books); }
		 */ 
	 
	public void updateBook(Books book, int bookId)
	{
		repo.save(book);
	}

}
