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
		if (session.getAttribute("loginUser") == null) {
			response.sendRedirect("session_login_form.jsp");

		} else {
	%>
	<%=session.getAttribute("loginUser")%>님 안녕하세요
	<br>
	<form method="post" action="session_logout.jsp">
		<input type="submit" value="logout">
	</form>
	<%
		}
	%>
</body>
</html>