package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import vo.MemberVO;

public class MemberDAO {

	private MemberDAO() {
	}

	private static MemberDAO instance = new MemberDAO();

	public static MemberDAO getInstance() {
		return instance;
	}

	public int confirmID(String userid) {
		int result = -1;
		String sql = "select * from member where id=?";

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = DBUtil.makeConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				result = 1;
			} else {
				result = -1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(con);
			DBUtil.close(pstmt);
			DBUtil.close(rs);
		}
		return result;
	}

	public MemberVO getMember(String id) {
		MemberVO memberVO = null;
		String sql = "select * from member where id=?";

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = DBUtil.makeConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				memberVO = new MemberVO();
				memberVO.setId(rs.getString("id"));
				memberVO.setPassword(rs.getString("password"));
				memberVO.setEmail(rs.getString("email"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(con);
			DBUtil.close(pstmt);
			DBUtil.close(rs);
		}
		return memberVO;
	}

	public int insertMember(MemberVO memberVO) {
		int result = 0;
		String sql = "insert into member(id, password,email) values(?, ?, ?)";

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DBUtil.makeConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, memberVO.getId());
			pstmt.setString(2, memberVO.getPassword());
			pstmt.setString(3, memberVO.getEmail());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(con);
			DBUtil.close(pstmt);
		}
		return result;
	}

}
