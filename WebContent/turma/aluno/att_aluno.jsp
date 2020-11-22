<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<c:url value="/aluno/atualizar" var="servletAtualizarAluno"/>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="ISO-8859-1">
		<title>SNES</title>
	</head>
	
	<body>
		<h2>Atualizar Aluno:</h2>
		<form action="${servletAtualizarAluno}" method="POST">
			<b>ID do Aluno: </b><input type="text" name="ID"/>
			<br><br>
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