<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>write_form.jsp</title>
</head>
<body>
	<form action="write.jsp" method="post">
		<table border="1">
			<tr>
				<td>����</td>
				<td><input type="text" name="title" size="30"></td>
			</tr>
			<tr>
				<td>�ۼ���</td>
				<td><input type="text" name="writer" size="30"></td>
			</tr>
			<tr>
				<td>��ȣ</td>
				<td><input type="password" name="password" size="30"></td>
			</tr>
			<tr>
				<td>����</td>
				<td><textarea rows="10" cols="30" name="content" placeholder="���⿡ ������ �Է�"></textarea>
				</td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="�ۼ��Ϸ�">
		</table>
		<a href="board_list.jsp">�������</a>
	</form>
</body>
</html>