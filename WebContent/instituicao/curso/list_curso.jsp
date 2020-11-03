<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value="/curso/info" var="servletInfocurso"/>

<!DOCTYPE html>
<html>

	<head>
		<meta charset="ISO-8859-1">
		<title>Cursos da Instituição</title>
	</head>
	
	<body>
		<h2>Instituições:</h2>
		<ul>
			<c:forEach items="${cursos}" var="curso">
				<li>ID: ${curso.id} - Nome: ${curso.nome} <a href="/home/curso/info?id=${curso.id}">Mais Informações</a></li>
				<br>
			</c:forEach>
		</ul>
	</body>
	
</html>