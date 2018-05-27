package br.com.seniorsolution.abstractfactory;

public class ReceptorVisa implements Receptor {

	@Override
	public String receber() {
		System.out.println("Recebendo a mensagem de VISA");
		String mensagem = "valor apgo para VISA";
		return mensagem;
	}

	
}
