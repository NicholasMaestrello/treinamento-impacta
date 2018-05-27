package br.com.seniorsolution.proxy;

public class ContaPadrao implements Conta {

	private double saldo;
	
	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		this.saldo += valor;
	}

	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		this.saldo -= valor;
	}

	@Override
	public double getSaldo() {
		// TODO Auto-generated method stub
		return this.saldo;
	}

	
}
