<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Cookie logoutCookie = new Cookie("logId","");
logoutCookie.setMaxAge(0);
response.addCookie(logoutCookie);
%>
로그 아웃 완료 <br>
<a href="cookie_login_form.jsp">로그인 하러 가기 </a><br>
<a href="cookie_login_status.jsp"> 로그인 상태 보기 </a><br>

</body>
</html>