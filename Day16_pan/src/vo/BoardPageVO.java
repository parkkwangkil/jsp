package vo;

import java.util.List;

public class BoardPageVO {
	private List<BoardVO> articleList;
	private int startPage;
	private int endPage;
	private int currentPage;
	private int totalPage;
	
	public BoardPageVO(List<BoardVO> articleList) {
		super();
		this.articleList = articleList;
	}
	public BoardPageVO(int startPage, int endPage, int currentPage, int totalPage) {
		super();
		this.startPage = startPage;
		this.endPage = endPage;
		this.currentPage = currentPage;
		this.totalPage = totalPage;
	}
	public BoardPageVO(List<BoardVO> articleList, int startPage, int endPage, int currentPage, int totalPage) {
		super();
		this.articleList = articleList;
		this.startPage = startPage;
		this.endPage = endPage;
		this.currentPage = currentPage;
		this.totalPage = totalPage;
	}
	public List<BoardVO> getArticleList() {
		return articleList;
	}
	public int getStartPage() {
		return startPage;
	}
	public int getEndPage() {
		return endPage;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setArticleList(List<BoardVO> articleList) {
		this.articleList = articleList;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

}
