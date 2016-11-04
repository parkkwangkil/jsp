<%@page import="java.net.URLEncoder"%>
<%@page import="javax.swing.text.Document"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>login_check.jsp</title>
</head>
<body>
	<form action="login_status.jsp" method="get">
		<%
			String id = "park";
			String pw = "1111";
			if (id.equals(request.getParameter("id")) && pw.equals(request.getParameter("pw"))) {
				response.sendRedirect("log_out.jsp" + URLEncoder.encode(id, "UTF-8"));
				out.println("로그인 성공");
			} else {
				out.println("로그인 실패");
			}
		%>
		<%=id%>
		<%
			Cookie cookie = new Cookie("id", "park");
			Cookie cookie2 = new Cookie("pw", "1111");
			response.addCookie(cookie);
			cookie.setMaxAge(60);
			response.addCookie(new Cookie("id", "park"));
			response.addCookie(new Cookie("pw", "1111"));
		%>

		<a href="login_form.jsp"></a>
		<h3>쿠키 생성</h3>
</body>
</html>