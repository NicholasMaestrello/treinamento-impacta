<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Gestão de produtos</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link href="css/main.css" rel="stylesheet">
<link href="css/index.css" rel="stylesheet">
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
	<section class="intro"></section>
	<div id="slides" class="carousel slide" data-ride="carousel">
		<ol class="carousel-indicators">
			<li data-target="#slides" data-slide-to="0" class="active"></li>
			<li data-target="#slides" data-slide-to="1"></li>
			<li data-target="#slides" data-slide-to="2"></li>
		</ol>

		<!-- conteudo dos slides -->
		<div class="carousel-inner" role="listbox">
			<div class="item active">
				<img src="imagens/carousel01.jpg" />
			</div>
			<div class="item">
				<img src="imagens/carousel02.jpg" />
			</div>
			<div class="item">
				<img src="imagens/carousel03.jpg" />
			</div>
		</div>

		<a class="left carousel-control" href="#slides" role="button" data-slide="prev">
			<span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span> 
			<span class="sr-only">Anterior</span> 
		</a> 
		<a
			class="right carousel-control" href="#slides" role="button"
			data-slide="next"><span class="glyphicon glyphicon-chevron-right"
			aria-hidden="true"></span> <span class="sr-only">Próxima</span> </a>
	</div>
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