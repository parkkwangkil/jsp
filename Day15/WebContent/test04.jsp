<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<h2> c:if �±� Ȱ���غ���</h2>
<c:if test="true">
�� ������ ������ html �������� ���Դϴ�.
</c:if>
<c:if test="true">
�̳����� ���ϱ�?
</c:if>
<c:if test = "${param.name == 'park'}">
hi park�� 
</c:if>

<c:if test="${param.age>20}">
�����Դϴ�.
</c:if>

<c:if test="${param.age<20}">
�� �� �� �ڳ�

</c:if>
</body>
</html>