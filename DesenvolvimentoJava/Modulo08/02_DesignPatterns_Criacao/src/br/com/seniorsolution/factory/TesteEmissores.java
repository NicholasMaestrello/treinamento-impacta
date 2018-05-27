package br.com.seniorsolution.factory;

public class TesteEmissores {
	public static void main(String[] args) {
		/*
		 * Padrão factory: permite encapsular uma classe concreta
		 * a ser utilizada na criação de objetos de um dterminado tipo
		 */
		
		Emissor em1 = new EmissorSMS();
		Emissor em2  = new EmissorEmail();
		Emissor em3 = new EmissorMaquininha();
		
		imprimir(em1, "OLA");
		imprimir(em2, "OLA");
		imprimir(em3, "OLA");
	}
	
	private static void imprimir(Emissor em, String mensagem) {
		em.enviar(mensagem);
	}
}
