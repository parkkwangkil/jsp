<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>�۾��� ���</title>
</head>
<body>
<%
	int writeResult = (Integer)request.getAttribute("writeResult");
%>
<h2>�۾��� ��� : ${requestScope.writeResult}</h2>
<a href="board.do?action=main"><button>�Խñ� ���</button></a>
</body>
</html>