package com.controller;

import java.io.IOException;
import java.util.List;

import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Login;

import com.service.Service;
import com.serviceimpli.ServiceImplimentation;
import com.util.HibernateUtil;
@WebServlet("/delete")
public class Delete<User> extends HttpServlet{
   
	       Session session=HibernateUtil.getSessionFactory().openSession();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Service s=new ServiceImplimentation();
		Login l=new Login();
		int id=Integer.parseInt(req.getParameter("id"));
		l.setId(id);
		s.deleteUser(id);
		List<com.model.User>list=s.display();
		req.setAttribute("data", list);
		req.getRequestDispatcher("Success.jsp").forward(req, resp);
		
	}
	
	
	
}
