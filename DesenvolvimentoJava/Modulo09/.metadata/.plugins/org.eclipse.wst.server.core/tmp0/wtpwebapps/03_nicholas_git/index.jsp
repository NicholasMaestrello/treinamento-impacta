<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pagina JSP</title>
</head>
<body>
	<h1>Mensagem de boas vindas !</h1>
	<h3>ass; nicholas maestrello</h3>


	<form action="FormServlet" method="post">
		<label>Nome:</label><br/>
		<input type="text" name="nome"><br/>
		
		<label>Idade:</label><br/>
		<input type="number" name="idade" maxlength="3" size="3"><br/>
		
		<label>Curso</label><br/>
		<input type="text" name="curso"><br/>
		
		<label>Semestre</label><br/>
		<input type="number" name="semestre" maxlength="1" size="1"><br/>
		
		<input type="submit" value="Enviar">
		<br/>
	</form>
	
	<hr>
	
	<h1>Resultado</h1>
	
	<h2>${mensagem}</h2>
</body>
</html>