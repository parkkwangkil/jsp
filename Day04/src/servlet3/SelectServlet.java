package servlet3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/SelectServlet")
public class SelectServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String job=request.getParameter("job");
	String interests[] = request.getParameterValues("interest");	
	response.setContentType("text/html; charset=UTF-8");
	PrintWriter writer =  response.getWriter();
	writer.print("<html><body>");
	writer.println("당신이 선택한 직업 : <b>" );
	writer.print(job);
	writer.println("</b><hr>당신이 선택한 관심 분야:<b>");
	if(interests == null){
		
	}else{
		for(String interest : interests){
			writer.print(interest+"");
		}
	}
	
	writer.println("</b><br><a href='javascript:history.go(-1)'>다시</a>");
	writer.print("</body>");
	writer.print("</html>");
	writer.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
