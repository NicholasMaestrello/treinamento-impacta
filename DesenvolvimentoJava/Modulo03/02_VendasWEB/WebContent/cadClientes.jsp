
<!DOCTYPE html>
<html>
<head>
<meta charset="UTf-8">
<title>Cadastro de clientes</title>
</head>
<body>
	<h1>Cadastro de clientes</h1>
	<form action="clientes" method="post">
		<label for="codigo">C�digo :</label><br/>
		<input type="text" name="codigo" id="codigo" size="5"/><br/>
		<label for="empresa">Empresa :</label><br/>
		<input type="text" name="empresa" id="empresa" size="20"/><br/>
		<input type="submit" value="Enviar"/>
	</form>
	${mensagem}
</body>
</html>