package br.com.seniorsolution.formaok;

public class Artigo {

	private String titulo;
	private String conteudo;
	private int paginas;
	private Pessoa autor;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	public Pessoa getAutor() {
		return autor;
	}
	public void setAutor(Pessoa autor) {
		this.autor = autor;
	}
	
	public String getInfo() {
		return "Dados do artigo: " 
				+ "\n\tAutor: " + this.getAutor().getNome() 
				+ "\n\tTitulo: " + this.getTitulo()
				+ "\n\tConteudo: " + this.getConteudo()
				+"\n\tOcupa��o do autor: " + this.getAutor().getClass().getSimpleName();
	}
}
