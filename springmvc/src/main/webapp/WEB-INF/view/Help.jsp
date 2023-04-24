<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Help page</h1>

<% 
String name= (String)request.getAttribute("name");

Integer roll=(Integer)request.getAttribute("roll");
LocalDateTime time=( LocalDateTime ) request.getAttribute("time");
%>
<h2>My name is <%=name %></h2>
<h2>My roll no is <%=roll %></h2>
<h3>Time: <%=time.toString() %></h3>
my name is ${name}
</body>
</html>