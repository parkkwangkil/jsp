<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>책 입고 내용 입력</h2>
	<form action="test02_insert.jsp" method="post">
		제목:	<input type="text" name="title" size="20"><br>
		출판사:	<input type="text" name="pub" size="20"><br>
		출판년도:<input type="text" name="year" size="10"><br>
		가격:	<input type="number" name="price" size="20"><br>
		<input type="submit" value="저장">
	</form>

</body>
</html>