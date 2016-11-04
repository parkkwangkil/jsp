package service;

import java.util.List;

import dao.BoardDAO;
import vo.ArticlePageVO;
import vo.ArticleVO;

public class BoardService {
	// �̱���(singleton)
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
		final int PAGE_PER_COUNT = 10; // ���������� ������ ���ǰ���
		BoardDAO dao = BoardDAO.getInstance();

		int startRow = (currentPage - 1) * PAGE_PER_COUNT;
		int endRow = startRow + PAGE_PER_COUNT;

		// ���� �������� ������ ���� DB���� ��ȸ
		List<ArticleVO> articleList = dao.selectArticleList(startRow, endRow);

		// �� �Խñ� ���� ��ȸ
		int articleTotalCount = dao.selectArticleCount();

		// �� �������� ���
		int totalPage = articleTotalCount;
		if (articleTotalCount % PAGE_PER_COUNT != 0)
			totalPage++;

		// ������ �ϴ��� ���������� ���
		int startPage = (currentPage - 1) / 10 * 10 + 1;

		// ������ �ϴ��� �� ������ ���
		int endPage = startPage + 9;
		// int totalPage = articleTotalCount/PAGE_PER_COUNT;
		if (endPage > totalPage)
			endPage = totalPage;

		return new ArticlePageVO(articleList, startPage, endPage, currentPage, totalPage);

	}

	public int write(ArticleVO article) {
		article.setReadCount(0); // ��ȸ�� 0 ����
		BoardDAO dao = BoardDAO.getInstance();
		return dao.insert(article);
	}

	public ArticleVO read(int articleId) {
		// �� �б⸦ ������ �� ��ȸ���� ������Ű�� �޼ҵ�
		BoardDAO dao = BoardDAO.getInstance();
		ArticleVO result = null;

		if (dao.updateReadCount(articleId) > 0) {
			// �۹�ȣ�� ��ȿ���� Ȯ���ϴ� ���ǹ�
			result = dao.selectArticle(articleId);
		}
		return result;
	}

	// ���� �Ǵ� ������ ���� ��ȸ�� ���� ���� ������ �Ф����� �޼ҵ�
	public ArticleVO readWithoutReadCount(int articleId) {
		BoardDAO dao = BoardDAO.getInstance();
		return dao.selectArticle(articleId);

	}

	// password �˻� �� �� �����ϱ� �����ϱ�
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