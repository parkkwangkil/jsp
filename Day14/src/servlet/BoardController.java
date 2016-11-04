package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/board.do")
public class BoardController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		execute(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		execute(request, response);

	}

	// doGet�̶� doPost�� �������̵��̰� �Ʒ��� execute�� ���� ����
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		String viewPath = "";

		if (action == null || action.equals("main")) {
			request.setAttribute("articlePage", "�Խñ� ��� ������");
			viewPath = "main.jsp";
		} else if (action.equals("writeForm")) {
			viewPath = "write_form.jsp";

		}else if(action.equals("write")){
			request.setAttribute("writeResult", "�۾��� ���� ��� ������");
			viewPath="write_result.jsp";
		}

		// ���õ� jsp �信�� forward �ϱ�
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
		dispatcher.forward(request, response);
	}
}