<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>test04_deleteCookie.jsp</title>
</head>
<body>
<% 
Cookie cookie = new Cookie("cookie","");
cookie.setMaxAge(0);
response.addCookie(cookie);
%>
<h2> test04_deleteCookie.jsp</h2>
cookie를 삭제 합니다.
</body>
</html>