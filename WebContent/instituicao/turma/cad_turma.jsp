<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/turma/criar" var="servletCriarTurma"/>

<!DOCTYPE html>
<html>
	
	<head>
		<meta charset="ISO-8859-1">
		<title>SNES</title>
	</head>
	
	<body>
	
		<h2>Cadastrar Turma:</h2>
		<form action="${servletCriarTurma}" method="POST">
			<b>Vagas: </b><input type="number" name="vagas"/>
			<br><br>
			<b>ID do Curso: </b><input type="number" name="cursoOfertadoId"/>
			<br><br>
			<input type="submit"/>
		</form>
	</body>
	
</html>