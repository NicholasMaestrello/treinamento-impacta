<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<h1>${mensagem}</h1>
	<a href=<c:url value="/"/>>Voltar para pagina principal</a>
</body>
</html>