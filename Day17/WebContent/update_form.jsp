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
			<td>����</td>
			<td>
				<input type="text" name="title" 
					size="30" value="${original.title}">
			</td>
		</tr>
		<tr>
			<td>����</td>
			<td>
			<textarea rows="10" cols="30" name="content"
				placeholder="���⿡ ������ �Է��ϼ���.">${original.content}</textarea> 
			</td>
		</tr>
		<tr>
			<td colspan="2">
			<input type="hidden" name="articleNum" value="${original.articleNum}">
			<input type="submit" value="�ۼ��Ϸ�">
			</td>
		</tr>
	</table>

</form>
</body>
</html>