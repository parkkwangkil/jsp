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
			// ���� ������ ���ε�� ���� ��� �����ֱ�

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
		// ���� ���ε�� post�� ���⼭ ����
		request.setCharacterEncoding("euc-kr");
		String uploadFolder = "c://lovespitz//";
		MultipartRequest mRequest = new MultipartRequest(request, uploadFolder, 1024 * 1024 * 5, "euc-kr",
				new DefaultFileRenamePolicy());
		// ���������� ����Ǵ� ����
		File file = mRequest.getFile("uploadFile");
		// ������ ����� ���� ������ db�� insert ��Ű��
		FileVO fileVO = new FileVO();
		fileVO.setFileName(mRequest.getOriginalFileName("uploadFile"));
		fileVO.setSavePath(file.getAbsolutePath());
		fileVO.setFileSize((int) file.length());
		fileVO.setDownCount(0);// �ٿ�Ƚ�� �ʱ�ȭ

		int result = dao.insert(fileVO);
		// db �۾� ����� request�� ����ؼ� forward
		request.setAttribute("uploadResult", result);

		RequestDispatcher dispatcher = request.getRequestDispatcher("upload_result.jsp");
		dispatcher.forward(request, response);

	}
}