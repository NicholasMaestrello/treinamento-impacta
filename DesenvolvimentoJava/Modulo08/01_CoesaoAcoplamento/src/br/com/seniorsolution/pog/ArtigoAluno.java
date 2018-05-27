package br.com.seniorsolution.pog;

public class ArtigoAluno {

	private String titulo;
	private int paginas;
	private String conteudo;
	private Aluno autor;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	public Aluno getAutor() {
		return autor;
	}
	public void setAutor(Aluno autor) {
		this.autor = autor;
	}
	
	
}
