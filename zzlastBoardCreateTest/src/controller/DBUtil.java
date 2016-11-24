package controller;

import java.sql.*;

public class DBUtil {
	private static String DRIVER_NAME="com.mysql.jdbc.Driver";
	private static String DB_URL = 
			"jdbc:mysql://127.0.0.1:3306/jsp";
	private static String DB_ID = "root";
	private static String DB_PW = "sds902";
	
	public static Connection makeConnection(){
		Connection con = null;
		try {
			Class.forName(DRIVER_NAME);
			con = 
			  DriverManager.getConnection(DB_URL,DB_ID,DB_PW);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 오류");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("커넥션 생성 오류");
			e.printStackTrace();
		}
		return con;
	}
	
	public static void close(Connection con){
		if(con!=null){
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close(Statement stmt){
		if(stmt!=null){
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close(PreparedStatement pstmt){
		if(pstmt!=null){
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close(ResultSet rs){
		if(rs!=null){
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}











