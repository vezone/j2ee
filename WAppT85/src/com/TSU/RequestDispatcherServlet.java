package com.TSU;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RequestDispatcherServlet")
public class RequestDispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RequestDispatcherServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		response.setContentType("text/html;charset=utf-8");
		RequestDispatcher requestDispatcher =
				getServletContext().getRequestDispatcher("/DoGetDoPostFormServlet");
		requestDispatcher.forward(request, response);
	}

}
