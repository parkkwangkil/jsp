<%@ page import="vo.Book" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>test02</title>
</head>
<body>
<%
	Book book = (Book)request.getAttribute("book");
%>
���� : <%=book.getTitle() %><br>
���� : ${requestScope.book.title}<br>
���� : ${book["title"] }<br>
������ 10000�� �̻��̰�? ${book.price>=10000}<br>
����Ʈ�� ����°�? ${empty bookList }<br>
���� + 5000 : ${book.price + 5000 }<br>
�ȶ��� ���� ��� : ${"10"+5}<br>
���ڿ� �� : ${"aaa" == "aaa" }<br>
bookList�� ũ�� : ${bookList.size() }<br>


</body>
</html>