<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="cp1251"%>
   
<%@ 
	page import = "java.time.LocalDateTime"
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="cp1251">
<title>Insert title here</title>
</head>
<body>
	<%!
		String hi = "������"; 
	%>
	
	<%=hi%>
	
	<h2> �������: <%=LocalDateTime.now().getHour()%>:<%=LocalDateTime.now().getMinute()%>:<%=LocalDateTime.now().getSecond()%></h2> 
	
</body>
</html>