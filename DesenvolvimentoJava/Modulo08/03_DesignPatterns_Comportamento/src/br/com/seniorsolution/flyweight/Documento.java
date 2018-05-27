package br.com.seniorsolution.flyweight;

public class Documento {

	private TemaFlyWeight tema;
	private String titulo;
	private String texto;
	
	public Documento(TemaFlyWeight tema,String titulo, String texto) {
		this.tema = tema;
		this.titulo = titulo;
		this.texto = texto;
	}
	
	public void imprimir() {
		this.tema.imprimir(titulo, texto);
	}
}