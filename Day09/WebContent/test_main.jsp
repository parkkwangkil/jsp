<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>main.jsp</title>
</head>
<body>
	<%
		if (session.getAttribute("loginUser") == null) {
			response.sendRedirect("test_loginForm.jsp");
		} else {
	%>
	<%=session.getAttribute("loginUser")%>
	님 반갑습니다.<br>
	홈페이지에 오신 것을 환영합니다.<br>
	즐거운 시간 되세요.<br>
	
	<form method="post" action="test_logout.jsp"> 
	<input type="submit" value="로그아웃"> </from>
	<%
		}
	%>
	<br>

</body>
</html>