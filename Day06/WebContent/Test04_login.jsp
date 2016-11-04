<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%><!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<% 
	String id="pkk";
	String pw="111";
	String name="박광길";
	request.setCharacterEncoding("UTF-8");
	if(id.equals(request.getParameter("id")) && pw.equals(request.getParameter("pw"))){
	response.sendRedirect("Test04_main.jsp?name="+URLEncoder.encode(name, "UTF-8"));
	}
	else{
		response.sendRedirect("Test04_loginForm.jsp");
	}
%>

</body>
</html>