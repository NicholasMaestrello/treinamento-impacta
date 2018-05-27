package br.com.seniorsolution.bridge;

public class TesteRecibo {

	public static void main(String[] args) {
		/*
		 * Este objeto é a ponte(bridge) entre as informações do recibo
		 * e o formato a ser gerado como arquivo
		 * */
		GeradorArquivos geradorArquivos = new GeradorArquivosTxt();
		Recibo recibo = new Recibo("Impacta", "Senior", 100, geradorArquivos);
//		Recibo recibo = new Recibo("Impacta", "Senior", 100);
		recibo.gerarArquivo();
		System.out.println("OK");
	}
}
