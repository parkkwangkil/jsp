<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	>
	<form action="Test02_form.jsp" method="post">
		<table>
			<tr>
				<td>�̸� :</td>
				<td><input type="text" name="name" size="20"></td>
			</tr>
			<tr>
				<td>���� :</td>
				<td><input type="radio" name="gender" value="male"
					checked="checked"> ���� <input type="radio" name="gender"
					value="female"> ����</td>
			</tr>
			<tr>
				<td>�����ϴ� ����</td>
				<td><input type="checkbox" name="season" value="1">�� <input
					type="checkbox" name="season" value="2" checked="checked">����
					<input type="checkbox" name="season" value="3">���� <input
					type="checkbox" name="season" value="4">�ܿ�</td>
			</tr>
			<tr align="center">
				<td><input type="submit" value="����"></td>
				<td><input type="reset" value="���"></td>
			</tr>
		</table>
	</form>
</body>
</html>