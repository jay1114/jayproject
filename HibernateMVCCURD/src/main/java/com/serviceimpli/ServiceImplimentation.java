package com.serviceimpli;

import java.util.List;

import com.dao.Dao;
import com.daoimpli.DaoImplimentation;
import com.model.Login;
import com.model.User;
import com.service.Service;

public class ServiceImplimentation implements Service{

	Dao d=new DaoImplimentation();
	
	public int addUser(User e) {
		d.addUser(e);
		return 0;
	}

	public void deleteUser(int id) {
		
		d.deleteUser(id);
		
	}

	public 	List<User> updateUser(User e) {
		
		
		return d.updateUser(e);
	}

	public User editUser(int id) {
		
		return d.editUser(id) ;
	}

	public List<User> display() {
		List<User>list=d.display();
		return list;
	}

}
