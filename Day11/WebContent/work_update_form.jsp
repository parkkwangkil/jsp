<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h2> ������Ʈ �Ҳ���?</h2>
	<form action="work_update.jsp" method="post">
		��ȣ : <input type="text" name="phoneid" size="20"><br>
		��: <input type="text" name="title" size="20"><br> 
		������: <input type="text" name="publisher" size="20"><br> 
		����:<input type="number" name="price" size="20"><br> 
		����� : <input type="text" name="year" size="10"><br> 
		<input type="submit" value="����"> <br>
		<a href="work_index.jsp"> <button>����ȭ������</button>
</body>
</html>