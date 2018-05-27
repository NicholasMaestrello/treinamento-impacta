package br.com.seniorsolution.decorator;

public class EmissorDecoratorCripto extends EmissorDecorator {

	public EmissorDecoratorCripto(Emissor emissor) {
		super(emissor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void enviar(String mensagem) {
		// TODO Auto-generated method stub
		System.out.println("Enviando mensagem criptografada :");
		this.getEmissor().enviar(criptografar(mensagem));
	}
	
	private String criptografar(String mensagem) {
		return new StringBuilder(mensagem).reverse().toString();
	}
}
