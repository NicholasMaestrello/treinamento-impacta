<!DOCTYPE >
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
	<h1>Cadastro de novos cursos</h1>
	<form action=<c:url value="/cadcurso"/> method="POST">
		<label>Descrição do curso :</label><br/>
		<input type="text" name="descricao" />
		<form:errors path="curso.descricao" />
		<br/>
		<label>Selecione a escola :</label><br/>
		<select name="idescola">
			<c:forEach var="escola" items="${escolas}">
				<option value="${escola.id}">${escola.descricao}</option>
			</c:forEach>
		</select><br/>
		<input type="submit" value="Incluir curso" />
	</form>
</body>
</html>