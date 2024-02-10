<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP:USEBEAN</title>
</head>
<body>
	<jsp:useBean id="obj" class="cal.Calc"/>
	
	<h1 align="center">
	<% 
		int m = obj.cube(5);
		out.print("Cube of 5 is "+m);
	%>
	</h1>
</body>
</html>