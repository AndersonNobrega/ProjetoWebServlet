<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, org.ifpb.model.Aluno"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value="/aluno/criar" var="servletCriarAluno"/>
<c:url value="/aluno/remover" var="servletRemoverAluno"/>
<c:url value="/aluno/atualizar" var="servletAtualizarAluno"/>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="ISO-8859-1">
		<title>SNES</title>
	</head>
	
	<body>
		<h2>Lista de Alunos: </h2>
		<ul>
			<c:forEach items="${alunos}" var="aluno">
				<li>ID: ${aluno.id} - Nome: ${aluno.nome} - RG: ${aluno.rg} - CPF: ${aluno.cpf}</li>
				<br><br>
			</c:forEach>
		</ul>
		
		<a href="${servletCriarAluno}">Cadastrar</a> | <a href="${servletAtualizarAluno}">Atualizar</a> | <a href="${servletRemoverAluno}">Remover</a>
	</body>
	
</html>