package br.com.seniorsolution.entity;

import java.util.Set;

public class Faculdade {

	private String nome;
	private Set<Curso> cursos;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Set<Curso> getCursos() {
		return cursos;
	}
	public void setCursos(Set<Curso> cursos) {
		this.cursos = cursos;
	}
	
	
}
