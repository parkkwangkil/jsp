<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<html>
<head>
<title>index.jsp</title>
</head>
<body>
<a href="member.do?action=joinForm">
	<button>회원가입</button>
</a><br>

<c:if test="${empty sessionScope.loginId}">
	<form action="member.do" method="post">
		ID:<input type="text" name="id" size="20"><br>
		PW:<input type="password" name="password" size="20">
		<input type="hidden" name="action" value="login">
		<input type="submit" value="로그인">	
	</form>
</c:if>

<c:if test="${not empty sessionScope.loginId}">
	${sessionScope.loginId} 님 반갑습니다.<br>
	<a href="member.do?action=logout">[로그아웃]</a>
</c:if>

<hr/>
<h3>이 부분이 게시판이 보여지는 공간 입니다.</h3>
<hr>
<a href="board.do">게시판 입장</a>
</body>
</html>