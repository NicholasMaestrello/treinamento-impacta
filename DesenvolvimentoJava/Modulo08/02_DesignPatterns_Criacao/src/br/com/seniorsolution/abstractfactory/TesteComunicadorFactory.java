package br.com.seniorsolution.abstractfactory;

public class TesteComunicadorFactory {

	public static void main(String[] args) {
		/*
		 * AbstractFactory: Permite encapsular a escola das classes
		 * concretas a serem utlilizadas nma cria~~ao dos objetos
		 * de diversasa familias(no caso, VISA ou MASTER
		 */
		
//		Fabrica VISA
		ComunicacaoFactory factory1 = new VisaComunicacaoFactory();
		String transacao1 = "Valor : 450,00 - Data: 06/11";
		Emissor emissor1 = factory1.createEmissor();
		emissor1.enviar(transacao1);
		
		Receptor receptor1 = factory1.createReceptor();
		String mensagem1 = receptor1.receber();
		System.out.println(mensagem1);
		
//		Fabrica MASTER
		ComunicacaoFactory factory2 = new MasterComunicacaoFactory();
		String transacao2 = "Valor : 450,00 - Data: 06/11";
		Emissor emissor2 = factory2.createEmissor();
		emissor2.enviar(transacao1);
		
		Receptor receptor2 = factory2.createReceptor();
		String mensagem2 = receptor2.receber();
		System.out.println(mensagem2);
	}
}
