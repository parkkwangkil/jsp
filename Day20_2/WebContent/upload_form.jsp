<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>upload_form.jsp</title>
</head>
<body>
<form action="file.do" method="post" enctype="multipart/form-data">
�Ķ���� : <input type="text" name="param"><br>
���ϼ��� : <input type="file" name="uploadFile"><br>
<input type="submit" value="���ε�">
</form>
</body>
</html>