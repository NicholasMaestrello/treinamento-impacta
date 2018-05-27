package br.com.seniorsolution.adapter;

public class TesteControlePonto {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Patter adapter: permite criar uma segunda classe
		 * contendo as mesmas operações de uma classse tomeada como
		 * base, mas utlinizadno elementos diferenetes(adaptaveis)
		 * */
		
		//usando a classe original
		System.out.println("Classe ControlePonto");
		ControlePonto cp = new ControlePonto();
		Funcionario f1 = new Funcionario("Matheus", "motoboy");
		cp.registrarEntrada(f1);
		
		Thread.sleep(5000);
		
		cp.registrarSaida(f1);
		
		//Usando o dater
		System.out.println("Classe ControlePontoAdapter");
		ControlePonto cpa = new ControlePonto();
		Funcionario fa = new Funcionario("Matheus", "motoboy");
		cpa.registrarEntrada(fa);
		
		Thread.sleep(5000);
		
		cpa.registrarSaida(fa);
	}
}
