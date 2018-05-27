package br.com.seniorsolution.factory;

public class EmissorSMS implements Emissor {

	@Override
	public void enviar(String mensagem) {
		System.out.println("Enviando por SMS");
		System.out.println(mensagem);
	}

}
