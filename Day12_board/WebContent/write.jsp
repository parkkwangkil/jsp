<%@page import="service.BoardService"%>
<%@page import="vo.ArticleVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("euc-kr");
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		String content = request.getParameter("content");
		String password = request.getParameter("password");

		ArticleVO article = new ArticleVO();
		article.setTitle(title);
		article.setWriter(writer);
		article.setContent(content);
		article.setPassword(password);
		
		BoardService service = BoardService.getInstance();
		int result = service.write(article);
	%>
	
	�۾��� ��� :<%=result %><br>
	<a href="board_list.jsp"><button> ������� </button></a>
</body>
</html>