package br.com.seniorsolution.adapter;

public class Funcionario {

	private String nome, cargo;

	public Funcionario(String nome, String cargo) {
		this.setNome(nome);
		this.setCargo(cargo);
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
}
