// definindo variaveis

//function exibir(){
//	let nome = document.getElementById("nome");
//	let idade = document.getElementById("idade"); 
//
//	let mensagem = `nome : ${nome.value}, idade : ${idade.value}`;
//	alert(mensagem)
//}

let nome = document.getElementById("nome");
let idade = document.getElementById("idade"); 

let button = document.getElementById("button");

button.addEventListener("click", exibir);

function exibir(){
	let mensagem = `Nome : ${nome.value} \n idade : ${idade.value}`;
	//alert(mensagem);
	document.getElementById("mensagem").innerHTML = mensagem;
}




