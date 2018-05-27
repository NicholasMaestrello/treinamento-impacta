package br.com.seniorsolution.pog;

public class AppArtigo {

	public static void main(String[] args) {
		Professor p = new Professor();
		p.setNome("Gerson");
		p.setDisciplina("BD");
		
		Artigo a1 = new Artigo();
		a1.setTitulo("JAva 9");
		a1.setConteudo("Estuda que é bom");
		a1.setPaginas(1);
		a1.setAutor(p);
		
		Aluno a = new Aluno();
		a.setNome("Alfredo");
		a.setCurso("TI");
		
		ArtigoAluno a2 = new ArtigoAluno();
		a2.setTitulo("JAVA8");
		a2.setConteudo("Estuda ai");
		a2.setPaginas(1);
		a2.setAutor(a);
	}
}
