package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	private static String DRIVER_NAME = "com.mysql.jdbc.Driver";
	private static String DB_URL = "jdbc:mysql://localhost:3306/jsp";
	private static String DB_ID = "root";
	private static String DB_PW = "sds902";

	public static Connection makeConnetction() {
		Connection con = null;

		try {
			Class.forName(DRIVER_NAME);
			con = DriverManager.getConnection(DB_URL, DB_ID, DB_PW);
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� ����");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Ŀ�ؼ� ����");
			e.printStackTrace();
		}
		return con;

	}

	public static void close(Connection con) {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				System.out.println("Ŀ�ؼ� ����");
				e.printStackTrace();
			}
		}
	}

	public static void close(Statement stmt) {
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				System.out.println("statement ����");
				e.printStackTrace();
			}
		}
	}

	public static void close(PreparedStatement pstmt) {
		if (pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				System.out.println("pstmt ����");
				e.printStackTrace();
			}
		}
	}

	public static void close(ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				System.out.println("rs ����");
				e.printStackTrace();
			}
		}
	}
}
