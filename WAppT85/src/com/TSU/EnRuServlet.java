package com.TSU;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EnRuServlet")
public class EnRuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public EnRuServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		response.setHeader("Content-Language", "ru");
		request.getSession().setAttribute("langru", response.getHeader("Content-Language"));
		javax.servlet.RequestDispatcher rd =
				request.getRequestDispatcher("/EnToRuPage.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
