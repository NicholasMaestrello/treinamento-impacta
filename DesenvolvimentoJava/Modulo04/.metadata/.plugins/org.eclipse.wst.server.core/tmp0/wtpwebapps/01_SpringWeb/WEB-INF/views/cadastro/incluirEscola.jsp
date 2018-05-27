<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Escola</title>
</head>
<body>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
	<h1>Inclus�o de uma nova escola</h1>
	<form action=<c:url value="/cadescola"/>  method="POST">
		<label for="">Nome da escola :</label><br/>
		<input type="text" name="descricao" size="30" />
		<form:errors path="escola.descricao" />
		<br />
		<label>Endere�o :</label><br/>
		<input type="text" name="endereco" size="30" />
		<form:errors path="escola.endereco" />
		<br/>
		<label>Data de funda��o (dd/MM/yyyy):</label><br/>
		<input type="text" name="dataFundacao" size="30" /><br/>
		<input type="submit" value="Incluir escola">
	</form>
	<strong>${mensagem}</strong>
</body>
</html>