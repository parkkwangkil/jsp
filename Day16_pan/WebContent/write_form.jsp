<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>write_form.jsp</title>
</head>
<body>
<form action="board.do" method="post">
	<input type="hidden" name="action" value="write">
	<table border="1">
		<tr>
			<td>����</td>
			<td>
				<input type="text" name="title" size="30">
			</td>
		</tr>
		<tr>
			<td>�ۼ���</td>
			<td>
				<input type="text" name="writer" size="30">
			</td>
		</tr>
		<tr>
			<td>��ȣ</td>
			<td>
				<input type="password" name="password" size="30">
			</td>
		</tr>
		<tr>
			<td>����</td>
			<td>
			<textarea rows="10" cols="30" name="content"
				placeholder="���⿡ ������ �Է��ϼ���."></textarea> 
			</td>
		</tr>
		<tr>
			<td colspan="2">
			<input type="submit" value="�ۼ��Ϸ�">
			</td>
		</tr>
	</table>
</form>
</body>
</html>