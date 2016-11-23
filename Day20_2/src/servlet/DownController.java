package servlet;

import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import VO.FileVO;
import dao.FileDAO;

@WebServlet("/download.do")
public class DownController extends HttpServlet {
	private FileDAO dao = FileDAO.getInstance();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String fileNumStr = request.getParameter("fileNum");
		int fileNum = 0;
		if (fileNumStr != null && fileNumStr.length() > 0) {
			fileNum = Integer.parseInt(fileNumStr);
		}
		FileVO fileVO = dao.selectFile(fileNum); // 파일 정보 조회
		String fileURL = fileVO.getSavePath(); // 서버 저장 경로
		// 화면이 변하지 않을 것이다.
		response.setHeader("content-Disposition",
				"attachment;filename=" + new String(fileVO.getFileName().getBytes(), "ISO8859_1"));

		FileInputStream fis = new FileInputStream(fileURL);
		ServletOutputStream sos = response.getOutputStream();

		byte[] buf = new byte[1024];
		int size = 0;
		while ((size = fis.read(buf)) != -1) {
			sos.write(buf, 0, size);
			sos.flush();
		}
		fis.close();
		sos.close();
	}

}
