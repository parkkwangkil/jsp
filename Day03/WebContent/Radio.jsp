<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>����</title>
</head>
<body>
<form method="get" action="Radio">
<label for="gender"> ���� :</label>
<input type="radio" id="gender" name="gender" value="����" checked> ����
<input type="radio" id="gender" name="gender" value="����"> ���� <br><br>
<label for="chk_mail"> ���� ���� ����  : </label>
<input type="radio" id="chk_mail" name="chk_mail" value="yes" checked> ����
<input type="radio" id="chk_mail" name="chk_mail" value="no"> �ź� <br><br>
<label for="content"> ������ �����λ縦 �����ּ���</label>
<textarea id="content" name="content" rows="3" cols="35"></textarea> <br>
<input type="submit" value="����">
</form>

<br> <br>

<form method="post" action="Radio">
<label for="gender"> ���� :</label>
<input type="radio" id="gender" name="gender" value="����" checked> ����
<input type="radio" id="gender" name="gender" value="����"> ���� <br><br>
<label for="chk_mail"> ���� ���� ����  : </label>
<input type="radio" id="chk_mail" name="chk_mail" value="yes" checked> ����
<input type="radio" id="chk_mail" name="chk_mail" value="no"> �ź� <br><br>
<label for="content"> ������ �����λ縦 �����ּ���</label>
<textarea id="content" name="content" rows="3" cols="35"></textarea> <br>
<input type="submit" value="����">
</body>
</html>