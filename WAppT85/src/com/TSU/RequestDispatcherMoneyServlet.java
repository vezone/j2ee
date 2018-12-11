package com.TSU;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RequestDispatcherMoneyServlet")
public class RequestDispatcherMoneyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RequestDispatcherMoneyServlet() { super(); }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		response.setContentType("text/html;charset=utf-8");
		RequestDispatcher requestDispatcher =
				getServletContext().getRequestDispatcher("/MoneyServlet");
		requestDispatcher.forward(request, response);
	}

}
