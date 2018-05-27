package br.com.seniorsolution.bridge;

import java.io.FileWriter;

public class Recibo implements Documento {

	private String emissor;
	private String favorecido;
	private double valor;
	private GeradorArquivos geradorArquivos;
	
	public Recibo(String emissor, String favorecido, double valor, GeradorArquivos geradorArquivos){
		this.emissor = emissor;
		this.favorecido = favorecido;
		this.valor = valor;
		this.geradorArquivos = geradorArquivos;
	}
	
	@Override
	public void gerarArquivo() {
		StringBuilder sb = new StringBuilder();
		sb.append("Recibo: \r\nEmissor :");
		sb.append(this.emissor);
		sb.append("\r\nCliente: ");
		sb.append(this.favorecido);
		sb.append("\r\nValor: ");
		sb.append(this.valor);
		this.geradorArquivos.gerar(sb.toString());
//		try {
//			FileWriter writer = new FileWriter("C:/Desenvolvimento_Java/Modulo08/recibo.txt");
//			writer.write("Recibo:");
//			writer.write("\r\nEmissor : " + this.emissor);
//			writer.write("\r\nCliente : " + this.favorecido);
//			writer.write("\r\nValor : " + this.valor);
//			writer.close();
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
	}
}
