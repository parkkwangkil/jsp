package controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.MemberDAO;
import vo.MemberVO;

public class JoinAction implements Action{

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  String url = "join.jsp"; 
		    
		    HttpSession session = request.getSession();
		    
		    MemberVO memberVO = new MemberVO();
		    
		    memberVO.setId(request.getParameter("id"));
		    memberVO.setPassword(request.getParameter("password"));
		    memberVO.setEmail(request.getParameter("email"));   
		      
		    session.setAttribute("id", request.getParameter("id"));    
		    
		    MemberDAO memberDAO = MemberDAO.getInstance();
		    memberDAO.insertMember(memberVO);

		    
		    RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		    dispatcher.forward(request, response);
		  }
		}
