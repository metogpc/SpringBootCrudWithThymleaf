package com.example.Crud.Business;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Crud.DataAccess.IBookDal;
import com.example.Crud.Entities.Book;

@Repository
public class BookManager implements IBookService{

	private IBookDal bookDal;
	
	@Autowired
	public BookManager(IBookDal bookDal) {
		super();
		this.bookDal = bookDal;
	}

	@Override
	@Transactional
	public List<Book> getAll() {
		// TODO Auto-generated method stub
		return bookDal.getAll();
	}

	@Override
	@Transactional
	public void update(Book book) {
		// TODO Auto-generated method stub
		bookDal.update(book);
	}

	@Override
	@Transactional
	public void insert(Book book) {
		// TODO Auto-generated method stub
		bookDal.insert(book);
	}

	@Override
	@Transactional
	public void delete(Book book) {
		// TODO Auto-generated method stub
		bookDal.delete(book);
	}

	@Override
	@Transactional
	public Book getById(int id) {
		// TODO Auto-generated method stub
		return bookDal.getById(id);
	}

	
}
