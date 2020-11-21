<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value="/" var="servletHome"/>
<c:url value="/curso/info" var="servletInfocurso"/>
<c:url value="/cursoOfertado/criar" var="servletCriarCursoOfertado"/>
<c:url value="/cursoOfertado/remover" var="servletRemoverCursoOfertado"/>

<!DOCTYPE html>
<html>

	<head>
		
		<meta charset="ISO-8859-1">
		<title>Cursos da Institui��o</title>
	</head>
	
	<body>
	
		<a href="${servletHome}">Home</a>
	
		<h2>Lista dos Cursos Ofertados:</h2>
		<ul>
			<c:forEach items="${cursos}" var="curso">
				<li>ID: ${curso.id} - Coordenador: ${curso.coordenador} - Vagas: ${curso.vagas} - Institui��o ID: ${curso.instituicaoId} - Curso ID: ${curso.cursoId}<a href="/ProjetoWebServlet/curso/info?id=${curso.cursoId}"> Mais Informa��es</a></li>
				<br>
			</c:forEach>
		</ul>
		<a href="${servletCriarCursoOfertado}">Ofertar na Institui��o</a> | <a href="${servletRemoverCursoOfertado }">Remover da Institui��o</a>
	</body>
	
</html>