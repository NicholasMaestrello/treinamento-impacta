package br.com.seniorsolution.facade;

public class Pedido {
	private String produto;
	private String cliente;
	private String endereco;
	
	public Pedido(String produto, String cliente, String endereco) {
		this.setProduto(produto);
		this.setCliente(cliente);
		this.setEndereco(endereco);
	}
	
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
}
