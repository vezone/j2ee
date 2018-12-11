<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@
	page import = "com.Utils.DBConnection"
 %>

<!DOCTYPE html>

<html>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>

	<h2>Database info: </h2> <br>	
	<%
		DBConnection conn = new DBConnection();
		String result = conn.ExecuteSql();
		
		String[] separated = result.split("\n");
		String[] wSeparated;
		for (int i = 0; i < separated.length; i++)
		{
			wSeparated = separated[i].split(" ");
			
	%>
			<h2> Id: <%=wSeparated[0]%></h2>
			<h2> Name: <%=wSeparated[1]%></h2>
			<h2> Sunname: <%=wSeparated[2]%></h2>		
	<%				
			
		}
	%>
	
	
</body>

</html>