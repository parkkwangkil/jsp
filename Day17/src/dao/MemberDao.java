package dao;

import java.sql.*;

import vo.MemberVO;

public class MemberDao {
	// Dao 객체 자체는 여러개를 만들 필요가 없으므로
	// 하나의 instance 객체만 만들어서 재사용 하는 Singleton
	private static MemberDao instance = new MemberDao();
	private MemberDao(){}
	public static MemberDao getInstance(){
		return instance;
	}
///////////////////////////////////////////////////////////
	public int insert(MemberVO member){
		Connection con = null;
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			con = DBUtil.makeConnection();
			String sql = "INSERT INTO MEMBER"
					+ "(ID,PASSWORD,NAME,EMAIL) VALUES(?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPassword());
			pstmt.setString(3, member.getName());
			pstmt.setString(4, member.getEmail());
			
			result = pstmt.executeUpdate(); // SQL 실행
		} catch (SQLException e) {
			System.out.println("insert member 에러");
			e.printStackTrace();
		} finally{
			DBUtil.close(pstmt);
			DBUtil.close(con);
		}
		return result;
	}
	
	public MemberVO select(String id){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MemberVO result = null;
		try {
			con = DBUtil.makeConnection();
			String sql = "SELECT ID,PASSWORD,NAME,EMAIL "
					+ "FROM MEMBER WHERE ID=?";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, id);
			rs = pstmt.executeQuery(); // SQL 실행
			if(rs.next()){
				result = new MemberVO();
				result.setId(rs.getString(1));
				result.setPassword(rs.getString(2));
				result.setName(rs.getString(3));
				result.setEmail(rs.getString(4));				
			}
		} catch (SQLException e) {
			System.out.println("select member 에러");
			e.printStackTrace();
		} finally{
			DBUtil.close(rs);
			DBUtil.close(pstmt);
			DBUtil.close(con);
		}
		return result;
	}	
}
