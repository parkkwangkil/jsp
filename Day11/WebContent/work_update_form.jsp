<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h2> 업데이트 할꺼야?</h2>
	<form action="work_update.jsp" method="post">
		번호 : <input type="text" name="phoneid" size="20"><br>
		모델: <input type="text" name="title" size="20"><br> 
		제조사: <input type="text" name="publisher" size="20"><br> 
		가격:<input type="number" name="price" size="20"><br> 
		출시일 : <input type="text" name="year" size="10"><br> 
		<input type="submit" value="저장"> <br>
		<a href="work_index.jsp"> <button>메인화면으로</button>
</body>
</html>