package br.com.seniorsolution.singleton;

import java.util.ArrayList;
import java.util.List;

public abstract class GenericDao {

	//singleton: mantem apenas uma instancia de uma classe, desde que essa instancia se fa�a necessaria
	public void incluir() {
		
	}
	public List<String> listar(){
		return new ArrayList<>();
	}
}
