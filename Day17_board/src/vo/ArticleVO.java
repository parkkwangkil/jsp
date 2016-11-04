package vo;

import java.sql.Date;

public class ArticleVO {
	private int articleNum;
	private String title;
	private String id;
	private String content;
	private Date writeDate;
	private int readCount;

	public ArticleVO() {
	}

	public ArticleVO(String title, String id, String content, Date writeDate, int readCount) {
		super();
		this.title = title;
		this.id = id;
		this.content = content;
		this.writeDate = writeDate;
		this.readCount = readCount;
	}

	public ArticleVO(int articleNum, String title, String id, String content, Date writeDate, int readCount) {
		super();
		this.articleNum = articleNum;
		this.title = title;
		this.id = id;
		this.content = content;
		this.writeDate = writeDate;
		this.readCount = readCount;
	}

	public int getArticleNum() {
		return articleNum;
	}

	public String getTitle() {
		return title;
	}

	public String getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

	public Date getWriteDate() {
		return writeDate;
	}

	public int getReadCount() {
		return readCount;
	}

	public void setArticleNum(int articleNum) {
		this.articleNum = articleNum;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}

	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}

	@Override
	public String toString() {
		return "ArticleVO [articleNum=" + articleNum + ", title=" + title + ", id=" + id + ", content=" + content
				+ ", writeDate=" + writeDate + ", readCount=" + readCount + "]";
	}

}
