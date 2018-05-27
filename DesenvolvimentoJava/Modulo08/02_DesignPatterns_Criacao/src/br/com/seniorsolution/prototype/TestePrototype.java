package br.com.seniorsolution.prototype;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class TestePrototype {

	public static void main(String[] args) {
		String nome = "Poucas estrelas disponiveis";
		Calendar data = Calendar.getInstance();
		Set<String> palavras = new HashSet<>();
		palavras.add("estrela");
		palavras.add("cara bom");
		palavras.add("brilho");
		
		Anuncio anuncio = new Anuncio(nome, data, palavras);
		System.out.println(anuncio);
		
		Anuncio copia = anuncio.clone();
		System.out.println(copia);
	}
}
