package servlet2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

@WebServlet("/Login")
public class Login extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");

		PrintWriter writer = response.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		writer.println("����� �Է��� ���� �Դϴ�. <br>");
		writer.println("���̵� :");
		writer.println(id);
		writer.println("<br> ��й�ȣ :");
		writer.println(pwd);
		writer.println("<br><a href='javascript:history.go(-1)'>�ٽ� </a>");
		writer.print("</body></html>");
		writer.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");

		PrintWriter writer = response.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		writer.println("����� �Է��� ���� �Դϴ�. <br>");
		writer.println("���̵� :");
		writer.println(id);
		writer.println("<br> ��й�ȣ :");
		writer.println(pwd);
		writer.println("<br><a href='javascript:history.go(-1)'>�ٽ� </a>");
		writer.print("</body></html>");
		writer.close();
	}

}
