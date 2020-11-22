<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/turma/remover" var="servletRemoverTurma"/>
<!DOCTYPE html>
<html>
	
	<head>
		<meta charset="ISO-8859-1">
		<title>SNES</title>
	</head>
	
	<body>
	
		<h2>Remover Turma:</h2>
		<form action="${servletRemoverTurma}" method="POST">
			<b>ID: </b> <input type="text" name="id"/>
			<br><br>
			<input type="submit"/>
		</form>
	</body>
	
</html>