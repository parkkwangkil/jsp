<%@page import="vo.ArticleVO"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<html>
<head>
<title>board_list.jsp</title>
</head>
<body>

	<h2>게시글 목록</h2>
	<table border="1">
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회수</th>
		</tr>
		<c:choose>
			<c:when test="${empty articlePage.articleList}">
				<tr>
					<td colspan="5">아직 게시글이 존재하지 않습니다.</td>
				</tr>
			</c:when>
			<c:otherwise>
				<c:forEach items="${articlePage.articleList}" var="article">

					<tr>
						<td>${article.articleId}</td>
						<td><a
							href="board.do?action=read&articleId=${article.articleId}">
								${article.title} </a></td>
						<td>${article.writer}</td>
						<td>${article.writeDate}</td>
						<td>${article.readCount}</td>
					</tr>
				</c:forEach>
			</c:otherwise>
		</c:choose>
	</table>
	<c:forEach begin="${articlePage.startPage}"
		end="${articlePage.endPage}" var="i">
		<a href="board.do?action=main&page=${i}"> [${i}] </a>
	</c:forEach>
	<hr>

	<a href="board.do?action=writeForm"><button>글쓰기</button></a>
</body>
</html>




