package br.com.seniorsolution.multiton;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class Tema {

	private String nome;
	private Color corFundo;
	private Color corFonte;
	
	public static final String TemaClaro = "Claro";
	public static final String TemaEscuro = "Escuro";
	
	private static Map<String, Tema> temas = new HashMap<>();
	
//	bloco de inicialização estatica: exectudao antes do construtor,
//	e sua ordem na classe é importante.
	static {
		Tema tema1 = new Tema();
		tema1.setNome(TemaClaro);
		tema1.setCorFundo(Color.CYAN);
		tema1.setCorFonte(Color.BLUE);
		
		Tema tema2 = new Tema();
		tema2.setNome(TemaEscuro);
		tema2.setCorFundo(Color.DARK_GRAY);
		tema2.setCorFonte(Color.WHITE);
		
		temas.put(tema1.getNome(), tema1);
		temas.put(tema2.getNome(), tema2);
	}
	
	private Tema() {}
	
	public static Tema getInstance(String nomeTema) {
		return temas.get(nomeTema);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Color getCorFundo() {
		return corFundo;
	}

	public void setCorFundo(Color corFundo) {
		this.corFundo = corFundo;
	}

	public Color getCorFonte() {
		return corFonte;
	}

	public void setCorFonte(Color corFonte) {
		this.corFonte = corFonte;
	}

	public static Map<String, Tema> getTemas() {
		return temas;
	}

	public static void setTemas(Map<String, Tema> temas) {
		Tema.temas = temas;
	}
	
	
}
