package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HttpSessionDemo
 */
public class HttpSessionDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HttpSessionDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    int count=0;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw = response.getWriter();
		HttpSession hs = request.getSession();
		pw.println("<br> count value is "+count);
		if(hs.isNew()) {
			pw.println("<br>New Client");
		}else {
			pw.println("<br> Old Client");
		}
pw.println("<br>Session Id "+hs.getId());
pw.println("<br> Session Creation time "+new Date(hs.getCreationTime()));
pw.println("<br> Last Session Access time "+new Date(hs.getLastAccessedTime()));
pw.println("<br> Default time "+hs.getMaxInactiveInterval());
hs.setMaxInactiveInterval(600);
	count++;
	if(count%5==0) {
		hs.invalidate();
	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
