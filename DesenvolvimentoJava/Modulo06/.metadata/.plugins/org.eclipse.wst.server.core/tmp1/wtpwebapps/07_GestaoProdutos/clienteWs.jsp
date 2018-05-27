<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Cliente WS</title>
</head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Lista de produtos - webService (REST)</h1>
	<form action="">
		<input type="button" value="acessar web service" id="btnAcesso">
		<ul id="lista">

		</ul>
	</form>

	<script type="text/javascript"
		src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
	<script type="text/javascript">
		function getXmlHttpRequest() {
			if (window.XMLHttpRequest)
				return new XMLHttpRequest;
			else
				return new ActiveXObject("Microsoft.XMLHTTP");
		}
		$(document)
				.ready(
						function() {
							$("#btnAcesso")
									.click(
											function() {
												let xmlhttp = getXmlHttpRequest();
												xmlhttp.open('GET','http://localhost:8080/07_GestaoProdutos/wsjson', true);

												xmlhttp.onreadystatechange = function() {
													if (xmlhttp.readyState == 4) {
														if (xmlhttp.status == 200) {
															let resposta = JSON.parse(xmlhttp.responseText);
															console.log(resposta);
															let lista = document.getElementById("lista");
															console.log("entrou aqui")
															for (let i = 0; i < resposta.length; i++) {
																let item = document.createElement('li')
																item.textContent = resposta[i].codigo + ":" + resposta[i].descricao;
																lista.appendChild(item);
															}
														}else {
															alert("Erro !")
														}
													} 
												};
												xmlhttp.send();
											})
						})
	</script>
</body>
</html>