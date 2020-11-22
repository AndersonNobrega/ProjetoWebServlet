<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value="/turma/info" var="servletInfoTurma"/>
<c:url value="/" var="servletHome"/>
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
		<a href="${servletHome}">Home</a>
		
		<h2>Turmas:</h2>
	
		<ul>
			<c:forEach items="${turmas}" var="turma">
				<li>ID: ${turma.id} - Vagas: ${turma.vagas} - ID do Curso Ofertado: ${turma.cursoOfertadoId} <a href="/turma/info?id=${turma.id}">Mais Informações</a></li>
				<br>
			</c:forEach>
		</ul>
		
		<a href="${servletCriarTurma}">Cadastrar</a> | <a href="${servletAtualizarTurma}">Atualizar</a> | <a href="${servletRemoverTurma}">Remover</a>
	</body>
	
</html>