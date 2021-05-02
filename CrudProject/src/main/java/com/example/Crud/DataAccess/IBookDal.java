package com.example.Crud.DataAccess;

import java.util.List;

import com.example.Crud.Entities.Book;
import com.example.Crud.Entities.User;

public interface IBookDal {

	List<Book> getAll();
	void update(Book book);
	void insert(Book book);
	void delete(Book book);
	Book getById(int id);
}
