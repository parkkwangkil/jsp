package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dao.DBUtil;
import vo.BoardVO;

public class BoardDao {
	private static BoardDao instance = new BoardDao();

	public static BoardDao getInstance() {
		// TODO Auto-generated method stub
		return instance;
	}

	private BoardDao() {
	}

	public List<BoardVO> selectAllBoards() {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<BoardVO> list = new ArrayList<BoardVO>();

		try {
			con = DBUtil.makeConnection();
			String sql = "select * from cattube_board order by num desc";
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				BoardVO board = new BoardVO();
				board.setNum(rs.getInt("num"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setWriter(rs.getString("writer"));
				board.setWriteDate(rs.getTimestamp("writeDate"));
				board.setReadCount(rs.getInt("readCount"));
				board.setVoteCount(rs.getInt("voteCount"));
				board.setVideoPath(rs.getString("videoPath"));
				board.setImagePath(rs.getString("imagePath"));
				board.setClosed(rs.getString("closed"));
				list.add(board);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(con);
			DBUtil.close(stmt);
			DBUtil.close(rs);

		}

		return list;
	}

	public void insertBoard(BoardVO board) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DBUtil.makeConnection();
			String sql = "insert into cattube_board(num,title,content) value(board_seq.nextval,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContent());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(con);
			DBUtil.close(pstmt);
		}
	}

	public void updateReadCount(String num) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DBUtil.makeConnection();
			String sql = "update cattube_board set readCount=readCount+1 where num=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, num);
			pstmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(con);
			DBUtil.close(pstmt);
		}

	}

	public List<BoardVO> selectPopularCount() {
		List<BoardVO> list = new ArrayList<BoardVO>();

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = DBUtil.makeConnection();
			String sql = "select * from cattube_board order by readCount desc;";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery(sql);

			while (rs.next()) {
				BoardVO board = new BoardVO();
				board.setReadCount(rs.getInt("readCount"));
				list.add(board);
			}
		} catch (SQLException e) {
			System.out.println("rcount select error");
			e.printStackTrace();
		} finally {
			DBUtil.close(con);
			DBUtil.close(pstmt);
			DBUtil.close(rs);

		}
		return list;

	}

	public BoardVO selectPopularNum(String num, String readCount) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BoardVO board = null;

		try {
			con = DBUtil.makeConnection();
			String sql = "select * from board order by readCount desc;";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, num);
			pstmt.setString(2, readCount);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				board = new BoardVO();
				board.setReadCount(rs.getInt("readCount"));
			}
		} catch (SQLException e) {
			System.out.println("readCount select error");
			e.printStackTrace();
		} finally {
			DBUtil.close(con);
			DBUtil.close(pstmt);
			DBUtil.close(rs);

		}
		return board;

	}

	public BoardVO selectOneBoardByNum(String num) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BoardVO board = null;

		try {
			con = DBUtil.makeConnection();
			String sql = "select * from cattube_board where num=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, num);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				board = new BoardVO();
				board.setNum(rs.getInt("num"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setWriter(rs.getString("writer"));
				board.setWriteDate(rs.getTimestamp("writeDate"));
				board.setReadCount(rs.getInt("readCount"));
				board.setVoteCount(rs.getInt("voteCount"));
				board.setVideoPath(rs.getString("videoPath"));
				board.setImagePath(rs.getString("imagePath"));
				board.setClosed(rs.getString("closed"));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(con);
			DBUtil.close(pstmt);
			DBUtil.close(rs);
		}
		return board;

	}

	public void updateBoard(BoardVO board) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DBUtil.makeConnection();
			String sql = "update cattube_board set title=?, content=? where num=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContent());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(con);
			DBUtil.close(pstmt);
		}

	}

	public void deleteBoard(String num) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DBUtil.makeConnection();
			String sql = "delete board where num=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, num);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(con);
			DBUtil.close(pstmt);
		}

	}
	
	public List<BoardVO> selectVoteCount() {
		List<BoardVO> list = new ArrayList<BoardVO>();

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = DBUtil.makeConnection();
			String sql = "select * from cattube_board order by voteCount desc";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery(sql);

			while (rs.next()) {
				BoardVO board = new BoardVO();
				board.setVoteCount(rs.getInt("voteCount"));
				list.add(board);
			}
		} catch (SQLException e) {
			System.out.println("vote select error");
			e.printStackTrace();
		} finally {
			DBUtil.close(con);
			DBUtil.close(pstmt);
			DBUtil.close(rs);

		}
		return list;

	}
	

}
