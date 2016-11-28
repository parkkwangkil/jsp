package controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDAO;

public class IdCheckFormAction implements Action{

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "idcheck.jsp";  
	    
	    String id = request.getParameter("id").trim();
	    
	    MemberDAO memberDAO=MemberDAO.getInstance();
	    int message = memberDAO.confirmID(id);
	        
	    request.setAttribute("message", message);
	    request.setAttribute("id", id);
	    RequestDispatcher dispatcher = request.getRequestDispatcher(url);
	    dispatcher.forward(request, response);
	  }
	}
