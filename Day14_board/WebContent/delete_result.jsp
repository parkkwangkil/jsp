<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<% int deleteResult = (Integer) request.getAttribute("deleteResult"); %>

<h2> 삭제 결과 확인 </h2>
결과 <%=deleteResult %>
<a href="board.do?action=main"><buttom>게시글 목록</buttom></a>
</body>
</html>