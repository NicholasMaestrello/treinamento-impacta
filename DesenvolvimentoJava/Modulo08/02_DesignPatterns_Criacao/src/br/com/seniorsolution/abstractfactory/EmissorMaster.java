package br.com.seniorsolution.abstractfactory;

public class EmissorMaster implements Emissor{
	
	@Override
	public void enviar(String mensagem) {
		System.out.println("Enviando a mensagem para VISA:");
		System.out.println(mensagem);
		
	}
}