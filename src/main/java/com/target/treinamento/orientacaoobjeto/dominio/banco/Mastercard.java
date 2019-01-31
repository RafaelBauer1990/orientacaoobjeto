package com.target.treinamento.orientacaoobjeto.dominio.banco;

public class Mastercard implements Cartao{


	public void debito(Double valor) {
		System.out.println("Maestro");
		System.out.println("Selecionado Maestro");
		System.out.println("Pagamento Débito " + valor);

	}

	public void credito(Double valor) {
		System.out.println("Mastercard");
		System.out.println("Selecionado Mastercard");
		System.out.println("Pagamento Crédito " + valor);

	}

}
