<%@page import="vo.PhoneVO"%>
<%@page import="repositiory.PhoneDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>work_select_phone</title>
</head>
<body>
	<%
		String phoneIdStr = request.getParameter("phoneId");
		int phoneId = 0;

		if (phoneIdStr != null) {
			phoneId = Integer.parseInt(phoneIdStr);
		}
		PhoneDAO dao = PhoneDAO.getInstance();
		PhoneVO phone = dao.select(phoneId);
	%>
	<table border="1">
		<tr>
			<td>폰번호</td>
			<td><%=phone.getPhoneId()%></td>
		</tr>
		<tr>
			<td>모델명</td>
			<td><%=phone.getModel()%></td>
		</tr>
		<tr>
			<td>제조사</td>
			<td><%=phone.getManufacturer()%></td>
		</tr>
		<tr>
			<td>가격</td>
			<td><%=phone.getPrice()%></td>
		</tr>
		<tr>
			<td>출시일</td>
			<td><%=phone.getYear()%></td>
		</tr>
	</table>
	<a href="work_index.jsp">
		<button>메인화면으로</button>
	</a>
</body>
</html>