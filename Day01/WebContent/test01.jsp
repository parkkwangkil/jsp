<%@ page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<html>
<head>
<title>��Ŭ���� ù��° jsp </title>
</head>
<body> 
	<% 
		Date now = new Date(); 
	%>
	��Ŭ�������� �ۼ��� ù��° ������Ʈ<br>
	���� �ð� :<%=now %> <br>
	�ݰ����ϴ�.
</body>
</html>