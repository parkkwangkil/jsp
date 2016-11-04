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
제목 : <%=book.getTitle() %><br>
제목 : ${requestScope.book.title}<br>
제목 : ${book["title"] }<br>
가격이 10000원 이상이가? ${book.price>=10000}<br>
리스트가 비었는가? ${empty bookList }<br>
가격 + 5000 : ${book.price + 5000 }<br>
똑똑한 숫자 계산 : ${"10"+5}<br>
문자열 비교 : ${"aaa" == "aaa" }<br>
bookList의 크기 : ${bookList.size() }<br>


</body>
</html>