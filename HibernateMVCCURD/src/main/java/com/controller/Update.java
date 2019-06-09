package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Dao;
import com.daoimpli.DaoImplimentation;
import com.model.Login;
import com.model.User;
import com.service.Service;
import com.serviceimpli.ServiceImplimentation;

@WebServlet("/update")
public class Update  extends HttpServlet{
@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	User user=new User();	
	Service service=new ServiceImplimentation();
	
	/*int id=Integer.parseInt(req.getParameter("id"));
	user.setId(id);*/
	user.setId(Integer.parseInt(req.getParameter("uid")));
	user.setName(req.getParameter("name"));
	user.setLastName(req.getParameter("lastName"));
	user.setName(req.getParameter("userName"));
	user.setPass(req.getParameter("pass"));
    user.setAddress(req.getParameter("address"));
	user.setPin(req.getParameter("pin"));

	List<User> list=service.updateUser(user);	
	req.setAttribute("data", list);
	req.getRequestDispatcher("login.jsp").forward(req, resp);
}
}