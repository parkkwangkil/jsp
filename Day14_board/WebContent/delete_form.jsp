<%@page import="vo.ArticleVO"%>
<%@page import="service.BoardService"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>delete_form.jsp</title>
</head>
<body>
	<%
		String articleId = request.getParameter("articleId");
	%>

	<form action="board.do" method="post">
		<input type="hidden" name="action" value="delete"> 
		<input type="hidden" name="articleId" value="<%=articleId%>"> 
		�н�����:<input type="password" name="password" size="20"> 
		<input type="submit" value="�ۼ��Ϸ�">
	</form>
</body>
</html>