<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>delete_form.jsp</title>
</head>
<body>

<form action="board.do" method="post">
	<input type="hidden" name="action" value="delete">
	<input type="hidden" name="articleNum" value="${param.articleNum}">
	<input type="submit" value="�Ϸ�">
</form>

</body>
</html>