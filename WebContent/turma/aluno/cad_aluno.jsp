<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/aluno/criar" var="servletNovoAluno"/>

<!DOCTYPE html>
<html>

	<head>
		<meta charset="ISO-8859-1">
		<title>SNES</title>
	</head>
	
	<body>
		<h2>Cadastrar Aluno:</h2>
		<form action="${servletNovoAluno}" method="POST">
				<b>Nome: </b><input type="text" name="nome"/>
				<br><br>
				<b>RG: </b><input type="text" name="rg"/>
				<br><br>
				<b>CPF: </b><input type="text" name="cpf"/>
				<br><br>
				<b>ID da Turma: </b><input type="text" name="turmaId"/>
				<br><br>
				<input type="submit"/>
			</form>
	</body>
	
</html>