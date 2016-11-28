<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>

</head>
<body>
	<div id="wrap" align="center">
		<h1>인기 리스트</h1>
		<table class="list">
			<c:forEach var="board" items="${boardPopularList}">
				<tr class="record">
					<td>${board.title}</td>
					<td>${board.content}</td>
					<td>${board.videoPath}
					<iframe src="${board.videoPath}"></iframe></td>
					<td>${board.imagePath}
					<img src="${board.imagePath}"></img></td>
					
				</tr>
			</c:forEach>
		</table>
	</div>

</body>
</html>