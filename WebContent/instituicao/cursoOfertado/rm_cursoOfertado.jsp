<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/" var="servletHome"/>
<c:url value="/cursoOfertado/remover" var="servletRemoverCursoOfertado"/>

<!DOCTYPE html>
<html>

	<head>
		<meta charset="ISO-8859-1">
		<title>Remover Curso da Institui��o</title>
	</head>
	
	<body>
		
		<h1>Remover Curso da Institui��o</h1>
		
		<form action="${servletRemoverCursoOfertado}" method="POST">
			<b>ID: </b> <input type="text" name="id"/>
			<br><br>
			<input type="submit"/>
		</form>
	</body>
</html>