<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>test05_logout.jsp</title>
</head>
<body>
<%

Cookie logoutCookie = new Cookie("logId","");
logoutCookie.setMaxAge(0);
response.addCookie(logoutCookie);
%>
로그아웃 완료<br>
<a href="test05_login_form.jsp">로그인 하러가기 </a><br>
<a href="test05_login_status.jsp"> 로그 인 상태 보기</a><br>
</body>
</html>