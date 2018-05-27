package br.com.seniorsolution.abstractfactory;

public class ReceptorCreator {

	public Receptor create(TipoEmissor tipo) {
		switch(tipo) {
		case VISA: return new ReceptorVisa();
		case MASTER: return new ReceptorMaster();
		default: throw new IllegalArgumentException("Tipo invalido");
		}
	}
}
