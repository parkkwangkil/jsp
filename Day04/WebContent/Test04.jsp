<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Select</title>
</head>
<body>
<form method="get" action="SelectServlet">
<span style ="float : left; margin-right: 20px">
<label for="job"> ����</label>
<select id="job" name="job" size="1">
<option value=""> �����ϼ��� </option>
<option value="student"> �л� </option>
<option value="computer/internet"> ��ǻ�� / ���ͳ� </option>
<option value="messcom"> ��� </option>
<option value="savant">������ </option>
<option value="solder">����</option>
<option value="serviceup"> ���񽺾� </option>
<option value="teacher"> ���� </option>
</select>
</span>

<label for="interest" style="float: left;"> ���ɺо� </label>
<select id="interest" name="interest" size='1' multiple="multiple">
<option value="Kilimanjaro"> ų�����ڷ�</option>
<option value="Roastingl">�ν���</option>
<option value="caramel Macchiato">ī��� �����ƶ�</option>
<option value="cappuccino">īǪġ��</option>
<option value="cocoa">���ھ�</option>
</select><br><br>
<input type="submit" value="����" style="float:right;margin-right:50px">

</form>
</body>
</html>