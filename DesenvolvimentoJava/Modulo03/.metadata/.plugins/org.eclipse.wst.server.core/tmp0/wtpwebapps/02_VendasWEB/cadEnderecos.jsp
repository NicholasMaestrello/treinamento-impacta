
<!DOCTYPE html>
<%@page import="java.util.List"%>
<%@page import="br.com.seniorsolution.entidades.Cliente"%>
<%@page import="br.com.seniorsolution.dao.GenericDao"%>
<html>
<head>
<meta charset="UTF-8">
<title>cadastro de endere�os</title>
</head>
<body>
	<h1>Cadastro de endere�os para clientes</h1>

	<form action="endereco" method="post">
		<label>Cliente</label><br />
		<% 
		GenericDao<Cliente> dao = new GenericDao<>(Cliente.class);
		List<Cliente> clientes = dao.listar();
		%>
		<select name="cliente">
			<% for(Cliente item: clientes){%>
			<option value="<%= item.getId() %>"><%= item.getEmpresa()%></option>
			<%} %>
		</select><br /> <label for="rua">Rua</label><br />
		 <input name="rua" id="rua" /><br />
		<label for="cidade">Cidade</label><br/>
		 <input name="cidade" id="cidade" /><br />
		<label for="cep">Cep</label><br />
		 <input name="cep" id="cep" /><br />
		 <input type="submit" value="enviar" />
	</form>
	${mensagem}
</body>
</html>