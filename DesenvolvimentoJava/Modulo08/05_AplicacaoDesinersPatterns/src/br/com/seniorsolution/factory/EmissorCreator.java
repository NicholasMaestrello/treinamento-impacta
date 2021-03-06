package br.com.seniorsolution.factory;

import br.com.seniorsolution.enums.NomeBandeira;
import br.com.seniorsolution.enums.TipoPagemento;

public class EmissorCreator {
	
	public Emissor create(TipoPagemento tipo) {
		switch (tipo) {
		case Cheque: return new EmissorCheque();
		case Boleto: return new EmissorBoleto();
		default: throw new RuntimeException("Op�o invalida");
		}
	}
	
	public Emissor create(TipoPagemento tipo, NomeBandeira bandeira) {
		switch (tipo) {
		case Debito: return new EmissorDebito(bandeira);
		case Credito: return new EmissorCredito(bandeira);
		default: throw new RuntimeException("Op�o invalida");
		}
	}
}
