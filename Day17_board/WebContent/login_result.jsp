<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<c:if test="${not empty sessionScope.loginId }">
		<script type="text/javascript">
			alert("로그인 성공")
			location.href = "/Day17_board/";
		</script>
	</c:if>
	<c:if test="${empty sessionScope.loginId}">
		<script type="text/javascript">
			alert("로그인 실패")
			location.href = "/Day17_board/";	ㅣ
		</script>
	</c:if>
</body>
</html>