let estados = [
	{id: 1, estado: 'SS'},
	{id: 2, estado: 'RJ'},
	{id: 3, estado: 'MG'},
	{id: 4, estado: 'BA'}
]

let cidades = [
	{id: 1, idestado: 1, cidade: 'São Paulo'},
	{id: 2, idestado: 1, cidade: 'Sorocaba'},
	{id: 1, idestado: 2, cidade: 'Niteroi'},
	{id: 1, idestado: 2, cidade: 'Angra dos Reis'},
	{id: 1, idestado: 3, cidade: 'Ouro Preto'},
	{id: 1, idestado: 3, cidade: 'Belo horizonte'},
	{id: 1, idestado: 3, cidade: 'Extrema'},
	{id: 1, idestado: 4, cidade: 'Porto Seguro'},
	{id: 1, idestado: 4, cidade: 'Salvador'}
]

$(document).ready(function(){
	estados.forEach(function(element, index, array){
		$('#estado').append($('<option>', {
			value: element.id,
			text: element.estado
		}))
	})
	
	$('#estado').change(function(){
		let idestado = $(this).val()
		
		let cidFiltradas = cidades.filter(function(value){
			return value.idestado == idestado
		})
		
		console.log(cidFiltradas)
		cidFiltradas.forEach(function(el, i, a){
			$('#cidade').append($("<option>", {
					value: el.id,
					text: el.cidade
					}))
		})
		/*cidades.forEach(function(el, i, a){
			if(el.idestado == idestado){
				$('#cidade').append($('<option>', {
					value: el.id,
					text: el.cidade
				}))
			}
		})*/
	})
})