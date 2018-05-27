package br.com.seniorsolution.multiton;

public class TesteTemas {

	public static void main(String[] args) {
		Tema temaClaro = Tema.getInstance(Tema.TemaClaro);
		System.out.println("Informações - TEMA CLARO");
		System.out.println("Tema: "+ temaClaro.getNome());
		System.out.println("Cor da fonte: " + temaClaro.getCorFonte());
		System.out.println("Cor de fundo: " + temaClaro.getCorFundo());
		
		Tema temaEscuro = Tema.getInstance(Tema.TemaEscuro);
		System.out.println("Informações - TEMA ESCURO");
		System.out.println("Tema: "+ temaEscuro.getNome());
		System.out.println("Cor da fonte: " + temaEscuro.getCorFonte());
		System.out.println("Cor de fundo: " + temaEscuro.getCorFundo());
	}
}
