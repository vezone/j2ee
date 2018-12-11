<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%!
		public int sum(int x1, int x2) { return x1 +x2; }
		public String variable="";
	%>
	
	<%
	for (int i = 70; i < 73; i++)
		variable += (char)i;
	out.println("variable value: " + variable);
	%>
	
	
</body>
</html>