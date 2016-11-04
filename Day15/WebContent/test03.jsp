<%@page import="vo.Book"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<html>
<head>
<title>test03.jsp</title>
</head>
<body>
<% 
String name="park";
Book b = new Book("jsp","박광길",99999999);

%>
<c:set var="n" value="<%=name %>"></c:set>
이름 : ${n}
<c:set var="book" value="<%=b %>"/><br>
책제목 : ${book.title}<br>
저자 : ${book.writer}<br> 
가격 : ${book.price}<br>
</body>
</html>