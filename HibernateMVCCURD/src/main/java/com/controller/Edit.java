package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;

import com.model.User;
import com.service.Service;
import com.serviceimpli.ServiceImplimentation;

@WebServlet("/edit")
public class Edit extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Service service=new ServiceImplimentation();

	int id=Integer.parseInt(req.getParameter("id"));
	User use=service.editUser(id);
	req.setAttribute("data", use);
	req.getRequestDispatcher("Update.jsp").forward(req, resp);
}}



