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
	String title = request.getParameter("title");
	String publisher = request.getParameter("pub");
	String year = request.getParameter("year");
	String priceStr = request.getParameter("price");
	int price = 0;
	
	if(priceStr != null){
		price = Integer.parseInt(priceStr);
	}
	
	Connection con = null;
	Statement stmt = null;
	int result = 0;
	
	// 1. 드라이버 로딩
	Class.forName("com.mysql.jdbc.Driver");
	
	String DB_URL = "jdbc:mysql://127.0.0.1:3306/jsp";
	String DB_ID = "root";
	String DB_PW = "1111";
	
	// 2. 커넥션 생성
	con = DriverManager.getConnection(DB_URL,DB_ID,DB_PW);
	
	// 3. SQL 명령어 작성
	String sql = 
	"INSERT INTO BOOKS(TITLE,PUBLISHER,YEAR,PRICE)"+
	"VALUES('Java','SDS','2016',30000)";
	
	// 4. Statement 객체 생성
	stmt = con.createStatement();
	
	// 5. SQL 명령어 실행
	result = stmt.executeUpdate(sql);
	
	// 6. 결과값 처리
	if (result > 0) {
		out.println("<h2>책 insert가 완료되었습니다.</h2>");
	} else {
		out.println("<h2>책 insert가 실패하였습니다.</h2>");
	}

	// 7. 사용한 자원 반납 - close
	if (stmt != null) {
		stmt.close();
	}
	if (con != null) {
		con.close();
	}
%>

</body>
</html>