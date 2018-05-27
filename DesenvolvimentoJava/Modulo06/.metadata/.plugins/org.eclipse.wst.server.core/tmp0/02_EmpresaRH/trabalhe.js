$(document).ready(function(){
	let request, db;
	
	// abrindo ou cirando o banco de dados
	
	request = window.indexedDB.open("DBCandidatos");
	
	// eventos usados ao abrir o banco de dadeos
	
	request.onerror = function(event) {
		//$("#mensagemdb").html("Erro ao abrir o banco de dados");
		console.log("Erro ao abrir o banco de dados")
	}
	
	request.onsuccess = function(event) {
		//$("#mensagemdb").html("Banco de dados aberto com sucesso");
		console.log("Banco de dados aberto com sucesso")
		db = event.target.result;
		listar();
	}
	
	request.onupgradeneeded = function(event){
		//$("#mensagemdb").html("Banco de dados preparado");
		console.log("Banco de dadeos preparado")
		db = event.target.result;
		let objectStore = db.createObjectStore("candidatos", {keyPath: "cpf"})
	}
	
	
	$("#enviar").click(function(){
		let cpf = $("#cpf").val();
		let nome = $("#nome").val();
		let telefone = $("#telefone").val();
		let email = $("#email").val();
		
		let transaction = db.transaction(["candidatos"], "readwrite");
		transaction.oncomplete = function(event){
			$("#mensagemdb").html("registro incluido");
		}
		transaction.onerror = function(event){
			$("#mensagemdb").html("ocorreu um erro");
		}
		let objectStore = transaction.objectStore("candidatos");
		objectStore.add({cpf, nome, telefone, email});
		listar()
	})
	
	function listar() {
		while($("#listaCadastrados").firstChild) $("#listaCadastrados").html("<li></li>")
		//let lista = $("#listaCadastrados");
		//while(lista.firstChild) lista.removeChild(lista.firstChild)
		console.log("entrou no listar");
		let transaction = db.transaction(["candidatos"], "readonly");
		let objectStore = transaction.objectStore("candidatos");
		objectStore.openCursor().onsuccess = function(event){
			let cursor = event.target.result;
			if(cursor){
				$("#listaCadastrados").append(`<li> ${cursor.value.nome}</li>`);
				cursor.continue();
			}
		}
	}
	
})