package br.com.seniorsolution.factory;

public class EmissorMaquininha implements Emissor {

	@Override
	public void enviar(String mensagem) {
		System.out.println("Enviando por meio impresso");
		System.out.println(mensagem);
	}

	
}
