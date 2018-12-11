<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ 
	page import = "com.TSU.JSP.NameJavaBean"
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	
	#before[required] + label {
	  position: relative;
	  display: inline-block;
	  vertical-align: middle;
	}
	#before[required] + label:before {
	  content: "\2709";
	  position: absolute;
	  right: 0.5em;
	  bottom: 0.01em;
	  font-size: 20px; 
	}
	
</style>
</head>


<body>

	
	<% 
		NameJavaBean bean = new NameJavaBean();
		String fi = (String)request.getSession().getAttribute("FormInit");
		if (fi == null || fi.equals("0"))
		{
			fi = "1";
			request.getSession().setAttribute("FormInit", "1");
	%>
		<form action="JSPNameServlet" method="get">
		<table>
			<tr>
				<td>Имя</td>
				<td><input type=text name=Name  placeholder="Имя" id="before" required> <label for="before">&nbsp;</label></td>
			</tr>
			<tr>
				<td align="right" colspan="2"><input type=submit value=Отправить></td>
		    </tr>
		</table>
	<%
		}
		request.getSession().setAttribute("FormInit", "0");
		bean.setName((String)request.getSession().getAttribute("Name"));
		
	%>

	<h2>Name: <%=bean.getName()%></h2>
</body>
</html>