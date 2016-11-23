<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>upload_form.jsp</title>
</head>
<body>
<form action="file.do" method="post" enctype="multipart/form-data">
파라미터 : <input type="text" name="param"><br>
파일선택 : <input type="file" name="uploadFile"><br>
<input type="submit" value="업로드">
</form>
</body>
</html>