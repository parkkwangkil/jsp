<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>test05_logout.jsp</title>
</head>
<body>
<%

Cookie logoutCookie = new Cookie("logId","");
logoutCookie.setMaxAge(0);
response.addCookie(logoutCookie);
%>
�α׾ƿ� �Ϸ�<br>
<a href="test05_login_form.jsp">�α��� �Ϸ����� </a><br>
<a href="test05_login_status.jsp"> �α� �� ���� ����</a><br>
</body>
</html>