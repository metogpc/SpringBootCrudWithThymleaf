package com.example.Crud.DataAccess;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Crud.Entities.Book;
import com.example.Crud.Entities.User;

@Repository
public class HibernateBookDal implements IBookDal{

	private EntityManager entityManager;
	
	
	@Autowired
	public HibernateBookDal(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	
	@Override
	@Transactional
	public List<Book> getAll() {
		// TODO Auto-generated method stub
		Session session=entityManager.unwrap(Session.class);
		List<Book> books=session.createQuery("from Book").getResultList();
		return books;
	}

	@Override
	@Transactional
	public void update(Book book) {
		// TODO Auto-generated method stub
		Session session=entityManager.unwrap(Session.class);
		session.saveOrUpdate(book);
		
	}

	@Override
	@Transactional
	public void insert(Book book) {
		// TODO Auto-generated method stub
		Session session=entityManager.unwrap(Session.class);
		session.saveOrUpdate(book);
	}

	@Override
	@Transactional
	public void delete(Book book) {
		// TODO Auto-generated method stub
		Session session=entityManager.unwrap(Session.class);
		session.delete(book);
	}

	@Override
	@Transactional
	public Book getById(int id) {
		// TODO Auto-generated method stub
		Session session=entityManager.unwrap(Session.class);
		Book book=session.get(Book.class, id);
		return book;
	}

	
}
