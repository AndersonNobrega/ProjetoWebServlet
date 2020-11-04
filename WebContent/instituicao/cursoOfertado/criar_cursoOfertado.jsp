<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/cursoOfertado/criar" var="servletCriarCursoOfertado"/>

<!DOCTYPE html>
<head>
		<meta charset="ISO-8859-1">
		<title>Ofertar Curso</title>
	</head>
	
	<body>
		<h2>Ofertar Curso:</h2>
		<form action="${servletCriarCursoOfertado}" method="POST">
			<b>coordenador: </b><input type="text" name="coordenador"/>
			<br>
			<b>vagas: </b><input type="text" name="vagas"/>
			<br>
			<b>instituicaoId: </b><input type="text" name="instituicaoId"/>
			<br>
			<b>cursoId: </b><input type="text" name="cursoId"/>
			<br>
			<input type="submit"/>
		</form>
	</body>