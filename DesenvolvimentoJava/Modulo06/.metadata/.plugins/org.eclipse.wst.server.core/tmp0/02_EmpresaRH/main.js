$(document).ready(function(){
	
	let assuntos = [
		{codigo: 0, descricao: 'Reclamações'},
		{codigo: 1, descricao: 'Informações'},
		{codigo: 3, descricao: 'Pedido'}
	]
	
	assuntos.forEach(function(element, index, array){
		$("#assunto").append($("<option>", {
			value: element.codigo,
			text: element.descricao
		}))
	})
	
	
	
	$("#enviar").click(function(){
		let nome = $("#nome").val()
		let email = $("#email").val()
		let assunto = assuntos.filter(val => val.codigo == $("#assunto").val())[0]
		let comentario = $("#comentario").val()
		let chat = {nome, email, assunto, comentario}
		console.log(chat)
	})
})