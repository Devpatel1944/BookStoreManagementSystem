package com.bookStore.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookStore.Entity.Book;
import com.bookStore.Repository.BookRepository;

@Service
public class BookService {
    
	@Autowired
	public BookRepository bookRepository;

	public BookService() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public void save(Book b) {
		bookRepository.save(b);
	}
	
	public List<Book> getAllBooks(){
		return bookRepository.findAll();
	}
	
	public Book getBookById(int id) {
		return bookRepository.findById(id).get();
	}
	
	public void deleteById(int id) {
		bookRepository.deleteById(id);
	}
}
