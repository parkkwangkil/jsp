<%@ page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page session="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>test06_set_attr.jsp</title>
</head>
<body>
<% 
	session.setAttribute("settingtime", new Date());
%>
현재 시간을 세션에 기록하였습니다.<br>
sessionId : <%= session.getId()%><br>

</body>
</html>