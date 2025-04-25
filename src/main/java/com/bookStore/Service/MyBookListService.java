package com.bookStore.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookStore.Entity.MyBookList;
import com.bookStore.Repository.MyBookRepository;

@Service
public class MyBookListService {
	
	@Autowired
	private MyBookRepository mbr;

	public MyBookListService(MyBookRepository mbr) {
		super();
		this.mbr = mbr;
	}
	
	public void saveMyBook(MyBookList book) {
		mbr.save(book);
	}

	 public List<MyBookList> getAllMyBooks(){
		 return mbr.findAll();
	 }
	 
	 public void deleteById(int id) {
		  mbr.deleteById(id);
	 }
}
