package view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		long time = System.currentTimeMillis();
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<h3>Servlet1:"+time+"</h3>");

		out.close();

		out.close();

		out.println("<h3>Servlet1:"+time+"</h3>");
		out.println("<h3>Servlet1:"+time+"</h3>");
<<<<<<< HEAD

		out.println("<h3>Servlet1:"+time+"</h3>");

		out.close();



=======
>>>>>>> branch 'master' of https://github.com/EEIT107Team06/repository.git
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}
}
