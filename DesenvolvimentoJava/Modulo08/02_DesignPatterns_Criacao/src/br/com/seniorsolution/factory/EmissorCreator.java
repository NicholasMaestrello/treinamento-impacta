package br.com.seniorsolution.factory;

public class EmissorCreator {

	public Emissor create(TipoEmissor tipo) {
		switch (tipo) {
		case SMS: return new EmissorSMS();
		case EMAIL: return new EmissorEmail();
		case MAQUINA: return new EmissorMaquininha();
		default: throw new RuntimeException("Op�o invalida");
		}
	}
}
