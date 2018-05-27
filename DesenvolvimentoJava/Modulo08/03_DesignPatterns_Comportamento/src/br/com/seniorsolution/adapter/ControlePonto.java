package br.com.seniorsolution.adapter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ControlePonto {

	public void registrarEntrada(Funcionario f) {
		Calendar calendar = Calendar.getInstance();
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String entrada = df.format(calendar.getTime());
		System.out.println("Entrada : " + f.getNome() + " �s " + entrada);
	}
	
	public void registrarSaida(Funcionario f) {
		Calendar calendar = Calendar.getInstance();
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String saida = df.format(calendar.getTime());
		System.out.println("Saida : " + f.getNome() + " �s " + saida);
	}
}