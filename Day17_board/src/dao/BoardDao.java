package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import vo.ArticleVO;

public class BoardDao {
	// ��ü�� �ϳ��� ���� �����ϴ� �̱���(singleton) ��������
	private static BoardDao instance= new BoardDao();

	public static BoardDao getInstance() {
		return instance;
	}
	private BoardDao(){}
////////////////////////////////////////////////////////////	
	public List<ArticleVO> selectArticleList(int startRow,int endRow){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<ArticleVO> articleList = new ArrayList<>();
		
		try {
			con = DBUtil.makeConnection();
			String sql = "SELECT * FROM BOARD "
					+ "ORDER BY ARTICLE_NUM DESC "
					+ "LIMIT ?,?";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow-startRow); // limit�� �ι�°�� ����
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				ArticleVO article = new ArticleVO();
				article.setArticleNum(rs.getInt(1));
				article.setTitle(rs.getString(2));
				article.setId(rs.getString(3));
				article.setContent(rs.getString(4));
				article.setWriteDate(rs.getTimestamp(5));
				article.setReadCount(rs.getInt(6));
				
				articleList.add(article);
			}
		} catch (SQLException e) {
			System.out.println("DAO insert ����");
			e.printStackTrace();
		} finally{
			DBUtil.close(rs);
			DBUtil.close(pstmt);
			DBUtil.close(con);
		}
		return articleList;
	}

	public int selectArticleCount(){
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		int articleCount = 0;
		
		try {
			con = DBUtil.makeConnection();
			String sql = "SELECT COUNT(*) BOARD";
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			
			rs.next();
			articleCount = rs.getInt(1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return articleCount;
	}

	public int insert(ArticleVO article){
		Connection con = null;
		PreparedStatement pstmt = null;
		int result = 0;
				
		try {
			con = DBUtil.makeConnection();
			String sql = "INSERT INTO BOARD "
			+"(TITLE,ID,CONTENT,WRITE_DATE,READ_COUNT)"
			+"VALUES(?,?,?,now(),?)";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, article.getTitle());
			pstmt.setString(2, article.getId());
			pstmt.setString(3, article.getContent());
			pstmt.setInt(4, article.getReadCount());
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(pstmt);
			DBUtil.close(con);
		}
		return result;
	}

	public ArticleVO selectArticle(int articleNum){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArticleVO article = null;
		
		try {
			con = DBUtil.makeConnection();
			String sql = 
				"SELECT * FROM BOARD WHERE ARTICLE_NUM=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, articleNum);
			
			rs = pstmt.executeQuery();
			if(rs.next()){
				article = new ArticleVO();
				article.setArticleNum(rs.getInt(1));
				article.setTitle(rs.getString(2));
				article.setId(rs.getString(3));
				article.setContent(rs.getString(4));
				article.setWriteDate(rs.getTimestamp(5));
				article.setReadCount(rs.getInt(6));
			}
		} catch (SQLException e) {
			System.out.println("selectArticle ����");
			e.printStackTrace();
		} finally{
			DBUtil.close(rs);
			DBUtil.close(pstmt);
			DBUtil.close(con);
		}
		return article;
	}
	
	public int updateReadCount(int articleNum){
		Connection con = null;
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			con = DBUtil.makeConnection();
			String sql = 
				"UPDATE BOARD SET READ_COUNT=READ_COUNT+1 "
					+ " WHERE ARTICLE_NUM=?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, articleNum);
			result = pstmt.executeUpdate();			
		} catch (SQLException e) {
			System.out.println("updateReadCount ����");
			e.printStackTrace();
		} finally{
			DBUtil.close(pstmt);
			DBUtil.close(con);
		}
		return result;
	}

	public int update(ArticleVO article){
		Connection con = null;
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			con = DBUtil.makeConnection();
			String sql = 
					  "UPDATE BOARD "
					+ "SET TITLE=?, CONTENT=? "
					+ "WHERE ARTICLE_NUM=?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, article.getTitle());
			pstmt.setString(2, article.getContent());
			pstmt.setInt(3, article.getArticleNum());
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("update ����");
			e.printStackTrace();
		} finally{
			DBUtil.close(pstmt);
			DBUtil.close(con);
		}
		return result;
	}

	public int delete(int articleNum){
		Connection con = null;
		PreparedStatement pstmt = null;
		int result = 0;
		
		try {
			con = DBUtil.makeConnection();
			String sql = 
					  "DELETE FROM BOARD "
					+ "WHERE ARTICLE_NUM=?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, articleNum);
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("update ����");
			e.printStackTrace();
		} finally{
			DBUtil.close(pstmt);
			DBUtil.close(con);
		}
		return result;
	}
}
