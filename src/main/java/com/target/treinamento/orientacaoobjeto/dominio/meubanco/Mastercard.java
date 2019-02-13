package com.target.treinamento.orientacaoobjeto.dominio.meubanco;

public class Mastercard implements Cartao{

	public void debito(Double valor) {
		System.out.println("Débito Maestro R$"  + valor);
		
	}

	public void credito(Double valor) {
		System.out.println("Crédito Mastercard R$"  + valor);
		
	}

}
