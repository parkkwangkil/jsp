<%@page import="vo.PhoneVO"%>
<%@page import="repositiory.PhoneDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>work_delete.jsp</title>
</head>
<body>
	<%
		String phoneidStr = request.getParameter("phoneId");
		int phoneId = 0;
		int result= 0;

		if (phoneidStr != null) {
			phoneId = Integer.parseInt(phoneidStr);
		}
		PhoneDAO dao = PhoneDAO.getInstance();
		 result = dao.delete(new PhoneVO(phoneId));
	%>

	입력 결과 :
	<%=result%><br>

	<a href="work_index.jsp">
		<button>메인화면으로</button>
	</a>

</body>
</html>