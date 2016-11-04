package service;

import java.util.List;

import dao.BoardDAO;
import vo.BoardPageVO;
import vo.BoardVO;

public class BoardService {
	private static BoardService instance;

	public static BoardService getInstance() {
		if (instance == null)
			instance = new BoardService();
		return instance;
	}

	private BoardService() {
	}

	public BoardPageVO makePage(int currentPage) {
		final int PAGE_PER_COUNT = 10;
		BoardDAO dao = BoardDAO.getInstance();

		int startRow = (currentPage - 1) * PAGE_PER_COUNT;
		int endRow = startRow + PAGE_PER_COUNT;

		List<BoardVO> articleList = dao.selectArticleList(startRow, endRow);
		int articleTotalCount = dao.selectArticleCount();
		int totalPage = articleTotalCount / PAGE_PER_COUNT;
		if (articleTotalCount % PAGE_PER_COUNT != 0)
			totalPage++;
		int startPage = (currentPage - 1) / 10 * 10 + 1;
		int endPage = startPage + 9;
		if (endPage > totalPage)
			endPage = totalPage;

		return new BoardPageVO(articleList, startPage, endPage, currentPage, totalPage);
	}

	public int write(BoardVO article) {
		article.setRead_count(0);
		BoardDAO dao = BoardDAO.getInstance();
		return dao.insert(article);

	}

	public BoardVO read(int articleId){
		BoardDAO dao = BoardDAO.getInstance();
		BoardVO result = null;
		
		if(dao.updateReadCount(articleId)>0){
			result = dao.selectArticle(articleId);
		}
		return result;
	}

	public int modify(BoardVO article) {
		BoardDAO dao = BoardDAO.getInstance();
		int result = 0;

		BoardVO original = dao.selectArticle(article.getArticle_id());
		if (article.getPassword().equals(original.getPassword())) {
			result = dao.update(article);
		}
		return result;
	}
	
	public int remove(int articleId, String password) {
		BoardDAO dao = BoardDAO.getInstance();
		int result = 0;

		BoardVO original = dao.selectArticle(articleId);
		if (password.equals(original.getPassword())) {
			result = dao.delete(articleId);
		}
		return result;
	}

	public BoardVO readWithoutReadCount(int articleId) {
		// TODO Auto-generated method stub
		return null;
	}
}
