<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body >
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<h1>Login</h1>
	<form action=<c:url value="/loginusuario"/> method="POST">
		<label>Nome</label><br/>
		<input type="text" name="nome"><br/>
		<label>Senha</label><br/>
		<input type="password" name="senha"><br/>
		<input type="submit" value="Logar"><br/>
	</form>
	${mensagem}<br/>
	<a href=<c:url value="/login/cadastro"/> >N�o � cadastrado ? clique aqui para fazer cadastro</a>
</body>
</html>