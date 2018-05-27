<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de cursos</title>
</head>
<body>
	<h1>Lista de cursos</h1>

	<table>
		<tr>
			<th>ID</th>
			<th>DESCRICAO</th>
			<th>Opções</th>
		</tr>

		<c:forEach var="curso" items="${listaCursos}">
			<tr>
				<td>${curso.id}</td>
				<td>${curso.descricao}</td>
				<td>
					<a href=<c:url value="/curso/disciplinas?id=${curso.id}"/>>Listar disciplinas</a> |
					<a href=<c:url value="/curso/remover?id=${curso.id}"/>>Remover curso</a> 
				</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>