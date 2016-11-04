package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import vo.BookVO;

public class BookDAO {
	// mysql 관련 스트링 상수
	private final String DRIVER_NAME = "com.mysql.jdbc.Driver";
	private final String DB_URL = "jdbc:mysql://127.0.0.1:3306/jsp";
	private final String DB_ID = "root";
	private final String DB_PW = "1111";
	//////////////////////////////////////////////////////////////////
	private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;

	//////////////////////////////////////////////////////////////////
	// 생성자에서 DB 드라이버 로딩
	public BookDAO() {
		try {
			Class.forName(DRIVER_NAME);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 오류");
			e.printStackTrace();
		}
	}

	// 커넥션 생성 메소드
	public void createConnection() {
		try {
			con = DriverManager.getConnection(DB_URL, DB_ID, DB_PW);
		} catch (SQLException e) {
			System.out.println("커넥션 생성 오류");
			e.printStackTrace();
		}
	}

	// 커넥션 종료 메소드
	public void closeConnection() {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				System.out.println("커넥션 종료 오류");
				e.printStackTrace();
			}
		}
	}

	// Statement 종료 메소드
	public void closeStatement() {
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				System.out.println("stmt 종료 오류");
				e.printStackTrace();
			}
		}
	}

	// PreparedStatement 종료 메소드
	public void closePrepared() {
		if (pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				System.out.println("pstmt 종료 오류");
				e.printStackTrace();
			}
		}
	}

	// ResultSet 종료 메소드
	public void closeResultSet() {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				System.out.println("rs 종료 오류");
				e.printStackTrace();
			}
		}
	}

	//////////////////////////////////////////////////////////////////
	public int insert(BookVO book) {
		createConnection();
		int result = 0;
		try {
			String sql = "INSERT INTO BOOKS(TITLE,PUBLISHER,YEAR,PRICE)" + "VALUES(?,?,?,?)";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, book.getTitle());
			pstmt.setString(2, book.getPublisher());
			pstmt.setString(3, book.getYear());
			pstmt.setInt(4, book.getPrice());

			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("insert 에러");
			e.printStackTrace();
		} finally {
			closePrepared();
			closeConnection();
		}
		return result;
	}

	//////////////////////////////////////////////////////////////////
	 public int update(BookVO book){
		 createConnection();
			int result = 0;
			try {
				String sql = "UPDATE INTO BOOKS(TITLE,PUBLISHER,YEAR,PRICE)" + "VALUES(?,?,?,?)";

				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, book.getTitle());
				pstmt.setString(2, book.getPublisher());
				pstmt.setString(3, book.getYear());
				pstmt.setInt(4, book.getPrice());

				result = pstmt.executeUpdate();
			} catch (SQLException e) {
				System.out.println("UPDATE 에러");
				e.printStackTrace();
			} finally {
				closePrepared();
				closeConnection();
			}
			return result;
		}

	
	 public int delete(int bookId){
		 createConnection();
		 int result = 0;
         
	        try {
				String sql = "delete from books where store_id=3";

				pstmt = con.prepareStatement(sql);
	            pstmt.setInt(1, bookId);
		 
				 result = pstmt.executeUpdate();
			} catch (SQLException e) {
				System.out.println("UPDATE 에러");
				e.printStackTrace();
			} finally {
				closePrepared();
				closeConnection();
			
		} 
		return bookId;
	 }
	//////////////////////////////////////////////////////////////////
	public BookVO select(int bookId){
		createConnection();
		BookVO resultBook = null;
		String sql = "select BOOK_ID, TITLE, PUBLISHER,YEAR,PRICEFROM BOOKS WHERE BOOK_ID=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bookId);
			rs = pstmt.executeQuery();
			if(rs.next()){
				resultBook = new BookVO();
				resultBook.setBookId(rs.getInt(1));
				resultBook.setTitle(rs.getString(2));
				resultBook.setPublisher(rs.getString(3));
				resultBook.setYear(rs.getString(4));
				resultBook.setPrice(rs.getInt(5));
			}
		} catch (SQLException e) {
			System.out.println("select error");
			e.printStackTrace();
			
		}finally{
			closeResultSet();
			closePrepared();
			closeConnection();
		}
		return resultBook;
	}
	
	// }
	//
	public List<BookVO> selectTotalList() {
		createConnection();
		List<BookVO> bookList = new ArrayList<>();
		String sql = "SELECT BOOK_ID, TITLE, PUBLISHER, YEAR, PRICE" + "FROM BOOKS";
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				BookVO book = new BookVO();
				book.setBookId(rs.getInt(1));
				book.setTitle(rs.getString(2));
				book.setPublisher(rs.getString(3));
				book.setYear(rs.getString(4));
				book.setPrice(rs.getInt(5));
				bookList.add(book);
			}
		} catch (SQLException e) {
			System.out.println("selectTotalList 에러");
			e.printStackTrace();
		} finally {
			closeResultSet();
			closeStatement();
			closeConnection();
		}
		return bookList;
	}
}