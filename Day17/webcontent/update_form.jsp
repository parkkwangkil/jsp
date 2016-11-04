<%@page import="vo.ArticleVO"%>
<%@page import="service.BoardService"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>update_form.jsp</title>
</head>
<body>
<form action="board.do" method="post">
<input type="hidden" name="action" value="update">
	<table border="1">
		<tr>
			<td>제목</td>
			<td>
				<input type="text" name="title" 
					size="30" value="${original.title}">
			</td>
		</tr>
		<tr>
			<td>내용</td>
			<td>
			<textarea rows="10" cols="30" name="content"
				placeholder="여기에 내용을 입력하세요.">${original.content}</textarea> 
			</td>
		</tr>
		<tr>
			<td colspan="2">
			<input type="hidden" name="articleNum" value="${original.articleNum}">
			<input type="submit" value="작성완료">
			</td>
		</tr>
	</table>

</form>
</body>
</html>