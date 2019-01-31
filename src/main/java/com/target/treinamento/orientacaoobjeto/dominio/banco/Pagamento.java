package com.target.treinamento.orientacaoobjeto.dominio.banco;

import java.util.Scanner;

public class Pagamento {

	private Integer bandeira;
	private Integer operacao;
	private Double valorPgto;

	Cartao visa = new Visa();
	Cartao mastercard = new Mastercard();


	void incializa() {

		System.out.println("Informe a bandeira");
		System.out.println("[1] - Visa");
		System.out.println("[2] - Mastercard");
		lerBandeira();
		System.out.println("Informe a operação");
		System.out.println("[1] - Débito");
		System.out.println("[2] - Crédito");
		lerOperacao();
		System.out.println("Informe o valor");
		lerValor();
		
		
		
		if (bandeira.equals(1) && operacao.equals(1)) {
			visa.debito(valorPgto);
		} else if(bandeira.equals(1) && operacao.equals(2)) {
			visa.credito(valorPgto);
		} else if  (bandeira.equals(2) && operacao.equals(1)) {
			mastercard.debito(valorPgto);
		}else if  (bandeira.equals(2) && operacao.equals(2)) {
			mastercard.credito(valorPgto);
		} 
	
		

	}

	private Double lerValor() {
		Scanner scan = new Scanner(System.in);
		return valorPgto = scan.nextDouble();
		
	}

	private Integer lerOperacao() {
		Scanner scan = new Scanner(System.in);
		return operacao = scan.nextInt();

	}

	private Integer lerBandeira() {
		Scanner scan = new Scanner(System.in);
		return bandeira = scan.nextInt();

	}

}
