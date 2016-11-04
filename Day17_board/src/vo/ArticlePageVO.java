package vo;

import java.util.List;

public class ArticlePageVO {
	private List<ArticlePageVO> articleList;
	private int requestPage;
	private int startPage;
	private int endPage;
	private int totalPage;

	public ArticlePageVO() {
	}

	public ArticlePageVO(List<ArticlePageVO> articleList, int requestPage, int startPage, int endPage, int totalPage) {
		super();
		this.articleList = articleList;
		this.requestPage = requestPage;
		this.startPage = startPage;
		this.endPage = endPage;
		this.totalPage = totalPage;
	}

	public List<ArticlePageVO> getArticleList() {
		return articleList;
	}

	public int getRequestPage() {
		return requestPage;
	}

	public int getStartPage() {
		return startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setArticleList(List<ArticlePageVO> articleList) {
		this.articleList = articleList;
	}

	public void setRequestPage(int requestPage) {
		this.requestPage = requestPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	@Override
	public String toString() {
		return "ArticlePageVO [articleList=" + articleList + ", requestPage=" + requestPage + ", startPage=" + startPage
				+ ", endPage=" + endPage + ", totalPage=" + totalPage + "]";
	}

}
