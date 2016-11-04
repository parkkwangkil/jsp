<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>work_insert_form</title>
</head>
<body>
	<h2>폰 정보를 db에 입력</h2>
	<form action="work_insert.jsp" method="post">
		모델: <input type="text" name="model" size="20"><br> 제조사: <input
			type="text" name="manufacturer" size="20"> <br> 가격:<input
			type="number" name="price" size="20"><br> 생산일: <input
			type="text" name="year" size="10"><br> <input
			type="submit" value="저장">
	</form>

	<a href="work_index.jsp">
		<button>메인화면으로</button>
	</a>

</body>
</html>