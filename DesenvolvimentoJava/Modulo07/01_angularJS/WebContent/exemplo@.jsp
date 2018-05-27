<!DOCTYPE html>
<html ng-app="primeiro">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body ng-controller="principal as prim">
	Visualizar mensagem : {{prim.mensagem}}
	<br/>
	<button type="button" ng-click="prim.alterarMensagem()">Alterar Mensagem</button>
	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.6/angular.min.js"></script>
	<script>
		let app = angular.module('primeiro',[])
		app.controller('principal',[function(){
			let vm = this;
			this.mensagem = ''
			this.alterarMensagem = alterarMensagem;
			
			function alterarMensagem(){
				vm.mensagem = 'Alterou a mensagem'
			}
		}])
	</script>
</body>
</html>