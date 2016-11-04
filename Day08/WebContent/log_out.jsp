<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>log.out.jsp</title>
</head>
<body>
<% 
Cookie cookie = new Cookie("id","");
Cookie cookie2 = new Cookie("pw","");
cookie.setMaxAge(60);
response.addCookie(cookie);

%>
<h3> 쿠키가 삭제 되었습니다.</h3>
쿠키 삭제 확인 하세요
</a>

</body>
</html>