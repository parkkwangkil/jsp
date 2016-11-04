<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>폼 만들어주는 JSP</title>
</head>
<body>
	<h2>JSP 서블릿이 만들어주는 HTML 화면 입니다.*get*</h2>
	<form action="JavaTest01" method="get">
			클라이언트의 이름을 입력<br>
	<input type="text" name="clientName" size="20">
	<input type="submit" value="전송">
	</form>
	
	<h2>JSP 서블릿이 만들어주는 HTML 화면 입니다.*post*</h2>
	<form action="JavaTest01" method="post">
			클라이언트의 이름을 입력<br>
	<input type="text" name="clientName" size="20">
	<input type="submit" value="전송">
	</form>
</body>
</html>