<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="test04_update.jsp" method="post">
		제목:	<input type="text" name="title" size="20"><br>
		출판사:	<input type="text" name="publisher" size="20"><br>
		출판년도:<input type="text" name="year" size="10"><br>
		가격:	<input type="number" name="price" size="20"><br>
		<input type="submit" value="저장">
<a href="test04_index.jsp">
		<button>메인화면으로</button>
	</a>
</form>
</body>
</html>