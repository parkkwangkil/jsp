package servlet2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JavaTest02")
public class JavaTest02 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String item = request.getParameter("item");
		System.out.println("item �Ķ����"+item);
		///////////////////////////////////////////////////////
		String[] items = request.getParameterValues("item");
		for(String s : items){
			System.out.println("������"+s);
		}
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter writer = response.getWriter();
		writer.println("<html>");
		writer.println("<head>");
		writer.println("<title> JavaTest02�� ����ȭ�� </title>");
		writer.println("</head>");
		writer.println("<body>");
		writer.println("�ƹ� �����̳� ���");
		writer.println("</body>");
		writer.print("</html>");
		writer.close();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
