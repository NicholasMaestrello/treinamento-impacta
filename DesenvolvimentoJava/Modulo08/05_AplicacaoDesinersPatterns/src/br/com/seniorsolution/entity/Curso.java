package br.com.seniorsolution.entity;

import java.util.List;

public class Curso {

	private String nome;
	private List<Disciplina> disciplinas;
	
	public Curso (String nome, List<Disciplina> disciplinas) {
		this.setNome(nome);
		this.setDisciplinas(disciplinas);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	
}
