package com.book.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.book.entity.Books;

@Repository
public interface BooksRepository extends CrudRepository<Books,Integer>{
 
	
	/*
	 * public Books addBook(Books book); public List<Books> getAllbooks();
	 * 
	 * public String deleteBook(int bookId);
	 * 
	 * public void updateBook(Books book, int bookId);
	 */
}
