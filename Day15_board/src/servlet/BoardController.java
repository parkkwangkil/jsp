package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.BoardService;
import vo.ArticlePageVO;
import vo.ArticleVO;

@WebServlet(urlPatterns="/board.do")
public class BoardController extends HttpServlet {
	@Override
	protected void doGet
			(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		execute(req, resp);
	}
	
	@Override
	protected void doPost
			(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// form 태그에서 post방식으로 넘어오는 한글파라미터 인코딩
		req.setCharacterEncoding("euc-kr");
		execute(req, resp);
	}

	public void execute
		(HttpServletRequest request, HttpServletResponse response) 
				throws ServletException, IOException{
		String action = request.getParameter("action");
		String viewPath = "";
		
		BoardService service = BoardService.getInstance();
		
		if(action==null || action.equals("main")){
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
			viewPath = "write_form.jsp";
		} else if(action.equals("write")) {
			String title = request.getParameter("title");
			String writer = request.getParameter("writer");
			String content = request.getParameter("content");
			String password = request.getParameter("password");
			
			ArticleVO article = new ArticleVO();
			article.setTitle(title);
			article.setWriter(writer);
			article.setContent(content);
			article.setPassword(password);
			
			int result = service.write(article);
			request.setAttribute("writeResult", result);
			viewPath = "write_result.jsp";
		} else if(action.equals("read")){
			String articleIdStr = request.getParameter("articleId");
			int articleId = 0;
			
			if(articleIdStr!=null && articleIdStr.length()>0){
				articleId = Integer.parseInt(articleIdStr);
			}
			
			ArticleVO article = service.read(articleId);
			
			request.setAttribute("article", article);
			viewPath = "read.jsp";
		} else if(action.equals("updateForm")){
			String articleIdStr = request.getParameter("articleId");
			int articleId = 0;
			if(articleIdStr!=null && articleIdStr.length()>0){
				articleId = Integer.parseInt(articleIdStr);
			}
			
			ArticleVO original = service.readWithoutReadCount(articleId);
			request.setAttribute("original", original);
			viewPath = "update_form.jsp";
		} else if(action.equals("update")){
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			String password = request.getParameter("password");
			String articleIdStr = request.getParameter("articleId");
			int articleId = 0;
			
			if(articleIdStr!=null && articleIdStr.length()>0){
				articleId = Integer.parseInt(articleIdStr);
			}

			ArticleVO article = new ArticleVO();
			article.setArticleId(articleId);
			article.setTitle(title);
			article.setContent(content);
			article.setPassword(password);
			
			int result = service.modify(article);
			request.setAttribute("updateResult", result);
			viewPath = "update_result.jsp";
		} else if (action.equals("deleteForm")){
			viewPath = "delete_form.jsp";
		} else if (action.equals("delete")){
			String articleIdStr = request.getParameter("articleId");
			int articleId = 0;
			
			if(articleIdStr!=null && articleIdStr.length()>0){
				articleId = Integer.parseInt(articleIdStr);
			}
			String password = request.getParameter("password");
			
			int result = service.remove(articleId, password);
			request.setAttribute("deleteResult", result);
			viewPath = "delete_result.jsp";
		}
		
		RequestDispatcher dispatcher = 
				request.getRequestDispatcher(viewPath);
		dispatcher.forward(request, response);
	}
}









