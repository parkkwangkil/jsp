package servlet4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CheckBox")
public class CheckBox extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter writer = response.getWriter();
		writer.print("<html><body>");
		String items[] = request.getParameterValues("item");
		if (items == null) {
			writer.println("선택 항목이 없다.");
		} else {
			writer.println("선택한 항목이 맞습니다.");
			for (String item : items) {
				writer.print(item + "");
			}
		}

		writer.println("<br><a href='javascript:history.go(-1)'> 다시</a>");
		writer.print("<body></html>");
		writer.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
