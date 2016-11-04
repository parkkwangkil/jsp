<%@page import="vo.PhoneVO"%>
<%@page import="repositiory.PhoneDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>work_insert.jsp</title>
</head>
<body>
	<%
		request.setCharacterEncoding("euc-kr");
		String model = request.getParameter("model");
		String manufacturer = request.getParameter("manufacturer");
		String priceStr = request.getParameter("price");
		String year = request.getParameter("year");

		int price = 0;

		if (priceStr != null) {
			price = Integer.parseInt(priceStr);
		}

		PhoneDAO dao = PhoneDAO.getInstance();
		int result = dao.insert(new PhoneVO(model, manufacturer, price,year));
	%>

	입력 결과 :
	<%=result%><br>

	<a href="work_index.jsp">
		<button>메인화면으로</button>
	</a>

</body>
</html>