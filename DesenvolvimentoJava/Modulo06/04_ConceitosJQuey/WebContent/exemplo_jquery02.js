$(document).ready(function(){
	let lista = [
		"Administração",
		"JAVA",
		"PHP",
		"NODE"
	]
	//for (let i = 0; i < lista.length; i++) {
		//$("#lista").append(`<option value=${i}>${lista[i]}</option>`)
	//}
	lista.forEach(function(element, index, array){
		$("#lista").append($("<option>", {
			value: index,
			text: element
		}))
	})
	
	
	$("#btn_enviar").click(function(){
		
		let nome = $('#nome').val()
		let idade = $('#idade').val()
		let curso = $('#lista').val()
		let resultado
		console.log(idade)
		if($('#resposta').hasClass('erro')) $('#resposta').removeClass('erro')
		if($('#resposta').hasClass('ok')) $('#resposta').removeClass('ok')
		
		if(idade == "") {
			resultado = "Idade Invalida"
			$('#resposta').addClass('erro')
		}
		else{
			resultado = (idade < 18) ? "Menor de Idade": "Maior de idade"
			$("#resposta").addClass('ok')
		}
		
		$("#resposta").hide()
		$("#resposta").html(resultado)
		$("#resposta").fadeIn(3000)
		$("#resposta").fadeOut(3000)
		
	})
})