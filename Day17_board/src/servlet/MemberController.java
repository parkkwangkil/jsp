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
		// url이 아닌 post 방식에서는 한글 인코딩이 필요할 수 있다.
		request.setCharacterEncoding("euc-kr");
		execute(request, response);
	}

	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action"); // 제일 먼저 받음
		String viewPath = "";

		if (action.equals("joinForm")) {
			// 회원가입 양식 보여주기
			viewPath = "join_form.jsp";
		} else if (action.equals("join")) {
			// 입력한 내용으로 회원가입 진행
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
			session.invalidate(); // 세션 닫겠다.
			viewPath = "logout.jsp";
		}

		// 자바 서블릿의 작업이 끝났으면 jsp에게 forward 하기
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
		dispatcher.forward(request, response);

	}
}
