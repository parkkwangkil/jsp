<%@page import="java.util.List"%>
<%@page import="vo.PhoneVO"%>
<%@page import="repositiory.PhoneDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>select_list.jsp</title>
</head>
<body>
	<%
		PhoneDAO dao = PhoneDAO.getInstance();
		List<PhoneVO> phoneList = dao.selectTotalList();
	%>

	<table border="1">
		<tr>
			<th>폰번호</th>
			<th>폰모델</th>
			<th>제조사</th>
			<th>가격</th>
			<th>출시일</th>
		</tr>
		<%
			for (PhoneVO phone : phoneList) {
		%>
		<tr>
			<td><%=phone.getPhoneId()%></td>
			<td><%=phone.getModel()%></td>
			<td><%=phone.getManufacturer()%></td>
			<td><%=phone.getPrice()%></td>
			<td><%=phone.getYear()%></td>
		</tr>
		<%
			}
		%>
	</table>
	<a href="work_index.jsp">
		<button>메인화면으로</button>
	</a>

</body>
</html>