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
		Cookie[] cookies = request.getCookies();
		Cookie loginCookie = null;

		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("loginId")) {
					loginCookie = cookie;
				}
			}
		}
		if (loginCookie == null) {
			out.println("로그인 정보가 없습니다.");
			out.println("<a href='cookie_login_Form.jsp'>  로그인 폼으로 가기</a>");
		} else {
			out.println(loginCookie.getValue() + "님이 로그인 중입니다.<br>");
			out.println("반가워");
			out.println("<a href='cookie_logout.jsp'>로그 아웃</a>");
		}
	%>


</body>
</html>