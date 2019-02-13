package com.target.treinamento.orientacaoobjeto.dominio.meubanco;

public class Visa implements Cartao{

	
	public void debito(Double valor) {
		System.out.println("Débito Visa Electron R$" + valor);

		
	}

	public void credito(Double valor) {
		System.out.println("Crédito Visa R$"  + valor);
		
	}

}
