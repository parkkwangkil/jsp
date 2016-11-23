package servlet;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import VO.FileVO;
import dao.FileDAO;

@WebServlet("/file.do")
public class FileController extends HttpServlet {
	private FileDAO dao = FileDAO.getInstance();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		String viewPath = "";

		if (action == null || action.equals("fileList")) {
			// 현재 서버에 업로드된 파일 목록 보여주기

			List<FileVO> fileList = dao.selectFileList();
			request.setAttribute("fileList", fileList);
			viewPath = "file_list.jsp";
		} else if (action.equals("uploadForm")) {
			viewPath = "upload_form.jsp";
		
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
		dispatcher.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 파일 업로드시 post라서 여기서 실행
		request.setCharacterEncoding("euc-kr");
		String uploadFolder = "c://lovespitz//";
		MultipartRequest mRequest = new MultipartRequest(request, uploadFolder, 1024 * 1024 * 5, "euc-kr",
				new DefaultFileRenamePolicy());
		// 서버폴더에 저장되는 문장
		File file = mRequest.getFile("uploadFile");
		// 폴더에 저장된 파일 정보를 db에 insert 시키기
		FileVO fileVO = new FileVO();
		fileVO.setFileName(mRequest.getOriginalFileName("uploadFile"));
		fileVO.setSavePath(file.getAbsolutePath());
		fileVO.setFileSize((int) file.length());
		fileVO.setDownCount(0);// 다운횟수 초기화

		int result = dao.insert(fileVO);
		// db 작업 결과를 request에 기록해서 forward
		request.setAttribute("uploadResult", result);

		RequestDispatcher dispatcher = request.getRequestDispatcher("upload_result.jsp");
		dispatcher.forward(request, response);

	}
}