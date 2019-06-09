package com.service;

import java.util.List;

import com.model.User;

public interface Service {

	public int addUser(User e);
	public void deleteUser(int id);
	public 	List<User> updateUser(User e);
	public User editUser(int id);
	public List<User> display();
	
	

}
