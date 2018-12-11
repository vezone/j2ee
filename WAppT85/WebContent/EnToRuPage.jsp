<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Enpage</title>
</head>
<body>
	
	<%
		String Init = (String)request.getSession().getAttribute("InitEn");
		if (Init == null || Init.equals("0"))
		{
			request.getSession().setAttribute("InitEn", "1");
			javax.servlet.RequestDispatcher rd =
				request.getRequestDispatcher("/EnRuServlet");
			rd.forward(request, response);
		}
		request.getSession().setAttribute("InitEn", "0");
		
		String header = (String)request.getSession().getAttribute("langru");
		
	%>
	
	<%
		if (header.equals("en"))
		{
	%>
	
	Some words in english
	
	<% 
		}
		else if (header.equals("ru"))
		{
	%>
	
	Какие-то слова на ангийском
	
	<%
		}
	%>
	
	
</body>
</html>