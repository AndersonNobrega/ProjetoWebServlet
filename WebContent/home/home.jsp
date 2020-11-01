<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/instituicao" var="servletInstituicao"/>
<c:url value="/instituicao/criar" var="servletCriarInstituicao"/>
<c:url value="/instituicao/remover" var="servletRemoverInstituicao"/>
<c:url value="/instituicao/atualizar" var="servletAtualizarInstituicao"/>

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
			<li><a href="${servletRemoverInstituicao}">Remover Instituição</a></li>
			<br>
			<li><a href="${servletAtualizarInstituicao}">Atualizar Instituição</a></li>
		</ul>
		<h2>Curso</h2>
		<ul>
			<li><a href="http://localhost:8080/home/home/curso/list_cursos.jsp">Listar Cursos</a></li>
			<br>
			<li><a href="http://localhost:8080/home/home/curso/cad_curso.jsp">Cadastrar Curso</a></li>
			<br>
			<li><a href="http://localhost:8080/home/home/curso/rm_curso.jsp">Remover Curso</a></li>
			<br>
			<li><a href="http://localhost:8080/home/home/curso/att_curso.jsp">Atualizar Curso</a></li>
		</ul>
		
	</body>

</html>