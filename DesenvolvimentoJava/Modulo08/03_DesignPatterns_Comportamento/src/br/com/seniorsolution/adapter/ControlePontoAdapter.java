package br.com.seniorsolution.adapter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ControlePontoAdapter extends ControlePonto {

	private ControlePontoNovo novo;
	
	public ControlePontoAdapter() {
		this.novo = new ControlePontoNovo();
	}
	
	@Override
	public void registrarEntrada(Funcionario f) {
		this.novo.registrar(f, true);
	}
	@Override
	public void registrarSaida(Funcionario f) {
		this.novo.registrar(f, false);
	}
}
