<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	
	<head>
		<meta charset="ISO-8859-1">
		<title>Remover Turma</title>
	</head>
	
	<body>
		<form action="${servletRemoverInstituicao}" method="POST">
			<b>ID: </b> <input type="text" name="id"/>
			<br><br>
			<input type="submit"/>
		</form>
	</body>
	
</html>