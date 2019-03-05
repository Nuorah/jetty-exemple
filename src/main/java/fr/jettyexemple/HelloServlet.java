package fr.jettyexemple;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request,
			HttpServletResponse rep)
			throws ServletException, IOException {
		
		PrintWriter writer = rep.getWriter();
		writer.write("Hello");
	}

}
