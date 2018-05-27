<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de usuarios</title>
</head>
<body>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
	<h1>Login</h1>
	<form action=<c:url value="/cadusuario"/> method="POST">
		<label>Nome</label><br/>
		<input type="text" name="nome">
		<form:errors path="usuario.nome" />
		<br/>
		<label>Senha</label><br/>
		<input type="text" name="senha">
		<form:errors path="usuario.senha" />
		<br/>
		<label>Nivel</label><br/>
		<select name="nivel">
		<c:forEach var="nivel" items="${niveis}">
			<option value="${nivel}">${nivel} </option>
			</c:forEach>
		</select>
		<form:errors path="usuario.nivel" />
		<input type="submit" value="cadastrar"><br/>
	</form>
	${mensagem}<br/>
	<a href=<c:url value="/"/> >Voltar para login</a>
</body>
</html>