<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/aluno" var="servletListarAluno"/>
<c:url value="/aluno/criar" var="servletCriarAluno"/>
<c:url value="/aluno/remover" var="servletRemoverAluno"/>
<c:url value="/aluno/atualizar" var="servletAtualizarAluno"/>

<!DOCTYPE html>
<html>
	
	<head>
		<meta charset="ISO-8859-1">
		<title>SNES</title>
	</head>
	
	<body>
		<h2>Turma ${id}:</h2>
		
		<a href="${servletListarAluno}?turmaId=${id}">Listar Alunos</a>
		<br><br>
		<a href="${servletCriarAluno}">Cadastrar Aluno</a>
		<br><br>
		<a href="${servletRemoverAluno}">Remover Aluno</a>
		<br><br>
		<a href="${servletAtualizarAluno}">Atualizar Aluno</a>
		<br><br>
	</body>
	
</html>