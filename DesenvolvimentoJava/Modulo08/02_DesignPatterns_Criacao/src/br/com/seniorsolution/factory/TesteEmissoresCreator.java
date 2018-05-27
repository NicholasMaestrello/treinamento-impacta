package br.com.seniorsolution.factory;

public class TesteEmissoresCreator {

	public static void main(String[] args) {
		
		EmissorCreator creator = new EmissorCreator();
		Emissor em1 = creator.create(TipoEmissor.SMS);
		Emissor em2 = creator.create(TipoEmissor.EMAIL);
		Emissor em3 = creator.create(TipoEmissor.MAQUINA);
		
		imprimir(em1, "Valor 1");
		imprimir(em2, "Valor 2");
		imprimir(em3, "Valor 3");
	}
	
	private static void imprimir(Emissor em, String mensagem) {
		em.enviar(mensagem);
	}
}
