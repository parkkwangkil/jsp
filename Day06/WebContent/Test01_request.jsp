<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>Test01_request.jsp</title>
</head>
<body>
<%
// request�� ����ִ� �Ķ���Ϳ� �ѱ��� ���� ��츦 �����.
	request.setCharacterEncoding("euc-kr");
	String msg = request.getParameter("msg");
	String addr = request.getRemoteAddr();
	System.out.println(addr +"->msg:"+ msg);
%>
����� �����Ǵ� <%=addr%> �Դϴ�.<br>
</body>
</html>