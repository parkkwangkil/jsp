<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>test03_sub.jsp</title>
</head>
<body>
<!-- �� ������ sub�� ����ϴ�. -->
<% int n =10;
if(n%2==0){
%>

<h2>test03_sub.jsp ���� �ۼ��� ���� : ¦��</h2>
<%
	} else{
%>
<h2>test03_sub.jsp ���� �ۼ��� ���� : Ȧ��</h2>
<%
	}
%>