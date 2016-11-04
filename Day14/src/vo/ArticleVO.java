package vo;

import java.sql.Timestamp;

public class ArticleVO {
	private String title;
	private String content;
	private String writer;
	private String password;
	private Timestamp write_Date;
	private int read_count;
	private int readCount;

	private int articleId;

	public int getArticleId() {
		return articleId;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public String getWriter() {
		return writer;
	}

	public String getPassword() {
		return password;
	}

	public Timestamp getWrite_Date() {
		return write_Date;
	}

	public int getRead_count() {
		return read_count;
	}

	public int getReadCount() {
		return readCount;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setWrite_Date(Timestamp write_Date) {
		this.write_Date = write_Date;
	}

	public void setRead_count(int read_count) {
		this.read_count = read_count;
	}

	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}

	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}

}