
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<c:set var="now" value="<%= new Date() %>"/>
<fmt:formatDate value="${now}" type="date" dateStyle="full"/><br>
<fmt:formatDate value="${now}" type="date" dateStyle="short"/><br>
<fmt:formatDate value="${now}" type="date" timeStyle="full"/><br>
<fmt:formatDate value="${now}" type="date" timeStyle="short"/><br>
<fmt:formatDate value="${now}" type="both" dateStyle="short" timeStyle="short"/><br>
<fmt:formatDate value="${now}" pattern="z yy/MM/dd a hh:mm:ss"/>
</body>
</html>