package br.com.seniorsolution.builder;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class BancoItauBoleto implements Boleto {

	private String sacado, cedente;
	private double valor;
	private Calendar vencimento;
	private int nossoNumero;
	
	public BancoItauBoleto(
			String sacado,
			String cedente,
			double valor,
			Calendar vencimento,
			int nossoNumero) {
		// TODO Auto-generated constructor stub
		this.sacado = sacado;
		this.cedente = cedente;
		this.valor  = valor;
		this.vencimento = vencimento;
		this.nossoNumero = nossoNumero;
	}
	
	@Override
	public String getSacado() {
		// TODO Auto-generated method stub
		return this.sacado;
	}

	@Override
	public String getCedente() {
		// TODO Auto-generated method stub
		return this.cedente;
	}

	@Override
	public double getValor() {
		// TODO Auto-generated method stub
		return this.valor;
	}

	@Override
	public Calendar getVencimento() {
		// TODO Auto-generated method stub
		return this.vencimento;
	}

	@Override
	public int getNossoNumero() {
		// TODO Auto-generated method stub
		return this.nossoNumero;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Boleto Itau \n");
		sb.append("\nSacado: ");
		sb.append(this.sacado);
		sb.append("\nCedente: ");
		sb.append(this.cedente);
		sb.append("\nValor: ");
		sb.append(this.valor);
		sb.append("\nVencimento: ");
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		String data = df.format(this.vencimento.getTime());
		sb.append(data);
		sb.append("\nNosso Numero: ");
		sb.append(this.nossoNumero);
		return sb.toString();
	}
	
}
