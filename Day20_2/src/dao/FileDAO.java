package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import VO.FileVO;

public class FileDAO {
	private static FileDAO instance = new FileDAO();

	public static FileDAO getInstance() {
		return instance;
	}

	private FileDAO() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("mysql 드라이버 로딩 오류");
			e.printStackTrace();
		}

	}

	public List<FileVO> selectFileList() {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<FileVO> fileList = new ArrayList<>();
		try {
			con = DBHelper.makeConnection();
			String sql = "select * from file_board";
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				FileVO file = new FileVO();
				file.setFileNum(rs.getInt(1));
				file.setFileName(rs.getString(2));
				file.setSavePath(rs.getString(3));
				file.setDownCount(rs.getInt(4));
				file.setFileSize(rs.getInt(5));
				fileList.add(file);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBHelper.close(con);
			DBHelper.close(stmt);
			DBHelper.close(rs);
			
		}
		return fileList;

	}

	public int insert(FileVO fileVO) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int result = 0;

		try {
			con = DBHelper.makeConnection();
			String sql = "INSERT INTO FILE_BOARD " + "(FILE_NAME,SAVED_PATH,FILE_SIZE,DOWN_COUNT)" + "VALUES(?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, fileVO.getFileName());
			pstmt.setString(2, fileVO.getSavePath());
			pstmt.setInt(3, fileVO.getFileSize());
			pstmt.setInt(4, fileVO.getDownCount());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("inser error");
			e.printStackTrace();
		} finally {
			DBHelper.close(pstmt);
			DBHelper.close(con);
		}
		return result;

	}

	public FileVO selectFile(int fileNum) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		FileVO result = null;
		try {
			con = DBHelper.makeConnection();
			String sql = "select * from file_board where file_num=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, fileNum);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				result = new FileVO();
				result.setFileNum(rs.getInt(1));
				result.setFileName(rs.getString(2));
				result.setSavePath(rs.getString(3));
				result.setDownCount(rs.getInt(4));
				result.setFileSize(rs.getInt(5));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBHelper.close(con);
			DBHelper.close(pstmt);
			DBHelper.close(rs);
		}
		return result;

	}

	public int updateDownCount(int fileNum) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int result = 0;

		try {
			con = DBHelper.makeConnection();
			String sql = "update file_board set" + "DOWN_COUNT=DOWN_COUNT+1 WHERE FILE_NUM=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, fileNum);
			result = pstmt.executeUpdate(); // 쿼리 실행
		} catch (SQLException e) {
			System.out.println("update down count error");
			e.printStackTrace();
		} finally {
			DBHelper.close(pstmt);
			DBHelper.close(con);
		}
		return result;

	}

}
