package br.com.seniorsolution.singleton;

public class AppGenericDao {

	public static void main(String[] args) {
		
//		o metodo getInstance() retorna uma nova instancia,
//		se for executado pela primeira vez, ou uma instancia
//		existenten, se esta ja existir
		
		/*
		 * o pattern singleton permie a economia de instancias na memoria
		 * HEAP
		 * */
		GenericDao dao = RepositorioSingleton.getInstance();
	}
}
