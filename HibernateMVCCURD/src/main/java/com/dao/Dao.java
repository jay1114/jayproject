package com.dao;

import java.util.List;

import com.model.Login;
import com.model.User;
import com.model.UserDetails;

public interface Dao {

	public int addUser(User e);
	public void deleteUser(int id);
	public 	List<User> updateUser(User e);
	public User editUser(int id);
	public  List<User> display();
}
