<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value="/turma/info" var="servletInfoTurma"/>

<!DOCTYPE html>
<html>
	
	<head>
		<meta charset="ISO-8859-1">
		<title>Lista Turmas</title>
	</head>
	
	<body>
		
		<h2>Turmas:</h2>
	
		<ul>
			<c:forEach items="${turmas}" var="instituicao">
				<li>Vagas: ${turma.vagas} - Id Curso Ofertado: ${instituicao.cursoOfertadoId}<a href="/home/turma/info?id=${instituicao.id}">Mais Informações</a></li>
				<br>
			</c:forEach>
		</ul>
	</body>
	
</html>