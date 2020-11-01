<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/instituicao/atualizar" var="servletAtualizarInstituicao"/>

<!DOCTYPE html>
<html>
	
	<head>
		<meta charset="ISO-8859-1">
		<title>Atualizar Instituiçaõ</title>
	</head>
	
	<body>
	
		<h2>Atualizar Instituição:</h2>
		<form action="servletAtualizarInstituicao" method="POST">
		<b>CNPJ: </b><input type="text" name="nome"/>
		<br>
		<input type="submit"/>
		</form>
	</body>
	
</html>