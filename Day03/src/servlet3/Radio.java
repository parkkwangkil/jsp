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
		writer.println("당신이 입력한 정보 입니다<hr>");
		writer.println("성별:<b>" + gender);
		writer.println("</b><br> 메일 정보 수신여부 : <b>" + chk_mail);
		writer.println("</b><br> 가입인사 : <b><pre>");
		writer.println(content);
		writer.println("</b></pre><a href='javascript:history.go(-1)'>다시</a>");
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
		writer.println("당신이 입력한 정보 입니다<hr>");
		writer.println("성별:<b>" + gender);
		writer.println("</b><br> 메일 정보 수신여부 : <b>" + chk_mail);
		writer.println("</b><br> 가입인사 : <b><pre>");
		writer.println(content);
		writer.println("</b></pre><a href='javascript:history.go(-1)'>다시</a>");
		writer.print("</body></html>");
		writer.close();
	}

}
