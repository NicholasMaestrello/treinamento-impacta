package br.com.seniorsolution.facade;

public class PedidoFacade {

	private Estoque estoque;
	private Financeiro financeiro;
	private PosVenda posVenda;
	
	public PedidoFacade(
			Estoque estoque, 
			Financeiro financeiro,
			PosVenda posVenda) {
		this.estoque = estoque;
		this.financeiro = financeiro;
		this.posVenda = posVenda;
	}
	
	public void registrarPedido(Pedido p) {
		this.estoque.enviarProduto(p.getProduto(), p.getEndereco());
		this.financeiro.faturar(p.getCliente(), p.getProduto());
		this.posVenda.agendarContato(p.getCliente(), p.getProduto());
	}
}
