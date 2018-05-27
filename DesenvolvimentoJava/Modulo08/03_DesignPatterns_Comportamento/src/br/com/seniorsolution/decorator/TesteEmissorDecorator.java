package br.com.seniorsolution.decorator;

public class TesteEmissorDecorator {

	public static void main(String[] args) {
		
		/*
		 * 	Pattern decorator: permite agregar / comibnar
		 * funcionalidades a um objeto, por meio de passagem de outros
		 * objetos do mesmo tipo como parametro
		 * */
		
		String mensagem = "#####";
		
		Emissor basico = new EmissorBasico();
		basico.enviar(mensagem);
		System.out.println();
		
		Emissor cripto = new EmissorDecoratorCripto(new EmissorBasico());
		cripto.enviar(mensagem);
		System.out.println();
		
		Emissor completo = new EmissorDecoratorCompress(
				new EmissorDecoratorCripto(
						new EmissorBasico()));
		completo.enviar(mensagem);
		System.out.println();
	}
}
