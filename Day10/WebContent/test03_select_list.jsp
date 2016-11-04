<%@page import="java.util.ArrayList"%>
<%@page import="vo.BookVO"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.*"%>
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
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		// 1. 드라이버 로딩
		Class.forName("com.mysql.jdbc.Driver");

		String DB_URL = "jdbc:mysql://127.0.0.1:3306/jsp";
		String DB_ID = "root";
		String DB_PW = "1111";

		// 2. 커넥션 생성
		con = DriverManager.getConnection(DB_URL, DB_ID, DB_PW);

		// 3. SQL 명령어 작성
		String sql = "SELECT BOOK_ID, TITLE, PUBLISHER, YEAR, PRICE FROM BOOKS";

		// 4. Statement 객체 생성
		stmt = con.createStatement();

		// 5. 명령어 실행
		rs = stmt.executeQuery(sql);

		// 6. 결과 처리 
		List<BookVO> bookList = new ArrayList();
		while (rs.next()) {
			BookVO book = new BookVO();
			book.setBookId(rs.getInt(1));
			book.setTitle(rs.getString(2));
			book.setPublisher(rs.getString(3));
			book.setYear(rs.getString(4));
			book.setPrice(rs.getInt(5));

			bookList.add(book);
		}
		//7.사용한 자료 반납 
		if (rs != null) {
			rs.close();
		}
		if (stmt != null) {
			rs.close();
		}
		if (con != null) {
			con.close();
		}
	%>
	<table border="1">
		<tr>
			<th>책번호</th>
			<th>제목</th>
			<th>출판사</th>
			<th>가격</th>
			<th>출판년도</th>
		</tr>
		<%
			for (BookVO b : bookList) {
		%>
		<tr>
			<td><%=b.getBookId()%></td>
			<td><%=b.getTitle()%></td>
			<td><%=b.getPublisher()%></td>
			<td><%=b.getPrice()%></td>
			<td><%=b.getYear()%></td>
		</tr>
		<%
			}
		%>
	</table>
	<a href="test02_form.jsp">
		<button>책 추가하러 가기</button>
	</a>
</body>
</html>