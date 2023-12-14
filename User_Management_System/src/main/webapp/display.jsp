<%@page import="com.jsp.entity.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Display User</title>
</head>
	<body>
	<h1>Welcome User</h1>
	<a href="getuserbyid.jsp"></a>
		<%User u=(User)request.getAttribute("user");
		if(u!=null)
		{%>
		<h3>USER ID  :<%=u.getUserId()%></h3>
		<h3>USER NAME:<%=u.getUserName()%></h3>
		<h3>USER PWD :<%=u.getPassword()%></h3>
		<%}%>	 	
	</body>
</html>