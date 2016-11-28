package controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.MemberDAO;
import vo.MemberVO;

public class LoginAction implements Action {

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "login_fail.jsp";
		HttpSession session = request.getSession();

		String id = request.getParameter("id");
		String password = request.getParameter("password");

		MemberDAO memberDAO = MemberDAO.getInstance();

		MemberVO memberVO = memberDAO.getMember(id);

		if (memberVO != null) {
			if (memberVO.getPassword().equals(password)) {
				session.removeAttribute("id");
				session.setAttribute("loginUser", memberVO);
				url = "NonageServlet?command=index";
			}
		}

		request.getRequestDispatcher(url).forward(request, response);
	}
}
