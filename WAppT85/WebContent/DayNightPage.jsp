<%@ 
	page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>

<%@
	page import = "com.TSU.DayNightFilter"
%>

<%@
	page import = "javax.servlet.FilterChain"
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<% 
		String Init = (String)request.getSession().getAttribute("Init");
		if (Init == null || Init.equals("0"))
		{
			request.getSession().setAttribute("Init", "1");
			javax.servlet.RequestDispatcher rd =
				request.getRequestDispatcher("/DayNightServlet");
	    	rd.forward(request, response);
		}
		request.getSession().setAttribute("Init", "0");
		
		String IsDay = (String)request.getSession().getAttribute("IsDay");
		String Hours = (String)request.getSession().getAttribute("Hours");
		String Minutes = (String)request.getSession().getAttribute("Minutes");
		String Seconds = (String)request.getSession().getAttribute("Seconds");
		
		String AddedHours = (String)request.getSession().getAttribute("AddedHours");
		String AddedMinutes = (String)request.getSession().getAttribute("AddedMinutes");
		String AddedSeconds = (String)request.getSession().getAttribute("AddedSeconds");
	%>
	<h2> Page </h2>
	<%
		
		if (IsDay.equals("1"))
		{
	%>
		<h2> Day </h2>
		<img src="E:\Programming\JavaEE\WebApp\Additional\sun2.png" align=right> </image>
		<h2> Time: <%=Hours%>:<%=Minutes%>:<%=Seconds%></h2>
		<h2> Added Time: <%=AddedHours%>:<%=AddedMinutes%>:<%=AddedSeconds%></h2> 
	<%
		}
		else if (IsDay.equals("2"))
		{
	%>
		<h2> Night </h2>
		<img src="E:\Programming\JavaEE\WebApp\Additional\moon2.png" align=right> </image>
		<h2> Time: <%=Hours%>:<%=Minutes%>:<%=Seconds%></h2>
		<h2> Added Time: <%=AddedHours%>:<%=AddedMinutes%>:<%=AddedSeconds%></h2> 
	<%
		}
	%>
	
</body>
</html>