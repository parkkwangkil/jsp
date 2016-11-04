package service;

import java.util.List;

import dao.BoardDAO;
import vo.ArticePageVO;
import vo.ArticleVO;

public class BoardService {
	// �̱���(singleton)
	private static BoardService instance;
	public static BoardService getInstance(){
		if(instance == null)
			instance = new BoardService();
		return instance;
	}
	private BoardService(){}
///////////////////////////////////////////////////////////////
	// �� ���������� ������ ��� ������ ����ϴ� �޼ҵ�
	public ArticePageVO makePage(int currentPage){
		final int PAGE_PER_COUNT = 10; // ���������� ������ ���ǰ���
		BoardDAO dao = BoardDAO.getInstance();
		
		int startRow = (currentPage-1)*PAGE_PER_COUNT;
		int endRow = startRow+PAGE_PER_COUNT;
		
		// ���� �������� ������ ���� DB���� ��ȸ
		List<ArticleVO> articleList = 
				dao.selectArticleList(startRow, endRow);
		
		// �� �Խñ� ���� ��ȸ
		int articleTotalCount = dao.selectArticleCount();
		
		// �� �������� ���
		int totalPage = articleTotalCount/PAGE_PER_COUNT;
		if(articleTotalCount%PAGE_PER_COUNT != 0)
			totalPage++;
		
		// ������ �ϴ��� ���������� ���
		int startPage = (currentPage-1)/10*10+1;
		
		// ������ �ϴ��� �������� ���
		int endPage = startPage+9;
		if(endPage>totalPage)
			endPage = totalPage;
		
		return new ArticePageVO(articleList,startPage,endPage,
											currentPage,totalPage);
	}

	public int write(ArticleVO article){
		article.setReadCount(0); // ��ȸ�� 0 ����
		
		BoardDAO dao = BoardDAO.getInstance();
		return dao.insert(article);
	}

	public ArticleVO read(int articleId){
	// �� �б⸦ ������ �� ��ȸ���� ������Ű�� �޼ҵ�
		BoardDAO dao = BoardDAO.getInstance();
		ArticleVO result = null;
		
		if(dao.updateReadCount(articleId)>0){
			// �۹�ȣ�� ��ȿ���� Ȯ���ϴ� ���ǹ�
			result = dao.selectArticle(articleId);
		}
		return result;
	}
	
	// ���� �Ǵ� �����ϱ⸦ ���� ��ȸ�� �������� ���� �о���� �޼ҵ�
	public ArticleVO readWithoutReadCount(int articleId){
		BoardDAO dao = BoardDAO.getInstance();
		return dao.selectArticle(articleId);
	}

	// password�� �˻��� �Ŀ� �����ϱ⸦ �����ϴ� �޼ҵ�
	public int modify(ArticleVO article){
		BoardDAO dao = BoardDAO.getInstance();
		int result = 0;
		
		ArticleVO original = dao.selectArticle(article.getArticleId());
		if(article.getPassword().equals(original.getPassword())){
			result = dao.update(article);
		}
		return result;
	}

	// password�� �˻��� �Ŀ� �����ϱ⸦ �����ϴ� �޼ҵ�
	public int remove(int articleId, String password){
		BoardDAO dao = BoardDAO.getInstance();
		int result = 0;
		
		ArticleVO original = dao.selectArticle(articleId);
		if(password.equals(original.getPassword())){
			result = dao.delete(articleId);
		}
		return result;
	}
}





