package br.com.seniorsolution.formaok;

import javax.swing.JOptionPane;

public class AppArtigo {

	public static void main(String[] args) {
		Artigo artigo = new Artigo();
		artigo.setTitulo("Design Patterns");
		artigo.setConteudo("Existem diversos design patterns disponiveis");
		artigo.setPaginas(2);
		
		Pessoa pessoa = new Aluno();
		pessoa.setNome("Nicholas");

		artigo.setAutor(pessoa);
		
		JOptionPane.showMessageDialog(null, artigo.getInfo());
	}
}
