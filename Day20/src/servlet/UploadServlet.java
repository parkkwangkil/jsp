package servlet;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("/upload.do")
public class UploadServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		String uploadFolder = "c://lovespitz//";
		MultipartRequest mRequest = new MultipartRequest(request, uploadFolder, 1024 * 1024 * 5, "euc-kr",
				new DefaultFileRenamePolicy());

		File file = mRequest.getFile("uploadFile");

		System.out.println("���� ���� �̸�:" + mRequest.getOriginalFileName("uploadFile"));
		System.out.println("����� �̸�:" + file.getName());
		System.out.println("����� ��ü ���:" + file.getAbsolutePath());
		System.out.println("���� �ƴ� �Ϲ� �Ķ����:" + mRequest.getParameter("param"));
		
	}
}