package controller.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardDao;
import vo.BoardVO;

public class BoardVoteAction implements Action {

	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "boardVoteList.jsp";
		String key="";

		BoardDao dao = BoardDao.getInstance();
		List<BoardVO> boardVoteList = dao.selectAllBoards();
		request.setAttribute("boardVoteList", boardVoteList);
		
		  if (request.getParameter("key") != null) {
		      key = request.getParameter("key");
		    }
		  
//		  BoardDao dao= BoardDao.getInstance();
//		    ArrayList<BoardVO> memberList = dao.selectVoteCount(key);

		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
