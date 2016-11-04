<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<h2> c:if 태그 활용해보기</h2>
<c:if test="true">
이 내용은 무조건 html 문서에서 쓰입니다.
</c:if>
<c:if test="true">
이내용은 쓰일까?
</c:if>
<c:if test = "${param.name == 'park'}">
hi park님 
</c:if>

<c:if test="${param.age>20}">
성인입니다.
</c:if>

<c:if test="${param.age<20}">
미 성 년 자네

</c:if>
</body>
</html>