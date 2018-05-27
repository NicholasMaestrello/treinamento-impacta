package br.com.seniorsolution.facade;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Estoque {

	public void enviarProduto(String produto, String endereco) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, 2);
		
		String data = new SimpleDateFormat("dd/MM/yyy").format(calendar.getTime());
		
		System.out.println("Produto " + produto + " a ser entregue "
				+ "em " + endereco + " até dia " + data);
	}
}
