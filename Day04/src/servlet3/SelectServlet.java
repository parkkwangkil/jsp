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
	writer.println("����� ������ ���� : <b>" );
	writer.print(job);
	writer.println("</b><hr>����� ������ ���� �о�:<b>");
	if(interests == null){
		
	}else{
		for(String interest : interests){
			writer.print(interest+"");
		}
	}
	
	writer.println("</b><br><a href='javascript:history.go(-1)'>�ٽ�</a>");
	writer.print("</body>");
	writer.print("</html>");
	writer.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
