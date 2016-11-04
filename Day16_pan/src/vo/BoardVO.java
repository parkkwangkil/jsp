package vo;

import java.sql.Timestamp;

public class BoardVO {
	private int article_id;
	private int group_id;
	private int sequence_no;
	private int read_count;
	private Timestamp writer_date;
	private String writer;
	private String password;
	private String title;
	private String content;
	private String index;

	public BoardVO(int article_id) {
		super();
		this.article_id = article_id;
	}

	public BoardVO(int group_id, int sequence_no, int read_count, Timestamp writer_date, String writer, String password,
			String title, String content, String index) {
		super();
		this.group_id = group_id;
		this.sequence_no = sequence_no;
		this.read_count = read_count;
		this.writer_date = writer_date;
		this.writer = writer;
		this.password = password;
		this.title = title;
		this.content = content;
		this.index = index;
	}

	public BoardVO(int article_id, int group_id, int sequence_no, int read_count, Timestamp writer_date, String writer,
			String password, String title, String content, String index) {
		super();
		this.article_id = article_id;
		this.group_id = group_id;
		this.sequence_no = sequence_no;
		this.read_count = read_count;
		this.writer_date = writer_date;
		this.writer = writer;
		this.password = password;
		this.title = title;
		this.content = content;
		this.index = index;
	}

	public BoardVO() {}

	public int getArticle_id() {
		return article_id;
	}

	public int getGroup_id() {
		return group_id;
	}

	public int getSequence_no() {
		return sequence_no;
	}

	public int getRead_count() {
		return read_count;
	}

	public Timestamp getWriter_date() {
		return writer_date;
	}

	public String getWriter() {
		return writer;
	}

	public String getPassword() {
		return password;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public String getIndex() {
		return index;
	}

	public void setArticle_id(int article_id) {
		this.article_id = article_id;
	}

	public void setGroup_id(int group_id) {
		this.group_id = group_id;
	}

	public void setSequence_no(int sequence_no) {
		this.sequence_no = sequence_no;
	}

	public void setRead_count(int read_count) {
		this.read_count = read_count;
	}

	
	public void setWriter_date(Timestamp writer_date) {
		this.writer_date = writer_date;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setIndex(String index) {
		this.index = index;
	}

}
