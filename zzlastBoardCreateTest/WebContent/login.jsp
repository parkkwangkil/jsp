<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<c:if test="${not empty sessionScope.loginId}">

		<td><a href="BoardServlet?command=board_view&num=${board.num}">
	
</c:if>
<tr>
<td>
<c:if test="${empty sessionScope.loginId}">

		<td><a href="BoardServlet?command=board_view&num=${board.num}">
		
</c:if>

</body>
</html>