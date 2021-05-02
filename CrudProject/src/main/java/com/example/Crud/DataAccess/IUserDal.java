package com.example.Crud.DataAccess;
import java.util.List;

import com.example.Crud.Entities.User;

public interface IUserDal {
	List<User> getAll();
	void update(User user);
	void insert(User user);
	void delete(User user);
	User getById(int id);
	
}
