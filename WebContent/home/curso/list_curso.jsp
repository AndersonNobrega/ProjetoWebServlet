<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value="/" var="servletHome"/>
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
		<a href="${servletHome}">Home</a>
		
		<h2>Cursos:</h2>
		<ul>
			<c:forEach items="${cursos}" var="curso">
				<li>ID: ${curso.id} - Nome: ${curso.nome}</li>		
				<br>
			</c:forEach>
		</ul>
		
		<a href="${servletCriarCurso}">Cadastrar</a> | <a href="${servletAtualizarCurso}">Atualizar</a> | <a href="${servletRemoverCurso}">Remover</a>
	</body>
	
</html>