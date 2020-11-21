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
		<title>Cursos da Instituição</title>
	</head>
	
	<body>
	
		<a href="${servletHome}">Home</a>
	
		<h2>Lista dos Cursos Ofertados:</h2>
		<ul>
			<c:forEach items="${cursos}" var="curso">
				<li>ID: ${curso.id} - Coordenador: ${curso.coordenador} - Vagas: ${curso.vagas} - Instituição ID: ${curso.instituicaoId} - Curso ID: ${curso.cursoId}<a href="/ProjetoWebServlet/curso/info?id=${curso.cursoId}"> Mais Informações</a></li>
				<br>
			</c:forEach>
		</ul>
		<a href="${servletCriarCursoOfertado}">Ofertar na Instituição</a> | <a href="${servletRemoverCursoOfertado }">Remover da Instituição</a>
	</body>
	
</html>