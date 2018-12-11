<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@
	page import = "com.EJB.Calclator"
%>

<html>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>

	<form action="ServiceFormServlet" method="get">
		<table>
			<tr>
				<td>Имя</td>
				<td><input type="textfield" name=result  ></td>
			</tr>
			
			<tr>
				<td><input type="button" value="1"></td>
				<td><input type="button" value="2"></td>
				<td><input type="button" value="3"></td>
		    </tr>
		    
		    <tr>
				<td><input type="button" value="4"></td>
				<td><input type="button" value="5"></td>
				<td><input type="button" value="6"></td>
		    </tr>
		    
		    <tr>
				<td><input type="button" value="7"></td>
				<td><input type="button" value="8"></td>
				<td><input type="button" value="9"></td>
		    </tr>
		    
		</table>
	</form>

	<%
		Calclator calc = new Calclator();
		
	%>

</body>

</html>