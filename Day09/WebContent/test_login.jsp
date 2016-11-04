<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>test_login</title>
</head>
<body>
	<%
		String id = "pkk";
		String pw = "1111";
		String name = "박광길";

		if (id.equals(request.getParameter("id")) && pw.equals(request.getParameter("pw"))) {
			session.setAttribute("loginUser", name);
			response.sendRedirect("test_main.jsp");
		} else {
			response.sendRedirect("test_loginForm.jsp");
		}
	%>

</body>
</html>