<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<html>
<head>
<title>index.jsp</title>
</head>
<body>
<a href="member.do?action=joinForm">
	<button>ȸ������</button>
</a><br>

<c:if test="${empty sessionScope.loginId}">
	<form action="member.do" method="post">
		ID:<input type="text" name="id" size="20"><br>
		PW:<input type="password" name="password" size="20">
		<input type="hidden" name="action" value="login">
		<input type="submit" value="�α���">	
	</form>
</c:if>

<c:if test="${not empty sessionScope.loginId}">
	${sessionScope.loginId} �� �ݰ����ϴ�.<br>
	<a href="member.do?action=logout">[�α׾ƿ�]</a>
</c:if>

<hr/>
<h3>�� �κ��� �Խ����� �������� ���� �Դϴ�.</h3>
<hr>
<a href="board.do">�Խ��� ����</a>
</body>
</html>