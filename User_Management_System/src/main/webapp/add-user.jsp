<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add User</title>
</head>
<body>
	<form action="save-user">

		<input type="text" placeholder="Enter Name:" name="userName">
		<input type="email" placeholder="Enter Email:" name="userEmail">
		<input type="password" placeholder="Enter Password:" name="userPwd">
		<input type="submit">
	</form>
</body>
</html>