<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/" var="servletHome"/>

<!DOCTYPE html>
<html>
	
	<head>
		<meta charset="ISO-8859-1">
		<title>SNES</title>
	</head>
	
	<body>
		<a href="${servletHome}">Home</a>
		
		<h1>${nome}</h1>
		
		<h2>Cursos</h2>
		<a href="http://localhost:8080/home/instituicao/cursoOfertado/criar_cursoOfertado.jsp">Ofertar Curso</a>
		<br><br>
		<a href="http://localhost:8080/home/instituicao/cursoOfertado/rm_cursoOfertado.jsp">Remover Curso</a>
		<br><br>
		<a href="http://localhost:8080/home/cursoOfertado">Listar Cursos</a>
		<br><br>
		
		<h2>Turma</h2>
		<a href="http://localhost:8080/home/instituicao/turma/cad_turma.jsp">Cadastrar Turma</a>
		<br><br>
		<a href="http://localhost:8080/home/instituicao/turma/rm_turma.jsp">Remover Turma</a>
		<br><br>
		<a href="http://localhost:8080/home/instituicao/turma/list_turma.jsp">Listar Turmas</a>
		<br><br>
		<a href="http://localhost:8080/home/instituicao/turma/att_turma.jsp">Atualizar Turma</a>
	</body>
	
</html>