<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<title>join_fail.jsp</title>
</head>
<body>
<script type="text/javascript">
alert("회원가입 실패");
location.href="/Day17_board/member.do?action=join_form";
</script>
</body>
</html>