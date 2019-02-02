package com.target.treinamento.orientacaoobjeto.dominio.banco;

public class Mastercard implements Cartao{


	public void debito(String valor) {
		System.out.println("Maestro");
		//	System.out.println("Selecionado Maestro");
		//	System.out.println("Pagamento Débito " + valor);
		System.out.println("Maestro Débito " + valor);

	}

	public void credito(String valor) {
		System.out.println("Mastercard");
		//System.out.println("Selecionado Mastercard");
		//System.out.println("Pagamento Crédito " + valor);
		System.out.println("Mastercard Crédito " + valor);

	}

}
