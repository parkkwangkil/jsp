package controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardDao;
import vo.BoardVO;

public class BoardUpdateFormAction implements Action{

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url ="boardUpdate.jsp";
		
		String num= request.getParameter("num");
		
		BoardDao dao = BoardDao.getInstance();
		
		dao.updateReadCount(num);
		
		BoardVO board = dao.selectOneBoardByNum(num);
		request.setAttribute("board", board);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}
	

}
