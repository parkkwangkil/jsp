package VO;

public class FileVO {
	private int fileNum;
	private String fileName;
	private String savePath;
	private int downCount;
	private int fileSize;

	public FileVO() {
	}

	public FileVO(int fileNum, String fileName, String savePath, int downCount, int fileSize) {
		super();
		this.fileNum = fileNum;
		this.fileName = fileName;
		this.savePath = savePath;
		this.downCount = downCount;
		this.fileSize = fileSize;
	}

	public int getFileNum() {
		return fileNum;
	}

	public String getFileName() {
		return fileName;
	}

	public String getSavePath() {
		return savePath;
	}

	public int getDownCount() {
		return downCount;
	}

	public int getFileSize() {
		return fileSize;
	}

	public void setFileNum(int fileNum) {
		this.fileNum = fileNum;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}

	public void setDownCount(int downCount) {
		this.downCount = downCount;
	}

	public void setFileSize(int fileSize) {
		this.fileSize = fileSize;
	}

	@Override
	public String toString() {
		return "FileVO [fileNum=" + fileNum + ", fileName=" + fileName + ", savePath=" + savePath + ", downCount="
				+ downCount + ", fileSize=" + fileSize + "]";
	}

}
