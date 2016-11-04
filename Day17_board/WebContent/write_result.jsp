<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>글쓰기 결과</title>
</head>
<body>

<h2>글쓰기 결과 : ${requestScope.writeResult}</h2>
<a href="board.do?action=main"><button>게시글 목록</button></a>
</body>
</html>