package service;

import java.util.List;

import dao.BoardDAO;
import vo.ArticlePageVO;
import vo.ArticleVO;

public class BoardService {
	// 싱글턴(singleton)
	private static BoardService instance;

	public static BoardService getInstance() {
		if (instance == null)
			instance = new BoardService();
		return instance;
	}

	private BoardService() {
	}

	///////////////////////////////////////////////////////////////
	public ArticlePageVO makePage(int currentPage) {
		final int PAGE_PER_COUNT = 10; // 한페이지에 보여질 글의갯수
		BoardDAO dao = BoardDAO.getInstance();

		int startRow = (currentPage - 1) * PAGE_PER_COUNT;
		int endRow = startRow + PAGE_PER_COUNT;

		// 현재 페이지에 보여줄 글을 DB에서 조회
		List<ArticleVO> articleList = dao.selectArticleList(startRow, endRow);

		// 총 게시글 갯수 조회
		int articleTotalCount = dao.selectArticleCount();

		// 총 페이지수 계산
		int totalPage = articleTotalCount;
		if (articleTotalCount % PAGE_PER_COUNT != 0)
			totalPage++;

		// 페이지 하단의 시작페이지 계산
		int startPage = (currentPage - 1) / 10 * 10 + 1;

		// 페이지 하단의 끝 페이지 계산
		int endPage = startPage + 9;
		// int totalPage = articleTotalCount/PAGE_PER_COUNT;
		if (endPage > totalPage)
			endPage = totalPage;

		return new ArticlePageVO(articleList, startPage, endPage, currentPage, totalPage);

	}

	public int write(ArticleVO article) {
		article.setReadCount(0); // 조회수 0 셋팅
		BoardDAO dao = BoardDAO.getInstance();
		return dao.insert(article);
	}

	public ArticleVO read(int articleId) {
		// 글 읽기를 수행할 때 조회수도 증가시키는 메소드
		BoardDAO dao = BoardDAO.getInstance();
		ArticleVO result = null;

		if (dao.updateReadCount(articleId) > 0) {
			// 글번호가 유효한지 확인하는 조건문
			result = dao.selectArticle(articleId);
		}
		return result;
	}

	// 수정 또는 삭제를 위해 조회수 증가 없이 원본을 읽ㅇ오는 메소드
	public ArticleVO readWithoutReadCount(int articleId) {
		BoardDAO dao = BoardDAO.getInstance();
		return dao.selectArticle(articleId);

	}

	// password 검사 후 에 수정하기 진행하기
    public int modify(ArticleVO article){
        BoardDAO dao = BoardDAO.getInstance();
        int result = 0;
         
        ArticleVO original = dao.selectArticle(article.getArticleId());
        if(article.getPassword().equals(original.getPassword())){
            result = dao.update(article);
        }
        return result;
    }
    public int delete(ArticleVO article){
    	BoardDAO dao = BoardDAO.getInstance();
    	int result = 0;
    	
    	ArticleVO orginal = dao.selectArticle(article.getArticleId());
//    	if(article.getPassword().equals(orginal.getPassword())){
//    		result = dao.delete(article);
//    	}
    	result = dao.delete(article);
		return result;
    }
    
    
}