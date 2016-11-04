<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>글쓰기 결과</title>
</head>
<body>
<%
	int writeResult = (Integer)request.getAttribute("writeResult");
%>
<h2>글쓰기 결과 : ${requestScope.writeResult}</h2>
<a href="board.do?action=main"><button>게시글 목록</button></a>
</body>
</html>