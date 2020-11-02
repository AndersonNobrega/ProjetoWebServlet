<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/" var="servletHome"/>
<c:url value="/instituicao/atualizar" var="servletAtualizarInstituicao"/>

<!DOCTYPE html>
<html>
	
	<head>
		<meta charset="ISO-8859-1">
		<title>SNES</title>
	</head>
	
	<body>
		<a href="${servletHome}">Home</a>
	
		<h2>Atualizar Instituição:</h2>
		<form action="${servletAtualizarInstituicao}" method="POST">
			<b>ID: </b><input type="text" name="id"/>
			<br><br>
			<b>Nome: </b><input type="text" name="nome"/>
			<br><br>
			<b>Reitor: </b><input type="text" name="reitor"/>
			<br><br>
			<b>CNPJ: </b><input type="text" name="cnpj"/>
			<br><br>
		<input type="submit"/>
		</form>
	</body>
	
</html>