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
		String hi = "Привет"; 
	%>
	
	<%=hi%>
	
	<h2> Сегодня: <%=LocalDateTime.now().getHour()%>:<%=LocalDateTime.now().getMinute()%>:<%=LocalDateTime.now().getSecond()%></h2> 
	
</body>
</html>