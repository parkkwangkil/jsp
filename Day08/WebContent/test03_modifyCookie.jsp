<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>test03_modifyCookie.jsp</title>
</head>
<body>
<% 
Cookie cookie = new Cookie("cookie","cook2");
cookie.setMaxAge(60);
response.addCookie(cookie);

%>
<h2>test03_modify.jsp</h2>
cookie1���� �����Ͽ� �߱� �Ͽ����ϴ�.
������ 60�ʷ� ���� �߽��ϴ�.
</body>
</html>