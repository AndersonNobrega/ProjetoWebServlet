<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value="/" var="servletHome"/>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Institui��es</title>
	</head>
	
	<body>
		<a href="${servletHome}">Home</a>
	
		<h2>Institui��es:</h2>
		<ul>
			<c:forEach items="${instituicoes}" var="instituicao">
				<li>Nome: ${instituicao.nome} - Reitor: ${instituicao.reitor} - CNPJ: ${instituicao.cnpj}</li>		
				<br>
			</c:forEach>
			
		</ul>
	</body>
</html>