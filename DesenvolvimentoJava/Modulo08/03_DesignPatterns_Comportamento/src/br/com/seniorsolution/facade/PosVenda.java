package br.com.seniorsolution.facade;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class PosVenda {

	public void agendarContato(String cliente, String produto) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, 30);
		String data = new SimpleDateFormat("dd/MM/yyy").format(calendar.getTime());
		System.out.println("Entrar em contato com " + cliente + 
				" sobre o produto " + produto +
				" em " + data);
	}
}
