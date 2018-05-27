package br.com.seniorsolution.objectpool;

public class TesteFuncionarioPool {

	public static void main(String[] args) {
		Pool<Funcionario> pool = new FuncionarioPool();
		Funcionario funcionario = pool.ocupar();
		
		System.out.println("Lista de funcionario ocupados");
		while(funcionario != null) {
			System.out.println(funcionario.getNome());
			System.out.println(funcionario.getCargo());
			System.out.println("----------");
			funcionario = pool.ocupar();
		}
	}
}
