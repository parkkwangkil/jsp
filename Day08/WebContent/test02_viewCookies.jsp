<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>test02_viewCookies.jsp</title>
</head>
<body>
	<h2>request�� ���� ��Ű�� ����� ������ ����.</h2>
	<%
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				out.println("��Ű�� �̸�:" + cookie.getName());
				out.println("��Ű�� ��:" + cookie.getValue());
				out.println("<hr>");
			}
		}
	%>

</body>
</html>