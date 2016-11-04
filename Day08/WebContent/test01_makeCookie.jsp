<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>test01_makeCookie.jsp</title>
</head>
<body>
<% 
	Cookie cookie = new Cookie("cookie","sds902");
	response.addCookie(cookie);
%>
<h2>test01_makeCookie.jsp</h2>
<h3> 쿠키가 발급 되었습니다.</h3>
</body>
</html>