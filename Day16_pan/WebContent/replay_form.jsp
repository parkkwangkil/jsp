<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="reply.jsp" method="post">
<input type="hidden" name="parentArticleId" value="${param.parentId}" />
<input type="hidden" name="reple" value="${param.reple}" />
����: <input type="text" name="title" size="20" value="re: " /> <br/>
�ۼ���: <input type="text" name="writer" /> <br/>
�۾�ȣ: <input type="password" name="password" /> <br/>
�۳���: <br/>
<textarea name="content" cols="40" rows="5"></textarea>
<br/>
<input type="submit" value="����" />
</form>
