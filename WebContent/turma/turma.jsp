<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	
	<head>
		<meta charset="ISO-8859-1">
		<title>Turma</title>
	</head>
	
	<body>
		<h1>Turma Id: ${id} </h1>

		<a href="http://localhost:8080/home/turma/aluno/cad_aluno.jsp">Cadastrar Aluno</a>
		<br>
		<a href="http://localhost:8080/home/turma/aluno/rm_aluno.jsp">Remover Aluno</a>
		<br>
		<a href="http://localhost:8080/home/turma/aluno/att_aluno.jsp">Atualizar Aluno</a>
		<br>
	</body>
	
</html>