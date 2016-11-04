<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>sessionloginform.jsp</title>
</head>
<body>

<form action="session_login_check.jsp" method="post">

<label for="userId"> id</label>
<input type="text" name="id" id=userId" placeholder="input please id"><br>
<input type="checkbox" name="id" id="userId"> 아이디 입력하세요.<br> 
<label for="userPw"> pw></label>
<input type="password" name="pw" pw="userPw" placeholder="input please password "> 

<input type="submit" value="login">
<%
session.setMaxInactiveInterval(60);
%>
</body>
</html>