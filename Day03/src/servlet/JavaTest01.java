package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JavaTest01")
public class JavaTest01 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String cName = request.getParameter("clientName");
		System.out.println("JavaTest01 서블릿이 Get방식 요청을 받음" + cName);
		response.setContentType("text/html;charset=UTF-8"); // 한글처리
		PrintWriter writer = response.getWriter();
		writer.println("<html>");
		writer.println("	<head>");
		writer.println("		<title> 자바 서블릿의 응답화면 </title>");
		writer.println("	</head>");
		
		writer.println("	<body>");
		writer.println("<h3>당신이 보낸 clientName 값:"+cName+"</h3>");
		writer.println("	</body>");
		writer.println("</html>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String cName = request.getParameter("clientName");
		System.out.println("JavaTest01 서블릿이 Post방식 요청을 받음" + cName);
		response.setContentType("text/html;charset=UTF-8"); // 한글처리
		PrintWriter writer = response.getWriter();
		writer.println("<html>");
		writer.println("	<head>");
		writer.println("		<title> 자바 서블릿의 응답화면 </title>");
		writer.println("	</head>");
		
		writer.println("	<body>");
		writer.println("<h3>당신이 보낸 clientName 값:"+cName+"</h3>");
		writer.println("	</body>");
		writer.println("</html>");
	}

}
