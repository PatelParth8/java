<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="u" class="user.User"/>
	<jsp:setProperty property="*" name="u"/>
	
	<h4 align="center">
		Records :
		<br>
		
		<jsp:getProperty property="name" name="u"/><br>
		<jsp:getProperty property="password" name="u"/><br>
		<jsp:getProperty property="email" name="u"/><br>
	</h4>
	<h6 align="center">
		<a href="NewFile.html">HTML Page</a>
	</h6>
</body>
</html>