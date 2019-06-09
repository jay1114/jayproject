<%@page import="java.util.List"%>
<%@page import="com.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<center>
<h1>User Information</h1>
<table border="10" bordercolor="red">

<tr>

<th>uid</th>
<th>Name</th>
<th>Lastname</th>
<th>Address</th>
<th>Pin</th>
<th>Username</th>
<th>Password</th>
<th>Edit</th>
<th>Delete</th>
</tr>

<%  
List<User> l1=(List<User>)request.getAttribute("data");

for(User u1:l1){
	
%>
<tr>
<td><%= u1.getId()  %></td>
<td><%= u1.getAddress()  %></td>
<td><%= u1.getLastName()  %></td>
<td><%= u1.getName()  %></td>
<td><%= u1.getPass()  %></td>
<td><%= u1.getPin() %></td>
<td><%= u1.getUserName() %></td>

<td> <a class="btn btn-success" href="edit?id=<%=u1.getId() %>"role="button">Edit</a></td>
<td> <a class="btn btn-danger" href="delete?id=<%=u1.getId() %> "role="button">Delete</a></td>
</tr>
<%}; %>
</table>
</center>
</body>
</html>