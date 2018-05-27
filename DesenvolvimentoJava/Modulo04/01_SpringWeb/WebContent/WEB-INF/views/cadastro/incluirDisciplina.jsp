<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
	<h1>Incluir disciplina</h1>
	<form action=<c:url value="/caddisciplina"/> method="POST">
		<label>Descri��o da disciplina :</label><br /> 
		<input type="text" name="descricao" />
		<form:errors path="disciplina.descricao" />
		<br />
		<label>Carga horaria (em horas)</label><br/>
		<input type="text" name="cargaHoraria" />
		<br/>
		<label>Selecione o curso :</label><br />
		<select name="idcursos">
			<c:forEach var="curso" items="${cursos}">
				<option value="${curso.id}">${curso.descricao}</option>
			</c:forEach>
		</select><br /> <input type="submit" value="Incluir curso" />
	</form>
</body>
</html>