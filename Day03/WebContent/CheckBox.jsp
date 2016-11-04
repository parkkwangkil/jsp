<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>체크박스</title>
</head>
<body>
<h2> 악세사리 </h2>
관심항목을 선택하세요<hr>
<form method="get" action="CheckBox">
<input type="checkbox" name="item" value="신발">신발
<input type="checkbox" name="item" value="가방">가방
<input type="checkbox" name="item" value="벨트">벨트<br>
<input type="checkbox" name="item" value="모자">모자
<input type="checkbox" name="item" value="시계">시계
<input type="checkbox" name="item" value="보석">보석<br>
<input type="submit" value="전송"> 
</form>
</body>
</html>