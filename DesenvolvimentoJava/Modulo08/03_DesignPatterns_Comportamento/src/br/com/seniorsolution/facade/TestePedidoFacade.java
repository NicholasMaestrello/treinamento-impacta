package br.com.seniorsolution.facade;

public class TestePedidoFacade {

	public static void main(String[] args) {
		
		/**
		 * Pattern facade: agrupa objetos a serem executados em sequencia.
		 * */
		
		Pedido pedido = new Pedido("Celular", "Josefa", "Av Paulista");
		
		Estoque estoque = new Estoque();
		Financeiro financeiro = new Financeiro();
		PosVenda posVenda =  new PosVenda();
		
		PedidoFacade facade = new PedidoFacade(estoque, financeiro, posVenda);
		facade.registrarPedido(pedido);
	}
}
