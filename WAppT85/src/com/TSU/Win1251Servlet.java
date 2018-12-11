package com.TSU;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Win1251Servlet")
public class Win1251Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private Logger m_Logger = Logger.getLogger("com.TSU.Win1251Servlet");
    //it is here for now
    private Win1251Filter m_Filter = new Win1251Filter();
    
    public Win1251Servlet() { super(); }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		//request.setCharacterEncoding("cp1251");
		
		Cookie localCookie = null;
		Cookie[] cookies = request.getCookies();
		PrintWriter out = response.getWriter();
		
		out.println("[Encoding: "+response.getCharacterEncoding()+"]");
		
		if (cookies != null)
		{
			for (Cookie cookie : cookies)
			{
				if (cookie.getName().equals("NumberOfVisits"))
				{
					localCookie = cookie;
					Integer value = Integer.parseInt(localCookie.getValue()) + 1;
					m_Logger.info("Setting value of visits: " + value);
					localCookie.setValue(value.toString());
					out.println("<p>Hello, " + request.getParameter("Name") + "!<p>");
					out.println("Site already visited " + 
							localCookie.getValue() + 
							" times!");
					response.addCookie(localCookie);
				}
				if (cookie.getName().equals("Time"))
				{
					localCookie = cookie;
					out.println("<p>Last visit: " + localCookie.getValue());
					//String str = new Date().toString();
					String str = new SimpleDateFormat("HH:mm:ss").format(new Date());
					m_Logger.info("Setting date of visits: " + localCookie.getValue());
					localCookie.setValue(str);
					out.println("<p>Today: " + localCookie.getValue());
					response.addCookie(localCookie);
				}
			}
		}
		else
		{
			try
			{
				response.addCookie(new Cookie("NumberOfVisits", "0"));
				m_Logger.info("create number of visit cookie");
				out.println("Hello, " + request.getParameter("Name") + "!<p>");
				out.println("You already visited this site " + 0 + 
						" times!");
				
				//dd/M/yyyy
				String str1 = new SimpleDateFormat("HH:mm:ss").format(new Date());
				m_Logger.info("create date time cookie " + str1);
				response.addCookie(new Cookie("Time", str1));
				m_Logger.info("create date time cookie " + str1);
			}
			finally {
				out.close();
			}
		}
	}
	
	protected void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) 
			throws IOException, ServletException
	{
		response.setContentType("text/html;charset=UTF-8");
		m_Filter.doFilter(request, response, chain);
	}
	
}
