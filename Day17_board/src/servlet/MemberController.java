package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.MemberService;
import vo.MemberVO;

@WebServlet("/member.do")
public class MemberController extends HttpServlet {
	private MemberService service = MemberService.getInstance();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		execute(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// url�� �ƴ� post ��Ŀ����� �ѱ� ���ڵ��� �ʿ��� �� �ִ�.
		request.setCharacterEncoding("euc-kr");
		execute(request, response);
	}

	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action"); // ���� ���� ����
		String viewPath = "";

		if (action.equals("joinForm")) {
			// ȸ������ ��� �����ֱ�
			viewPath = "join_form.jsp";
		} else if (action.equals("join")) {
			// �Է��� �������� ȸ������ ����
			MemberVO member = new MemberVO();
			member.setId(request.getParameter("id"));
			member.setName(request.getParameter("name"));
			member.setEmail(request.getParameter("email"));
			member.setPassword(request.getParameter("password"));

			if (service.join(member) == true) {
				viewPath = "join_success.jsp";
			} else {
				viewPath = "join_fail.jsp";
			}
		} else if (action.equals("login")) {
			String id = request.getParameter("id");
			String password = request.getParameter("password");

			if (service.login(id, password) == true) {
				HttpSession session = request.getSession();
				session.setAttribute("loginId", id);
//				request.setAttribute("loginResult", "success");
//			} else {
//				request.setAttribute("loginResult", "fail");
			}
			viewPath = "login_result.jsp";
		}else if(action.equals("logout")){
			HttpSession session = request.getSession();
			session.invalidate(); // ���� �ݰڴ�.
			viewPath = "logout.jsp";
		}

		// �ڹ� ������ �۾��� �������� jsp���� forward �ϱ�
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
		dispatcher.forward(request, response);

	}
}
