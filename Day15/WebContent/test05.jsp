<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<h2>c:choose, c:when, c:otherwise 태그 활용해보기</h2>
	<c:choose>
		<c:when test="${param.select==1}">
			일<br>
		</c:when>
		<c:when test="${param.select==2}">
			이<br>
		</c:when>
		<c:otherwise>
			삼사오육칠팔구십<br>
		</c:otherwise>
	</c:choose>
</body>
</html>