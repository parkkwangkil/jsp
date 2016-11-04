<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");

		if (id.equals("pkk") && pw.equals("1111")) {
			out.println("login ok<br>");
			Cookie cookie = new Cookie("loginId", id);
			response.addCookie(cookie);
		} else {
			out.println("login fail<br>");
		}
		
	%>
	<a href="cookie_login_status.jsp"><button>[login condition]</button></a>


</body>
</html>