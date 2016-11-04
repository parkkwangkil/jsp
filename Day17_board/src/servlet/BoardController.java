package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.BoardService;
import vo.ArticlePageVO;
import vo.ArticleVO;

@WebServlet("/board.do")
public class BoardController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		execute(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("euc-kr");
		execute(req, resp);
	}

	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		String viewPath = "";
		
		BoardService service = BoardService.getInstance();
		
		if(action==null || action.equals("boardList")){
			// action main : 게시판 목록보기
			String pageStr = request.getParameter("page");
			int page = 1;
			if(pageStr!=null && pageStr.length()>0){
				page = Integer.parseInt(pageStr);
			}
			ArticlePageVO articlePage = service.makePage(page);
			request.setAttribute("articlePage", articlePage);
			
			viewPath = "board_list.jsp";
		} else if(action.equals("writeForm")){
			HttpSession session = request.getSession();
			if(session.getAttribute("loginId")==null){
				viewPath="index.jsp";
			}else{
				viewPath = "write_form.jsp";
			}
		} else if(action.equals("write")) {
			HttpSession session = request.getSession();
			String loginId = (String)session.getAttribute("loginId");
			if (loginId == null) {
				viewPath = "index.jsp";
			} else {
				// 로그인 된 사람만 글쓰기됨
				String title = request.getParameter("title");
				String content = request.getParameter("content");
				
				ArticleVO article = new ArticleVO();
				article.setTitle(title);
				article.setContent(content);
				article.setId(loginId); // 세션에 있는 아이디를 글쓴이로
				
				int result = service.write(article);
				request.setAttribute("writeResult", result);
				viewPath = "write_result.jsp";
			}
		} else if(action.equals("read")){
			String articleNumStr = request.getParameter("articleNum");
			int articleNum = 0;
			
			if(articleNumStr!=null && articleNumStr.length()>0){
				articleNum = Integer.parseInt(articleNumStr);
			}
			
			ArticleVO article = service.read(articleNum);
			
			System.out.println("article:"+article);
			request.setAttribute("article", article);
			viewPath = "read.jsp";
		} else if(action.equals("updateForm")){
			String articleNumStr = request.getParameter("articleNum");
			int articleNum = 0;
			if(articleNumStr!=null && articleNumStr.length()>0){
				articleNum = Integer.parseInt(articleNumStr);
			}
			
			ArticleVO original = service.readWithoutReadCount(articleNum);
			request.setAttribute("original", original);
			viewPath = "update_form.jsp";
		} else if(action.equals("update")){
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			String articleNumStr = request.getParameter("articleNum");
			int articleNum = 0;
			
			if(articleNumStr!=null && articleNumStr.length()>0){
				articleNum = Integer.parseInt(articleNumStr);
			}

			ArticleVO article = new ArticleVO();
			article.setArticleNum(articleNum);
			article.setTitle(title);
			article.setContent(content);
			
			HttpSession session = request.getSession();
			article.setId((String)session.getAttribute("loginId"));
			
			boolean result = service.modify(article);
			request.setAttribute("updateResult", result);
			viewPath = "update_result.jsp";
		} else if (action.equals("delete")){
			String articleNumStr = request.getParameter("articleNum");
			int articleNum = 0;
			
			if(articleNumStr!=null && articleNumStr.length()>0){
				articleNum = Integer.parseInt(articleNumStr);
			}
			
			HttpSession session = request.getSession();
			String id = (String)session.getAttribute("loginId");
			
			boolean result = service.remove(articleNum, id);
			request.setAttribute("deleteResult", result);
			viewPath = "delete_result.jsp";
		}
		
		RequestDispatcher dispatcher = 
				request.getRequestDispatcher(viewPath);
		dispatcher.forward(request, response);
	}
}
