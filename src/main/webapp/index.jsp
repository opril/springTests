<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 
pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Spring 4 MVC - HelloWorld Index Page</title>
</head>
<body>
 
	<center>
		<h2>Hello World</h2>
		<h3>
			<a href="hello?name=Eric">Click Here</a>
		</h3>
	</center>
	
	<form:form method="POST" action="/addPerson" modelAttribute="person">
	     <table>
	        <tr>
	            <td><form:label path="name">Name</form:label></td>
	            <td><form:input path="name"/></td>
	        </tr>
	        <tr>
	            <td><form:label path="id">Id</form:label></td>
	            <td><form:input path="id"/></td>
	        </tr>
	        <tr>
	            <td><input type="submit" value="Submit"/></td>
	        </tr>
	    </table>
	</form:form>
</body>
</html>
