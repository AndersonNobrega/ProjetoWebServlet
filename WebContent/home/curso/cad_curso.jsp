<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/" var="servletHome"/>
<c:url value="/curso/criar" var="servletCriarCurso"/>

<!DOCTYPE html>
<html>

	<head>
		<meta charset="ISO-8859-1">
		<title>SNES</title>
	</head>
	
	<body>
		<a href="${servletHome}">Home</a>
		
		<h2>Cadastrar Curso:</h2>
		<form action="${servletCriarCurso}" method="POST">
			<b>Nome: </b><input type="text" name="nome"/>
			<br><br>
			<input type="submit"/>
		</form>
	</body>
	
</html>