package com.target.treinamento.orientacaoobjeto.dominio.banco;

public class Visa implements Cartao{


	public void debito(Double valorPgto) {
		System.out.println("Visa Eletron");
		//System.out.println("Selecionado Visa Eletron");
		System.out.println("Pagamento Débito no valor de R$" + valorPgto);

	}

	public void credito(Double valorPgto) {
		//		System.out.println("Selecionado Visa");
		System.out.println("Visa");
		System.out.println("Pagamento Crédito no valor de R$" + valorPgto);
	}
}
