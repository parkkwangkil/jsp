package vo;

import java.sql.Timestamp;

public class BoardVO {
	private int num;
	private String title;
	private String content;
	private String writer;
	private Timestamp writeDate;
	private int readCount;
	private int voteCount;
	private String videoPath;
	private String imagePath;
	private String closed;

	public BoardVO() {

	}

	public BoardVO(int num, String title, String content, String writer, Timestamp writeDate, int readCount,
			int voteCount, String videoPath, String imagePath, String closed) {
		super();
		this.num = num;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.writeDate = writeDate;
		this.readCount = readCount;
		this.voteCount = voteCount;
		this.videoPath = videoPath;
		this.imagePath = imagePath;
		this.closed = closed;
	}

	public int getNum() {
		return num;
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

	public Timestamp getWriteDate() {
		return writeDate;
	}

	public int getReadCount() {
		return readCount;
	}

	public int getVoteCount() {
		return voteCount;
	}

	public String getVideoPath() {
		return videoPath;
	}

	public String getImagePath() {
		return imagePath;
	}

	public String getClosed() {
		return closed;
	}

	public void setNum(int num) {
		this.num = num;
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

	public void setWriteDate(Timestamp writeDate) {
		this.writeDate = writeDate;
	}

	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}

	public void setVoteCount(int voteCount) {
		this.voteCount = voteCount;
	}

	public void setVideoPath(String videoPath) {
		this.videoPath = videoPath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public void setClosed(String closed) {
		this.closed = closed;
	}

	@Override
	public String toString() {
		return "BoardVO [num=" + num + ", title=" + title + ", content=" + content + ", writer=" + writer
				+ ", writeDate=" + writeDate + ", readCount=" + readCount + ", voteCount=" + voteCount + ", videoPath="
				+ videoPath + ", imagePath=" + imagePath + ", closed=" + closed + "]";
	}

	public int getArticleNum() {
		// TODO Auto-generated method stub
		return 0;
	}

}
