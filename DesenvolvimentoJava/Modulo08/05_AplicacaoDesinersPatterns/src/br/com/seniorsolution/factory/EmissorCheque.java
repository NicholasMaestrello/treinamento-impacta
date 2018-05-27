package br.com.seniorsolution.factory;

public class EmissorCheque implements Emissor {

	@Override
	public void emitir(String mensagem) {
		// TODO Auto-generated method stub
		System.out.println("Pagamento sendo realizado com Cheque");
		System.out.println(mensagem);
	}

}
