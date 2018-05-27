package br.com.seniorsolution.proxy;

public class TesteProxy {

	public static void main(String[] args) {
		Conta conta = new ContaPadrao();
		
		Conta proxy = new ContaProx(conta);
		proxy.depositar(10000);
		proxy.sacar(5000);
		System.out.println(proxy.getSaldo());
	}
}
