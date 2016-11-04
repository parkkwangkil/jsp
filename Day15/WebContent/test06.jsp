<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>test06</title>
</head>
<body>
	<h2>c:foreach 태그 활용해보기</h2>
	<c:forEach var="i" begin="1" end="9" step="2">
	3 x ${i} = ${3*i}<br>
	</c:forEach>
	<%
		String[] words = { "aaa", "bbb", "ccc","ddd","eee" };
		request.setAttribute("wordArray", words);
	%>
	<hr>
	<c:forEach items="${wordArray}" var="word">
	단어 : <b>${word}</b>
		<br>
	</c:forEach>

	<hr>
	<c:forEach items="${wordArray}" var="word" begin="2" end="4" varStatus="status">
	단어 : <b>${word}</b>${status.index} - ${status.count}<br>
	</c:forEach>




</body>
</html>