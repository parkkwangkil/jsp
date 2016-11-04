package vo;

import java.util.List;

public class ArticlePageVO {
	private List<ArticleVO> articleList;
	private int startPage; // 시작 페이지
	private int endPage; // 끝페이지
	private int currentPage; // 현재페이지
	private int totalPage;

	public ArticlePageVO() {

	}

	public ArticlePageVO(List<ArticleVO> articleList) {
		super();
		this.articleList = articleList;
	}

	public ArticlePageVO(int startPage, int endPage, int currentPage, int totalPage) {
		super();
		this.startPage = startPage;
		this.endPage = endPage;
		this.currentPage = currentPage;
		this.totalPage = totalPage;
	}

	public ArticlePageVO(List<ArticleVO> articleList, int startPage, int endPage, int currentPage, int totalPage) {
		super();
		this.articleList = articleList;
		this.startPage = startPage;
		this.endPage = endPage;
		this.currentPage = currentPage;
		this.totalPage = totalPage;
	}

	public List<ArticleVO> getArticleList() {
		return articleList;
	}

	public void setArticleList(List<ArticleVO> articleList) {
		this.articleList = articleList;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

}
