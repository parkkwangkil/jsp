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
���ǰ� ���尴ü�� ��ϵ� settingTime �Ӽ��� ���� �Ͽ����ϴ�.<br>
sessionId : <%= session.getId()%><br>
</body>
</html>