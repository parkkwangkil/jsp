package service;

import java.util.List;

import dao.BoardDao;
import vo.ArticlePageVO;
import vo.ArticleVO;

public class BoardService {
	// �̱���(singleton)
	private static BoardService instance = new BoardService();
	public static BoardService getInstance(){
		return instance;
	}
	private BoardService(){}
///////////////////////////////////////////////////////////////
	BoardDao dao = BoardDao.getInstance();
/////////////////////////////////////////////////////////////	
	// �� ���������� ������ ��� ������ ����ϴ� �޼ҵ�
	public ArticlePageVO makePage(int currentPage){
		final int PAGE_PER_COUNT = 10; // ���������� ������ ���ǰ���
		
		int startRow = (currentPage-1)*PAGE_PER_COUNT;
		int endRow = startRow+PAGE_PER_COUNT;
		
		// ���� �������� ������ ���� DB���� ��ȸ
		List<ArticleVO> articleList = 
				dao.selectArticleList(startRow, endRow);
		
		System.out.println("list Size:"+articleList.size());
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
		
		return new ArticlePageVO(articleList,startPage,endPage,
											currentPage,totalPage);
	}

	public int write(ArticleVO article){
		article.setReadCount(0); // ��ȸ�� 0 ����
		
		return dao.insert(article);
	}

	public ArticleVO read(int articleNum){
	// �� �б⸦ ������ �� ��ȸ���� ������Ű�� �޼ҵ�
		ArticleVO result = null;
		
		if(dao.updateReadCount(articleNum)>0){
			System.out.println("dao read num:"+articleNum);
			// �۹�ȣ�� ��ȿ���� Ȯ���ϴ� ���ǹ�
			result = dao.selectArticle(articleNum);
		}
		return result;
	}
	
	// ���� �Ǵ� �����ϱ⸦ ���� ��ȸ�� �������� ���� �о���� �޼ҵ�
	public ArticleVO readWithoutReadCount(int articleNum){
		return dao.selectArticle(articleNum);
	}

	// �ۼ��ڰ� �����ϴ� �Ÿ� �� ����.
	public boolean modify(ArticleVO article) {
		ArticleVO original = dao.selectArticle(article.getArticleNum());

		if (article.getId().equals(original.getId())) {
			int result = dao.update(article);
			if (result == 1) {
				return true;
			}
		}
		return false;
	}

	// �ۼ��ڰ� �����ϴ��� Ȯ��
	public boolean remove(int articleNum, String id){
		ArticleVO original = dao.selectArticle(articleNum);
		
		if(id!=null && id.equals(original.getId())){
			int result = dao.delete(articleNum);
			if(result==1){
				return true;
			}
		}
		return false;
	}
}






