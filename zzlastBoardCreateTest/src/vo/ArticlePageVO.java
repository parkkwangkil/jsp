package vo;

import java.util.List;

public class ArticlePageVO {
	private List<BoardVO> articleList;
	private int requestPage;
	private int startPage;
	private int endPage;
	private int totalPage;
//////////////////////////////////////////////////////////
	public ArticlePageVO(){
	}
	public ArticlePageVO(List<BoardVO> articleList, int requestPage, int startPage, int endPage, int totalPage) {
		this.articleList = articleList;
		this.requestPage = requestPage;
		this.startPage = startPage;
		this.endPage = endPage;
		this.totalPage = totalPage;
	}
//////////////////////////////////////////////////////////	
	public List<BoardVO> getArticleList() {
		return articleList;
	}
	public void setArticleList(List<BoardVO> articleList) {
		this.articleList = articleList;
	}
	public int getRequestPage() {
		return requestPage;
	}
	public void setRequestPage(int requestPage) {
		this.requestPage = requestPage;
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
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
///////////////////////////////////////////////////////////	
	@Override
	public String toString() {
		return "ArticlePageVO [articleList=" + articleList + ", requestPage=" + requestPage + ", startPage=" + startPage
				+ ", endPage=" + endPage + ", totalPage=" + totalPage + "]";
	}	
}
