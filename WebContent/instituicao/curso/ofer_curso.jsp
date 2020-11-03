<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/curso/criar" var="servletCriarCurso"/>

<!DOCTYPE html>
<head>
		<meta charset="ISO-8859-1">
		<title>Ofertar Curso</title>
	</head>
	
	<body>
		<h2>Ofertar Curso:</h2>
		<form action="${servletCriarCurso}" method="POST">
			Nome:<input type="text" name="nome"/>
			<br>
			<input type="submit"/>
		</form>
	</body>