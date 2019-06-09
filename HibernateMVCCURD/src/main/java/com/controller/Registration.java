package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.User;
import com.model.UserDetails;
import com.service.Service;
import com.serviceimpli.ServiceImplimentation;

@WebServlet("/register")
public class Registration extends HttpServlet {

 User u=new User();
     
 @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	Service s=new ServiceImplimentation();	
	 u.setName(req.getParameter("name"));
	 u.setLastName(req.getParameter("lastName"));
	 u.setAddress(req.getParameter("address"));
	 u.setPin(req.getParameter("pin"));
	 u.setUserName(req.getParameter("userName"));
	 u.setPass(req.getParameter("pass"));
	 List<User>list=s.display();
	 req.setAttribute("data", list);
	 
	 RequestDispatcher rd=req.getRequestDispatcher("Success.jsp");
	 rd.forward(req, resp);
		s.addUser(u);
	}
	
	
}
