<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Pedidos - JSTL</title>
</head>
<body>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
	<jsp:useBean id="clienteBean" class="br.com.seniorsolution.beans.BeanVendas"></jsp:useBean>

	<h1>Cadastro de Pedidos</h1>

	<form action="pedidos" method="post">
		<label for="cliente">Cliente: </label><br>

		<select name="cliente">
			<c:forEach var="item" items="${clienteBean.listaClientes}">
				<option value="${item.id }">${item.empresa }</option>
			</c:forEach>
		</select><br>
		
		<label for="numpedido">Numero do Pedido: </label><br>
		<input type="text" name="numpedido" id="numpedido" size="20"><br>
		
		<label for="categoria">Categoria: </label><br>
		<select name="categoria">
			<option value="pc">Computadores</option>
			<option value="placa">Placas de Video</option>
			<option value="moni">Monitor</option>
			<option value="out">Outros</option>
		</select><br> 
		
		<label for="data">Data do pedido: </label><br> 
		<input type="text" placeholder="dd/mm/aaaa" name="data" id="data" size="10"><br>
		
		<input type="submit" value="Enviar">
	</form>
	${mensagem}
</body>
</html>