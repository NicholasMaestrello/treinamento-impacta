package br.com.seniorsolution.abstractfactory;

public class VisaComunicacaoFactory implements ComunicacaoFactory {

	private EmissorCreator  emissorCreator = new EmissorCreator();
	private ReceptorCreator receptorCreator = new ReceptorCreator();
	
	public Emissor createEmissor() {
		return emissorCreator.create(TipoEmissor.VISA);
	}
	
	public Receptor createReceptor() {
		return receptorCreator.create(TipoEmissor.VISA);
	}
}
