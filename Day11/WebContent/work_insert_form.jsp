<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>work_insert_form</title>
</head>
<body>
	<h2>�� ������ db�� �Է�</h2>
	<form action="work_insert.jsp" method="post">
		��: <input type="text" name="model" size="20"><br> ������: <input
			type="text" name="manufacturer" size="20"> <br> ����:<input
			type="number" name="price" size="20"><br> ������: <input
			type="text" name="year" size="10"><br> <input
			type="submit" value="����">
	</form>

	<a href="work_index.jsp">
		<button>����ȭ������</button>
	</a>

</body>
</html>