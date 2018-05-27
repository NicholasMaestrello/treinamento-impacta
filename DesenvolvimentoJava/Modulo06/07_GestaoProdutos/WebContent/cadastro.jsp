<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Gestão de produtos</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link href="css/main.css" rel="stylesheet">
</head>
<body>
	<nav class="navbar navbar-default navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="index.jsp">Logo</a>
			</div>

			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li><a href="ProdutosServlet">Cad produtos</a></li>
					<li><a href="consulta.jsp">Buscar</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<section class="row corpo">
		<div class="col-sm-2"></div>

		<form action="ProdutosServlet" method="POST" class="col-sm-8 formluario" >
			<h3>Cadastro de produtos</h3>
			<div class="form-group row">
				<label for="codigo" class="col-sm-2 col-form-label">Codigo</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="codigo" name="codigo" />
				</div>
			</div>
			<div class="form-group row">
				<label for="descricao" class="col-sm-2 col-form-label">Descricao</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="descricao"
						name="descricao" />
				</div>
			</div>
			<div class="form-group row">
				<label for="preco" class="col-sm-2 col-form-label">Preço</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="preco" name="preco" />
				</div>
			</div>
			<div class="form-group row">
				<label for="fabricante" class="col-sm-2 col-form-label">Fabricante</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="fabricante"
						name="fabricante" />
				</div>
			</div>
			<div class="form-group row">
				<div class="col-sm-2"></div>
				<input type="submit" class="btn btn-primary col-sm-10" value="Enviar" />
			</div>
			${mensagem}
		</form>
		<div class="col-sm-2"></div>
	</section>
	<footer>
		<p>Avenida paulista, 1009 - Bela Vista <br /> São paulo, SP cep
			03303-000
		</p>
		<p>&copy; Copyright 2017 - Todos os direitos não reservados</p>
	</footer>
	<script type="text/javascript"
		src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>