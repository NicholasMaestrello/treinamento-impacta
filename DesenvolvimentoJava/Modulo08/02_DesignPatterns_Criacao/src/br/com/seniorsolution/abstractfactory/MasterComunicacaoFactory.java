package br.com.seniorsolution.abstractfactory;

public class MasterComunicacaoFactory implements ComunicacaoFactory {
	
	private EmissorCreator  emissorCreator = new EmissorCreator();
	private ReceptorCreator receptorCreator = new ReceptorCreator();
	
	public Emissor createEmissor() {
		return emissorCreator.create(TipoEmissor.MASTER);
	}
	
	public Receptor createReceptor() {
		return receptorCreator.create(TipoEmissor.MASTER);
	}
}
