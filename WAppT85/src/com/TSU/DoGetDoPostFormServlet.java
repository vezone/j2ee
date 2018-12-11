package com.TSU;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/DoGetDoPostFormServlet")
public class DoGetDoPostFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public DoGetDoPostFormServlet() 
    {
        super();
    }
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		response.setContentType("text/html;charset=utf-8");
		
		String firstName  = request.getParameter("FirstName");
		String secondName = request.getParameter("SecondName");
		String group = request.getParameter("Group");
		String taskNumber = request.getParameter("TaskNumber");
		
		//session
		HttpSession httpSession = request.getSession();
		if (firstName != null && secondName != null && 
			group != null && taskNumber != null)
		{
			httpSession.setAttribute("FirstName", firstName);
			httpSession.setAttribute("SecondName", secondName);
			httpSession.setAttribute("Group", group);
			httpSession.setAttribute("TaskNumber", taskNumber);
		}
		
		//context
		ServletContext context = request.getServletContext();
		context.setAttribute("ContextAttribute", "Value");
		
		PrintWriter writer = response.getWriter();
		writer.println("<h2>Привет, " + 
				firstName + " " + secondName + "! Твоя группа " + group + ", номер задачи " + taskNumber + "</h2>");
		writer.close();
	}

}
