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
	�� �ݰ����ϴ�.<br>
	Ȩ�������� ���� ���� ȯ���մϴ�.<br>
	��ſ� �ð� �Ǽ���.<br>
	
	<form method="post" action="test_logout.jsp"> 
	<input type="submit" value="�α׾ƿ�"> </from>
	<%
		}
	%>
	<br>

</body>
</html>