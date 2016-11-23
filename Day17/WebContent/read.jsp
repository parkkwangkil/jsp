<%@page import="vo.ArticleVO"%>
<%@page import="service.BoardService"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<html>
<head>
<title>read.jsp</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>제목:</td>
			<td>${article.title}</td>
		</tr>
		<tr>
			<td>작성자:</td>
			<td>${article.id}</td>
		</tr>
		<tr>
			<td>조회수:</td>
			<td>${article.readCount}</td>
		</tr>
		<tr>
			<td>작성일:</td>
			<td>${article.writeDate}</td>
		</tr>
		<tr>
			<td>내용:</td>
			<td>${article.content}</td>
		</tr>
	</table>
<a href="board.do?action=main"><button>목록보기</button></a>
<c:if test="${sessionScope.loginId == article.id}">
<a href="board.do?action=updateForm&articleNum=${article.articleNum}">
	<button>수정</button>
</a>
<a href="board.do?action=delete&articleNum=${article.articleNum}">
	<button>삭제</button>
</a>
</c:if>
</body>
</html>




