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
Book b = new Book("jsp","�ڱ���",99999999);

%>
<c:set var="n" value="<%=name %>"></c:set>
�̸� : ${n}
<c:set var="book" value="<%=b %>"/><br>
å���� : ${book.title}<br>
���� : ${book.writer}<br> 
���� : ${book.price}<br>
</body>
</html>