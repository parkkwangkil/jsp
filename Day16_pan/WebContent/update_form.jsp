
<%@page import="service.BoardService"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
				<td><input type="text" name="title" size="30"
					value="${original.title}"></td>
			</tr>
			<tr>
				<td>��ȣ</td>
				<td><input type="password" name="password" size="30"></td>
			</tr>
			<tr>
				<td>����</td>
				<td><textarea rows="10" cols="30" name="content"
						placeholder="���⿡ ������ �Է��ϼ���.">${original.content}</textarea></td>
			</tr>
			<tr>
				<td colspan="2"><input type="hidden" name="articleId"
					value="${original.articleId}"> <input type="submit"
					value="�ۼ��Ϸ�"></td>
			</tr>
		</table>

	</form>
</body>
</html>