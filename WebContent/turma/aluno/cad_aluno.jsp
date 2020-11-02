<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/CriaAluno" var="servletNovoAluno"/>

<!DOCTYPE html>
<html>

	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	
	<body>
		<form action="${servletNovoAluno}" method="post">
				<b>Nome: </b><input type="text" name="nome"/>
				<br>
				<b>rg: </b><input type="text" name="rg"/>
				<br>
				<b>cpf: </b><input type="text" name="cpf"/>
				<br>
				<input type="submit"/>
			</form>
	</body>
	
</html>