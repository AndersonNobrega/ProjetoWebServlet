<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, org.ifpb.model.Aluno"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	
	<body>
		<h1>Lista de Alunos</h1>
		<ul>
			<c:forEach items="${lista}" var="aluno">
				<li>Nome: ${aluno.nome} - RG: ${aluno.rg} - CPF${aluno.cpf}</li>
				<br>
			</c:forEach>
		</ul>
	</body>
	
</html>