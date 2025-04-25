package com.bookStore.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.bookStore.Service.MyBookListService;

@Controller
public class MyBookListController {
  
	@Autowired
	 public MyBookListService mbls;
	
	@GetMapping("/deleteMyBook/{id}")
	public String deleteBook(@PathVariable int id) {
		mbls.deleteById(id);
		return"redirect:/my_books";
	}
}
