<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ 
	page import = "java.util.Date"
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%! 
		Date date1 = new Date();
	%>
	
	<%
		Date date2 = new Date();
	%>
	
	<h2> Date1: <%=date1%> </h2>
	<h2> Date2: <%=date2%> </h2>
	
</body>
</html>