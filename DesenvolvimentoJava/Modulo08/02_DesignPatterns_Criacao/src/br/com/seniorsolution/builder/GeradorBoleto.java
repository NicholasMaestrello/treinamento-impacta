package br.com.seniorsolution.builder;

import java.util.Calendar;

public class GeradorBoleto {

	private BoletoBuilder boletoBuilder;
	
	public GeradorBoleto(BoletoBuilder boletoBuilder) {
		this.boletoBuilder = boletoBuilder;
	}
	
	public Boleto gerarBoleto() {
		this.boletoBuilder.buildSacado("Seu Nome");
		this.boletoBuilder.buildCedente("Seu Cedente");
		this.boletoBuilder.buildValor(150.0);
		
		Calendar vencimento = Calendar.getInstance();
		vencimento.add(Calendar.DATE, 30);
		this.boletoBuilder.buildVencimento(vencimento);
		this.boletoBuilder.buildNossoNumero(12345);
		
		return boletoBuilder.getBoleto();
	}
}
