package repositiory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import vo.PhoneVO;

public class PhoneDAO {
	private final String DRIVER_NAME = "com.mysql.jdbc.Driver";
	private final String DB_URL = "jdbc:mysql://127.0.0.1:3306/stores";
	private final String DB_ID = "root";
	private final String DB_PW = "sds902";

	private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;

	private PhoneDAO() {
		try {
			Class.forName(DRIVER_NAME);
		} catch (ClassNotFoundException e) {
			System.out.println("");
			e.printStackTrace();
		}
	}
	
	private static PhoneDAO instance = new PhoneDAO();
	
	public static PhoneDAO getInstance(){
		return instance;
		
	}

	public void createConnection() {
		try {
			con = DriverManager.getConnection(DB_URL, DB_ID, DB_PW);
		} catch (SQLException e) {
			System.out.println("커넥션 생성 오류");
			e.printStackTrace();
		}
	}

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

	public int insert(PhoneVO phone) {
		createConnection();
		int result = 0;
		try {
			String sql = "INSERT INTO phones(model,manufacturer,price,year) VALUES(?,?,?,?)";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, phone.getModel());
			pstmt.setString(2, phone.getManufacturer());
			pstmt.setInt(3, phone.getPrice());
			pstmt.setString(4, phone.getYear());

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

	public PhoneVO select(int phoneid) {
		createConnection();
		PhoneVO resultPhone = null;
		String sql = "select phoneid, model, manufacturer, price, year from Phones where phoneid=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, phoneid);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				resultPhone = new PhoneVO();
				resultPhone.setPhoneId(rs.getInt(1));
				resultPhone.setModel(rs.getString(2));
				resultPhone.setManufacturer(rs.getString(3));
				resultPhone.setPrice(rs.getInt(4));
				resultPhone.setYear(rs.getString(5));
			}
		} catch (SQLException e) {
			System.out.println("select error");
			e.printStackTrace();
		} finally {
			closeResultSet();
			closePrepared();
			closeConnection();
		}
		return resultPhone;

	}

	public List<PhoneVO> selectTotalList() {
		createConnection();
		List<PhoneVO> phoneList = new ArrayList<>();
		String sql = "select * from phones";

		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				PhoneVO phone = new PhoneVO();
				phone.setPhoneId(rs.getInt(1));
				phone.setModel(rs.getString(2));
				phone.setManufacturer(rs.getString(3));
				phone.setPrice(rs.getInt(4));
				phone.setYear(rs.getString(5));
			}

		} catch (SQLException e) {
			System.out.println("selectTotalList 에러");
			e.printStackTrace();
		} finally {
			closeConnection();
			closePrepared();
			closeResultSet();
			closeStatement();
		}
		return phoneList;

	}

	public int update(PhoneVO phone) {
		createConnection();
		int result = 0;

		String sql = "UPDATE INTO Phones(phoneid,model,manufacturer,price,year) VALUES(?,?,?,?)";

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, phone.getModel());
			pstmt.setString(2, phone.getManufacturer());
			pstmt.setInt(3, phone.getPrice());
			pstmt.setString(4, phone.getYear());
			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println("update 오류");
			e.printStackTrace();
		} finally {
			closeConnection();
			closeResultSet();
			closePrepared();
		}
		return result;
	}

	public int delete(PhoneVO phoneid) {
		createConnection();
		int result = 0;
		try {

			String sql = "delete from phones where phoneid=?";

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,phoneid.getPhoneId() );
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("UPDATE ?");
			e.printStackTrace();
		} finally {
			closePrepared();
			closeConnection();

		}
		return result;
	}
}