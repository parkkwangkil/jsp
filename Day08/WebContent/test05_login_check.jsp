<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<% 

String id = request.getParameter("id");
String pw = request.getParameter("pw");

if(id.equals("pkk")&& pw.equals("1234")){
	out.println("로그인 성공 <br>");
	Cookie cookie = new Cookie("loginId",id);
	response.addCookie(cookie);
}else{
	out.println("로그인 실패 <br>");
}
%>
<a href="test05_login_status.jsp"><button>[로그인 상태보기]</button></a>
</body>
</html>