<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>	cookie_status</title>
</head>
<body>
<form action="log_out.jsp" method="get"></form>

<% 
String id = "park";
String pw = "1111";
if (id != null){
	out.println(""+id+"�� �ݰ����ϴ�.");
}else{
	out.println("�߸� ���̾��.");
}
%>
<%=request.getParameter("id") %> �� �ȳ��ϼ���
<a href="log_out.jsp"></a>
<br>
 
</body>
</html>