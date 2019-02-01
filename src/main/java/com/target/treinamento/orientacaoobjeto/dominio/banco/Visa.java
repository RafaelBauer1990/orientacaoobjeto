package com.target.treinamento.orientacaoobjeto.dominio.banco;

public class Visa implements Cartao{

	
	public void debito(String valor) {
		System.out.println("Selecionado Visa Eletron");
		System.out.println("Pagamento Débito no valor de R$" + valor);
				
	}

	public void credito(String valor) {
		System.out.println("Selecionado Visa");
		System.out.println("Pagamento Crédito no valor de R$" + valor);
	}
}
