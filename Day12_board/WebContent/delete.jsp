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


	String articleIdStr = request.getParameter("articleId");
	int articleId = 0;
	
	if(articleIdStr!=null && articleIdStr.length()>0){
		articleId = Integer.parseInt(articleIdStr);
	}

	ArticleVO article = new ArticleVO();
	article.setArticleId(articleId);
	
	BoardService service = BoardService.getInstance();
	int result = service.delete(article);
	out.println("�����ϱ� ���� ���:" +result+ "<br>");
	if(result>0){
%>
		<h2>���� �Ϸ�</h2>
<%	} else {%>
		<h2>���� ����</h2>
<%	} %>
	<a href="board_list.jsp"><button>�������</button></a>
</body>
</html>






</body>
</html>