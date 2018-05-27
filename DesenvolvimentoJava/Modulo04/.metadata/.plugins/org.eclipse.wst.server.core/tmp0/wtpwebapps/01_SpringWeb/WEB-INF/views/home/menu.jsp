<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Aplciação rodando com spring</title>
</head>
<body>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<h1>${mensagem }</h1>
	<ul>
		<c:choose>
			<c:when test="${usuario.getNivel().ordinal() == 2}">
				<li><a href=<c:url value="/escola/cadastro"/>>Cadastro de escolas</a></li>
				<li><a href=<c:url value="/curso/cadastro"/>>Cadastro de cursos</a></li>
				<li><a href=<c:url value="/disciplina/cadastro"/>>Cadastro de Disciplinas</a></li>
				<li><a href=<c:url value="/escola/lista"/>>Consulta de Escolas</a></li>
			</c:when>
			<c:when test="${usuario.getNivel().ordinal() == 1}">
				<li><a href=<c:url value="/disciplina/cadastro"/>>Cadastro de Disciplinas</a></li>
				<li><a href=<c:url value="/escola/lista"/>>Consulta de Escola</a></li>
			</c:when>
			<c:when test="${usuario.getNivel().ordinal() == 0}">
				<li><a href=<c:url value="/escola/lista"/>>Consulta de Escola</a></li>
			</c:when>
		</c:choose>
	</ul>
</body>
</html>