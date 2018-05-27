package br.com.seniorsolution.factory;

import br.com.seniorsolution.enums.NomeBandeira;

public class EmissorDebito implements Emissor {

	private NomeBandeira bandeira;
	
	public EmissorDebito(NomeBandeira bandeira) {
		this.bandeira = bandeira;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void emitir(String mensagem) {
		// TODO Auto-generated method stub
		System.out.println("pagamento sendo enviado com " + this.bandeira.name());
		System.out.println(mensagem);
	}

}
