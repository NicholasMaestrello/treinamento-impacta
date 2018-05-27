package br.com.seniorsolution.abstractfactory;

public class ReceptorMaster implements Receptor {

	@Override
	public String receber() {
		System.out.println("Recebendo a mensagem de VISA");
		String mensagem = "valor apgo para MASTER";
		return mensagem;
	}

}
