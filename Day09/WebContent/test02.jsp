<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>test02.jsp</title>
</head>
<body>
<% 
//web.xml�� ������ ���� ��ȿ �ð��� 5�� ������ 
// �� ������ ��û�� ������ ����
// �ش� Ŭ���̾�Ʈ�� ������ ��ȿ �ð��� 60���̴�.
session.setMaxInactiveInterval(60);
%>

���� ���� id :<%=session.getId() %>

</body>
</html>