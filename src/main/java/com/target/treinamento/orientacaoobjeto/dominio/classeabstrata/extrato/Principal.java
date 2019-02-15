package com.target.treinamento.orientacaoobjeto.dominio.classeabstrata.extrato;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Principal principal = new Principal();
		principal.inicializa();
	}

	private void inicializa() {

		Integer escolha;
		System.out.println("Escolha um extrato");
		System.out.println("[1] Extrato de conta corrente");
		System.out.println("[2] Extrato de dividendos");
		System.out.println("[3] Extrato de investimentos");
		escolha = escolherExtrato();
				
		ContaCorrente conta = new ContaCorrente();
		Dividendos dividendo = new Dividendos();
		Investimento investimento = new Investimento();

		if (escolha == 1) {
			conta.imprime();
		} else if (escolha == 2) {
			dividendo.imprime();
		} else if (escolha == 3) {
			investimento.imprime();
		}
	}

	private Integer escolherExtrato() {
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}
}
