package servlet;

import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/download.do")
public class DownloadServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String folderPath ="c:/lovespitz/";
	String filename ="cos.jar";
	String fileURL = folderPath + filename;
						// 화면이 변하지 않을 것이다.
	response.setHeader("content-Disposition", "attachment;filename="+ new String(filename.getBytes(),"ISO8859_1"));
	
	FileInputStream fis = new FileInputStream(fileURL);
	ServletOutputStream sos = response.getOutputStream();
	
	byte[] buf = new byte[1024];
	int size = 0;
	while((size = fis.read(buf))!=-1){
		sos.write(buf,0,size);
		sos.flush();
	}
	fis.close();
	sos.close();
	}

}
