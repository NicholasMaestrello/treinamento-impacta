package br.com.seniorsolution.entity;

public class Disciplina {

	private String nome;
	private double valorMensalidade;
	
	public Disciplina(String nome,double valorMensalidade ) {
		this.setNome(nome);
		this.setValorMensalidade(valorMensalidade);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValorMensalidade() {
		return valorMensalidade;
	}

	public void setValorMensalidade(double valorMensalidade) {
		this.valorMensalidade = valorMensalidade;
	}
	
	
	
	
}
