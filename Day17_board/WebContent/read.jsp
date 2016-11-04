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
			<td>����:</td>
			<td>${article.title}</td>
		</tr>
		<tr>
			<td>�ۼ���:</td>
			<td>${article.id}</td>
		</tr>
		<tr>
			<td>��ȸ��:</td>
			<td>${article.readCount}</td>
		</tr>
		<tr>
			<td>�ۼ���:</td>
			<td>${article.writeDate}</td>
		</tr>
		<tr>
			<td>����:</td>
			<td>${article.content}</td>
		</tr>
	</table>
<a href="board.do?action=main"><button>��Ϻ���</button></a>
<c:if test="${sessionScope.loginId == article.id}">
<a href="board.do?action=updateForm&articleNum=${article.articleNum}">
	<button>����</button>
</a>
<a href="board.do?action=delete&articleNum=${article.articleNum}">
	<button>����</button>
</a>
</c:if>
</body>
</html>




