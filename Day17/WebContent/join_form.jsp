<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>join_form.jsp</title>
</head>
<body>
<h3>ȸ������ ȭ��</h3>
<form action="member.do" method="post">
<table border="1">
	<tr>
		<td>���̵�</td>
		<td>
			<input type="text" name="id" size="20">
		</td>
	</tr>
	<tr>
		<td>��й�ȣ</td>
		<td>
			<input type="password" name="password" size="20">
		</td>
	</tr>
	<tr>
		<td>�̸�</td>
		<td>
			<input type="text" name="name" size="20">
		</td>
	</tr>
	<tr>
		<td>�̸���</td>
		<td>
			<input type="text" name="email" size="20">
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<input type="submit" value="����">
		</td>
	</tr>
</table>
	<input type="hidden" name="action" value="join">
</form>
</body>
</html>