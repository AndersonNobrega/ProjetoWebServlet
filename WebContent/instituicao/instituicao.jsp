<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/instituicao" var="servletInstituicao"/>
<c:url value="/cursoOfertado/criar" var="servletCriarCursoOfertado"/>
<c:url value="/cursoOfertado/remover" var="servletRemoverCursoOfertado"/>
<c:url value="/cursoOfertado" var="servletListarCursoOfertado"/>
<c:url value="/turma" var="servletTurma"/>
<c:url value="/turma/criar" var="servletCriarTurma"/>
<c:url value="/turma/remover" var="servletRemoverTurma"/>
<c:url value="/turma/atualizar" var="servletAtualizarTurma"/>

<!DOCTYPE html>
<html>
	
	<head>
		<meta charset="ISO-8859-1">
		<title>SNES</title>
	</head>
	
	<body>
		<a href="${servletInstituicao}">Instituições</a>
		
		<h1>${nome}</h1>
		
		<h2>Cursos</h2>
		<a href="${servletCriarCursoOfertado}">Ofertar Curso</a>
		<br><br>
		<a href="${servletRemoverCursoOfertado}">Remover Curso</a>
		<br><br>
		<a href="${servletListarCursoOfertado}">Listar Cursos</a>
		<br><br>
		
		<h2>Turma</h2>
		<a href="${servletRemoverTurma}">Cadastrar Turma</a>
		<br><br>
		<a href="${servletRemoverTurma}">Remover Turma</a>
		<br><br>
		<a href="${servletTurma}">Listar Turmas</a>
		<br><br>
		<a href="${servletAtualizarTurma}">Atualizar Turma</a>
	</body>
	
</html>