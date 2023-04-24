<%@page import="springmvc.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
User user=(User)request.getAttribute("user");

%>

<h1> User name is <%= user.getName() %> </h1>

<h1>User email is <%= user.getEmail() %></h1>
 
</body>
</html>