package com.target.treinamento.orientacaoobjeto.dominio.banco;

public class Visa implements CartaoDeCredito{

	public void debito() {
		System.out.println("Transação com cartão Visa Electron");
		
	}

	public void credito() {
		System.out.println("Transação com cartão Visa");
		
	}
	

}
