<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>test06_remove_attr.jsp</title>
</head>
<body>
<% 
	session.removeAttribute("settingTime");


%>
세션과 내장객체에 기록된 settingTime 속성을 삭제 하였습니다.<br>
sessionId : <%= session.getId()%><br>
</body>
</html>