<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<title>delete_result.jsp</title>
</head>
<body>

	<h2>삭제 결과 화면</h2>
	결과 : ${deleteResult}<br>
	<a href="board.do?action=main"><button>게시글 목록</button></a>
</body>
</html>