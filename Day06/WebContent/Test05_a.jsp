<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<% 
	//Test05_a.jsp
	String n = request.getParameter("name");
	System.out.println("test05_a.jsp name:"+n);
	
	response.sendRedirect("test05_b.jsp");
%>

</body>
</html>