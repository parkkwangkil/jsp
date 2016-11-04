<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<c:set var="price" value="3.14" />
���� : 
<fmt:formatNumber value="${price}" type="number" />
<br> ��ȭ :
<fmt:formatNumber value="${price}" type="currency" currencySymbol="$"/>
<br> �ۼ�Ʈ :
<fmt:formatNumber value="${price}" type="percent" groupingUsed="false" />
<br> ���� :
<fmt:formatNumber value="${price}" pattern="000000.000" /> 

</body>
</html>