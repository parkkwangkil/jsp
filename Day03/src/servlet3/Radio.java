package servlet3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Radio")
public class Radio extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		String gender = request.getParameter("gender");
		String chk_mail = request.getParameter("chk_mail");
		String content = request.getParameter("content");

		PrintWriter writer = response.getWriter();
		writer.print("<html><body>");
		writer.println("����� �Է��� ���� �Դϴ�<hr>");
		writer.println("����:<b>" + gender);
		writer.println("</b><br> ���� ���� ���ſ��� : <b>" + chk_mail);
		writer.println("</b><br> �����λ� : <b><pre>");
		writer.println(content);
		writer.println("</b></pre><a href='javascript:history.go(-1)'>�ٽ�</a>");
		writer.print("</body></html>");
		writer.close();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		String gender = request.getParameter("gender");
		String chk_mail = request.getParameter("chk_mail");
		String content = request.getParameter("content");

		PrintWriter writer = response.getWriter();
		writer.print("<html><body>");
		writer.println("����� �Է��� ���� �Դϴ�<hr>");
		writer.println("����:<b>" + gender);
		writer.println("</b><br> ���� ���� ���ſ��� : <b>" + chk_mail);
		writer.println("</b><br> �����λ� : <b><pre>");
		writer.println(content);
		writer.println("</b></pre><a href='javascript:history.go(-1)'>�ٽ�</a>");
		writer.print("</body></html>");
		writer.close();
	}

}
