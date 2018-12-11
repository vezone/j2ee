package com.TSU;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JSPNameServlet
 */
@WebServlet("/JSPNameServlet")
public class JSPNameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	javax.servlet.RequestDispatcher rd;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JSPNameServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("Name");
		request.getSession().setAttribute("Name", name);
		if (rd == null)
		{
			rd = request.getRequestDispatcher("/Params.jsp");
		}
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
