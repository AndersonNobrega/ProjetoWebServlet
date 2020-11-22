<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/instituicao" var="servletListaInstituições"/>

<!DOCTYPE html>
<html>
	
	<head>
		<meta charset="ISO-8859-1">
		<title>SNES</title>
	</head>
	
	<body>
		<a href="${servletListaInstituições}">Instituições</a>
		
		<h1>${nome}</h1>
		
		<h2>Cursos</h2>
		<a href="http://localhost:8080/cursoOfertado/criar">Ofertar Curso</a>
		<br><br>
		<a href="http://localhost:8080/cursoOfertado/remover">Remover Curso</a>
		<br><br>
		<a href="http://localhost:8080/cursoOfertado">Listar Cursos</a>
		<br><br>
		
		<h2>Turma</h2>
		<a href="http://localhost:8080/turma/criar">Cadastrar Turma</a>
		<br><br>
		<a href="http://localhost:8080/turma/remover">Remover Turma</a>
		<br><br>
		<a href="http://localhost:8080/turma">Listar Turmas</a>
		<br><br>
		<a href="http://localhost:8080/turma/atualizar">Atualizar Turma</a>
	</body>
	
</html>