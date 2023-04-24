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
Integer id=(Integer) request.getAttribute("id");
%>
<h1>This is path variable which pass data using url id: <%= id %> </h1>
</body>
</html>