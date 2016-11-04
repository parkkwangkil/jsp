<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<title>delete_form.jsp</title>
</head>
<body>

	<form action="board.do" method="post">
		<input type="hidden" name="action" value="delete"> 
		<input type="hidden" name="articleId" value="${param.articleId}"> 
		패스워드:<input type="password" name="password" size="20"> 
		<input type="submit" value="완료">
	</form>

</body>
</html>