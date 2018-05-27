<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Consultas</title>
</head>
<body>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
	<jsp:useBean id="consultaBean" class="br.com.seniorsolution.beans.BeanVendas"></jsp:useBean>
	<h1>Consultas a pedidos e Itens</h1>
	<fieldset>
		<legend>Tipoas de Consulta</legend>
		<form action="consultas" method="post">
			<input type="radio" name="opcao" value ="pedidos" checked="checked"/>
			Pedidos por cliente<br/>
			<input type="radio" name="opcao" value ="itens"/>
			Itens por pedido<br/>
		
		<label>Cliente: </label><br/>
		<select name="cliente">
			<c:forEach var="item" items="${consultaBean.listaClientes}">
				<option value="${item.id}">${item.empresa}</option>
			</c:forEach>
		</select><br/> 
		
		<label for="pedido">Pedido:</label><br/>
		<select name="pedido">
			<c:forEach var="item" items="${consultaBean.listaPedidos}">
				<option value="${item.pedidoPK}">${item.pedidoPK}</option>
			</c:forEach>
		</select><br/>
		<input type="submit" value="fazer consulta" />
		</form>
		${resultado}
	</fieldset>
</body>
</html>