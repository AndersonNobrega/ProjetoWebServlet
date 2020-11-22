<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/aluno/remover" var="servletRemoverAluno"/>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="ISO-8859-1">
		<title>SNES</title>
	</head>
	
	<body>
	
		<h2>Remover Aluno:</h2>
		<form action="${servletRemoverAluno}" method="POST">
			<b>ID do Aluno: </b><input type="text" name="id"/>
			<br><br>
			<input type="submit"/>
		</form>
	</body>
	
</html>