<%@page import="repository.BookDAO"%>
<%@page import="java.sql.*"%>
<%@page import="vo.BookVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	// 클라이언트가 보낸 파라미터 받는 부분
	request.setCharacterEncoding("euc-kr"); // 한글 파라미터 처리
	String bookId = request.getParameter("bookId");
	
	BookDAO dao = new BookDAO();
	int result = dao.update(new BookVO());
%>

	입력 결과 : <%=result%><br>

	<a href="test04_index.jsp">
		<button>메인화면으로</button>
	</a>
	</body>
</html>