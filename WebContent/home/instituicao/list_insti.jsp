<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value="/" var="servletHome"/>
<c:url value="/instituicao" var="servletInstituicao"/>
<c:url value="/instituicao/criar" var="servletCriarInstituicao"/>
<c:url value="/instituicao/remover" var="servletRemoverInstituicao"/>
<c:url value="/instituicao/atualizar" var="servletAtualizarInstituicao"/>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>SNES</title>
	</head>
	
	<body>
		<a href="${servletHome}">Home</a>
	
		<h2>Instituições:</h2>
		<ul>
			<c:forEach items="${instituicoes}" var="instituicao">
				<li>ID: ${instituicao.id} - Nome: ${instituicao.nome} - Reitor: ${instituicao.reitor} - CNPJ: ${instituicao.cnpj}</li>		
				<br>
			</c:forEach>
		</ul>
		
		<a href="${servletCriarInstituicao}">Cadastrar</a> | <a href="${servletAtualizarInstituicao}">Atualizar</a> | <a href="${servletRemoverInstituicao}">Remover</a>
	</body>
</html>