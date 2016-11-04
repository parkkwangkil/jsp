

<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<% 

String n = request.getParameter("name");
System.out.println("Test06_a.jsp name:"+n);

RequestDispatcher dispatcher = 
request.getRequestDispatcher("Test06_b.jsp");
dispatcher.forward(request, response);
%>

</body>
</html>