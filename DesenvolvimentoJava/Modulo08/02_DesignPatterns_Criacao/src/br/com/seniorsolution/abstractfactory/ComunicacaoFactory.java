package br.com.seniorsolution.abstractfactory;

public interface ComunicacaoFactory {

	Emissor createEmissor();
	Receptor createReceptor();
}
