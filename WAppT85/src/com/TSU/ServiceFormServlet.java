package com.TSU;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServiceFormServlet")
public class ServiceFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServiceFormServlet() 
    {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		response.setContentType("text/html;charset=utf-8");
		
		String firstName  = request.getParameter("FirstName");
		String secondName = request.getParameter("SecondName");
		String group = request.getParameter("Group");
		String taskNumber = request.getParameter("TaskNumber");
		PrintWriter writer = response.getWriter();
		writer.println("<h2>Привет, " + 
				firstName + " " + secondName + "!<p>Твоя группа " + group + "<p>Номер задачи " + taskNumber + "</h2>");
		writer.close();
	}

}
