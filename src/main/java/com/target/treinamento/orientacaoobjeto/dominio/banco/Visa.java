package com.target.treinamento.orientacaoobjeto.dominio.banco;

public class Visa implements Cartao{

	
	public void debito(Double valor) {
		System.out.println("Selecionado Visa Eletron");
		System.out.println("Pagamento Débito " + valor);
				
	}

	public void credito(Double valor) {
		System.out.println("Selecionado Visa");
		System.out.println("Pagamento Crédito " + valor);
	}
}