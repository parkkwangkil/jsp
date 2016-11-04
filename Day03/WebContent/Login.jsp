<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>로그인</title>
</head>
<body>
<h2> get </h2>
<form method="get" action="Login">
<label for="userid"> 아이디</label>
<input type="text" name="id" id="userid"><br>

<label for="userpwd"> 암  &nbsp; 호 : </label>
<input type="password" name="pwd" id="userpwd"><br>
<input type="submit" value="로그인"> 
</form>

<h2> post </h2>
<form method="post" action="Login">
<label for="userid"> 아이디</label>
<input type="text" name="id" id="userid"><br>

<label for="userpwd"> 암  &nbsp; 호 : </label>
<input type="password" name="pwd" id="userpwd"><br>
<input type="submit" value="로그인"> 
</form>
</body>
</html>