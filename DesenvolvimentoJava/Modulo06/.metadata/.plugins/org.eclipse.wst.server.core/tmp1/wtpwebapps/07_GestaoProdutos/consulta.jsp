<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Gest�o de produtos</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link href="css/main.css" rel="stylesheet">
</head>
<body>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<jsp:useBean id="beanProduto" class="br.com.seniorsolution.beans.ProdutoBean"></jsp:useBean>
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
	<section class="corpo">
		<div class="content">
			<h3 style="text-align: center;">Produtos ja cadastrados</h3>
			<br />
			<div>
				<table class="table table-condensed ">
					<thead>
						<tr>
							<th>Codigo</th>
							<th>Descri��o</th>
							<th>Pre�o</th>
							<th>Fabricante</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="produto" items="${beanProduto.listaProduto}">
							<tr>
								<td>${produto.codigo}</td>
								<td>${produto.descricao}</td>
								<td>R$ ${produto.preco}</td>
								<td>${produto.fabricante}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</section>
	<footer>
		<p>
			Avenida paulista, 1009 - Bela Vista <br /> S�o paulo, SP cep
			03303-000
		</p>
		<p>&copy; Copyright 2017 - Todos os direitos n�o reservados</p>
	</footer>
	<script type="text/javascript"
		src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>