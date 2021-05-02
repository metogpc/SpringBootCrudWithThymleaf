package com.example.Crud.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Crud.Business.IBookService;
import com.example.Crud.Business.IUserService;
import com.example.Crud.Entities.Book;

@Controller
public class MenuController {

	private IBookService bookManager;

	@Autowired
	public MenuController(IBookService bookManager) {
		super();
		this.bookManager = bookManager;
	}
	
	@GetMapping("/menu")
	public String listBook(Model model) {
		List<Book> bookList=bookManager.getAll();
		model.addAttribute("bookList",bookList);
		//System.out.println(bookList.get(0).getId());
		return "menu";
	}
	
	@GetMapping("menu/delete/{id}")
	public String deleteBook(Model model, @PathVariable("id") int id) {
		Book book=bookManager.getById(id);
		bookManager.delete(book);
		return "redirect:/menu";
	}
	
	@GetMapping("/edit/{id}")
	public String getBook(Model model, @PathVariable("id") int id) {
		Book book=bookManager.getById(id);
		model.addAttribute("book",book);
		return "bookCreate.html";
	}
	
}
