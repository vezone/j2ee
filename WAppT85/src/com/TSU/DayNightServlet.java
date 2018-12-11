package com.TSU;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DayNightServlet")
public class DayNightServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public javax.servlet.RequestDispatcher rd; 
	
	public DayNightServlet() 
	{
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		request.getSession().setAttribute("Init", "1");

		request.getSession().setAttribute("IsDay", (String)request.getAttribute("IsDay"));
		
		request.getSession().setAttribute("Hours", (String)request.getAttribute("Hours"));
		request.getSession().setAttribute("Minutes", (String)request.getAttribute("Minutes"));
		request.getSession().setAttribute("Seconds", (String)request.getAttribute("Seconds"));
		
		request.getSession().setAttribute("AddedHours", (String)request.getAttribute("AddedHours"));
		request.getSession().setAttribute("AddedMinutes", (String)request.getAttribute("AddedMinutes"));
		request.getSession().setAttribute("AddedSeconds", (String)request.getAttribute("AddedSeconds"));
		
		if (rd == null)
			rd = request.getRequestDispatcher("/DayNightPage.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
