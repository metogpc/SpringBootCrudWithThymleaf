package com.example.Crud.Business;

import java.util.List;

import com.example.Crud.Entities.Book;

public interface IBookService {

	List<Book> getAll();
	void update(Book book);
	void insert(Book book);
	void delete(Book book);
	Book getById(int id);
	
}
