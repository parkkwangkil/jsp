<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>write_form.jsp</title>
</head>
<body>
<form action="board.do" method="post">
	<input type="hidden" name="action" value="write">
	<table border="1">
		<tr>
			<td>제목</td>
			<td>
				<input type="text" name="title" size="30">
			</td>
		</tr>
		<tr>
			<td>내용</td>
			<td>
			<textarea rows="10" cols="30" name="content"
				placeholder="여기에 내용을 입력하세요."></textarea> 
			</td>
		</tr>
		<tr>
			<td colspan="2">
			<input type="submit" value="작성완료">
			</td>
		</tr>
	</table>
</form>
</body>
</html>