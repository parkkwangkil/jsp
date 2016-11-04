<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>test10</title>
</head>
<body>

	<h2>»ò¾î</h2>
	<c:forEach var="item" items="${paramValues.item }" varStatus="status">
	${item}<c:if test="${not status.last}">,</c:if>


	</c:forEach>
</body>
</html>