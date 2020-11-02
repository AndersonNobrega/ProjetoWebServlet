<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/instituicao" var="servletInstituicao"/>
<c:url value="/instituicao/criar" var="servletCriarInstituicao"/>
<c:url value="/instituicao/remover" var="servletRemoverInstituicao"/>
<c:url value="/instituicao/atualizar" var="servletAtualizarInstituicao"/>
<c:url value="/curso" var="servletCurso"/>
<c:url value="/curso/criar" var="servletCriarCurso"/>
<c:url value="/curso/remover" var="servletRemoverCurso"/>
<c:url value="/curso/atualizar" var="servletAtualizarCurso"/>

<!DOCTYPE html>
<html>

	<head>
		<meta charset="ISO-8859-1">
		<title>SNES</title>
	</head>

	<body>
		
		<h1>Sistema Nacional de Ensino Superior</h1>
		<h2>Instituicao</h2>
		<ul>
			<li><a href="${servletInstituicao}">Listar Instituições</a></li>
			<br>
			<li><a href="${servletCriarInstituicao}">Cadastrar Instituição</a></li>
			<br>
			<li><a href="${servletAtualizarInstituicao}">Atualizar Instituição</a></li>
			<br>
			<li><a href="${servletRemoverInstituicao}">Remover Instituição</a></li>
			<br>
		</ul>
		<h2>Curso</h2>
		<ul>
			<li><a href="${servletCurso}">Listar Cursos</a></li>
			<br>
			<li><a href="${servletCriarCurso}">Cadastrar Curso</a></li>
			<br>
			<li><a href="${servletAtualizarCurso}">Atualizar Curso</a></li>
			<br>
			<li><a href="${servletRemoverCurso}">Remover Curso</a></li>
			<br>
		</ul>
		
	</body>

</html>