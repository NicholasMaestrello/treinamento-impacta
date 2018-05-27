package br.com.seniorsolution.flyweight;

public class TesteTemas {

	public static void main(String[] args) {
		/*
		 * Pattern flyweight: utilizado em situações onde
		 * existe uma grande quantidade de objetos a serem reutilizados.
		 * Estes objetos são criados ou reaproveitados, caso existam.
		 * */
		
		ConjuntoDocumentos documentos =  new ConjuntoDocumentos();
		documentos.adicionarDocumento(
				new Documento(
						TemaFlyWeightFactory.getTema(
								TemaFlyWeightFactory.ASTERISCO),
						"Titulo com ***",
						"Exemplo de tema com ****")
				);
		
		documentos.adicionarDocumento(
				new Documento(
						TemaFlyWeightFactory.getTema(
								TemaFlyWeightFactory.HIFEN),
						"Titulo com --------",
						"Exemplo de tema com --------")
				);
		documentos.adicionarDocumento(
				new Documento(
						TemaFlyWeightFactory.getTema(
								TemaFlyWeightFactory.SENIOR),
						"Titulo com >>>>>",
						"Exemplo de tema com >>>>>>>")
				);
		
		documentos.imprimir();
	}
}
