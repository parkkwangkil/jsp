<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<h2>c:choose, c:when, c:otherwise �±� Ȱ���غ���</h2>
	<c:choose>
		<c:when test="${param.select==1}">
			��<br>
		</c:when>
		<c:when test="${param.select==2}">
			��<br>
		</c:when>
		<c:otherwise>
			������ĥ�ȱ���<br>
		</c:otherwise>
	</c:choose>
</body>
</html>