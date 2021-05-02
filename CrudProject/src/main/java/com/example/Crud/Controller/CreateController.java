package com.example.Crud.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Crud.Business.IBookService;
import com.example.Crud.Entities.Book;

@Controller
public class CreateController {

	private IBookService bookService;

	@Autowired
	public CreateController(IBookService bookService) {
		super();
		this.bookService = bookService;
	}
	
	@GetMapping("/create")
	public String getCreate(Model model, Book book) {
		model.addAttribute("book",book);
		return "bookCreate.html";
	}
	
	@PostMapping("/create")
	public String addBook(Model model, Book book) {
		model.addAttribute("book",book);
		bookService.insert(book);
		return "redirect:/menu";
	}
}
