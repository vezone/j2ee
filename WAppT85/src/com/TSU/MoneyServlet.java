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

@WebServlet("/MoneyServlet")
public class MoneyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public MoneyServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		response.setContentType("text/html;charset=utf-8");
		
		String money  = request.getParameter("Money");
		String exchangeRate = request.getParameter("ExchangeRate");
		
		PrintWriter writer = response.getWriter();
		
		double result = Double.parseDouble(money) *
				Double.parseDouble(exchangeRate);
		if (result > 1000)
		{
			writer.println("<h2>" + "Money = <font color=red>" + result + "</font></h2>");
		}
		else
		{
			writer.println("<h2>" + "Money = <font color=green>"+ result + "</font></h2>");
		}
		
		writer.close();
	}

}
