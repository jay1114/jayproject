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
<%User u=(User)request.getAttribute("data");

%>
<form action="update">
<pre>
uid: <input type="text" value="<%= u.getId() %>" name="uid"><br>

name: <input type="text" value="<%= u.getName() %>" name="name"><br>
Lastname: <input type="text" value="<%= u.getLastName() %>" name="lastName"><br>
address: <input type="text" value="<%= u.getAddress() %>" name="address"><br>
Pin: <input type="text" value="<%= u.getPin() %>" name="pin"><br>
Username: <input type="text" value="<%= u.getUserName() %>" name="userName"><br>
Password: <input type="text" value="<%= u.getPass() %>" name="pass"><br>

<input type="submit" value="Submit" /><br>

</pre>
</form>


</body>
</html>