package br.com.seniorsolution.flyweight;

import java.util.ArrayList;
import java.util.List;

public class ConjuntoDocumentos {

	private List<Documento> documentos = new ArrayList<>();
	public void adicionarDocumento(Documento documento) {
		documentos.add(documento);
	}
	public void imprimir() {
		for(Documento documento: documentos) {
			documento.imprimir();
			System.out.println();
		}
	}
}
