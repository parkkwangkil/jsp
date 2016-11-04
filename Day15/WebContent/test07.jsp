<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%

	String[] movieList ={"닥터스트레인지","캡틴아메리카","배트맨","수퍼맨","저스티스리그","어벤저스"};
	pageContext.setAttribute("movieList", movieList);
%>
<ul>
<c:forEach var="movie" items="${movieList}" varStatus="status">
<c:choose>
<c:when test="${status.first}">
<li style="font-weight: bold; color; red;">${movie}</li>
</c:when>
<c:otherwise>
<li> ${movie}</li>
</c:otherwise>
</c:choose>
</c:forEach>
</ul>
<c:forEach var="movie" items="${movieList}" varStatus="status">
${movie} <c:if test="${not status.last}"></c:if>
</c:forEach>
</body>
</html>