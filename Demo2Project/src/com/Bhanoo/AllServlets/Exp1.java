package com.Bhanoo.AllServlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Exp1 extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		PrintWriter out=res.getWriter();
		String name=req.getParameter("name");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Servlet File</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>This is a servlet Response : "+name+"</h1>");
		out.println("</body>");
		out.println("</html>");
	}
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		doGet(req,res);
	}
}
