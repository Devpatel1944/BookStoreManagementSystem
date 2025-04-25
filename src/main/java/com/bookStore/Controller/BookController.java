package com.bookStore.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bookStore.Entity.Book;
import com.bookStore.Entity.MyBookList;
import com.bookStore.Service.BookService;
import com.bookStore.Service.MyBookListService;


@Controller
public class BookController {
	
	@Autowired
	public BookService bs;
	
	@Autowired
	public MyBookListService mbls;
  
	@GetMapping("/")
	public String home() {
		return"home";
	}
	@GetMapping("/book_register")
	public String bookRegister() {
		return"bookRegister";
	}
	
	@GetMapping("/available_book")
	public ModelAndView getAllBook() {
		List<Book> list = bs.getAllBooks();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("bookList");
		mv.addObject("book",list);
		return mv;
	}
	
	@PostMapping("/save")
	public String addBook(@ModelAttribute Book b) {
		bs.save(b);
		return "redirect:/available_book";
	}
	
	@GetMapping("/my_books")
	public String MyBooks(Model model) {
		List<MyBookList> list = mbls.getAllMyBooks();
		model.addAttribute("book",list);
		return"myBooks";
	}
	
	@RequestMapping("/mylist/{id}")
	public String getMyList(@PathVariable int id) {
	  Book b = bs.getBookById(id);
	  MyBookList mb = new MyBookList(b.getId(),b.getName(),b.getAuthor(),b.getPrice());
	  mbls.saveMyBook(mb);
	  return"redirect:/my_books";
	}
	
	@RequestMapping("/editBook/{id}")
   public String editBook(@PathVariable int id ,Model m) {
		Book b = bs.getBookById(id);
		m.addAttribute("book", b);
	   return"BookEdit";
   }
	
	@RequestMapping("/deleteBook/{id}")
	public String deleteBook(@PathVariable int id) {
		bs.deleteById(id);
		 return"redirect:/available_book";
	}
}
