<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>�� ������ִ� JSP</title>
</head>
<body>
	<h2>JSP ������ ������ִ� HTML ȭ�� �Դϴ�.*get*</h2>
	<form action="JavaTest01" method="get">
			Ŭ���̾�Ʈ�� �̸��� �Է�<br>
	<input type="text" name="clientName" size="20">
	<input type="submit" value="����">
	</form>
	
	<h2>JSP ������ ������ִ� HTML ȭ�� �Դϴ�.*post*</h2>
	<form action="JavaTest01" method="post">
			Ŭ���̾�Ʈ�� �̸��� �Է�<br>
	<input type="text" name="clientName" size="20">
	<input type="submit" value="����">
	</form>
</body>
</html>