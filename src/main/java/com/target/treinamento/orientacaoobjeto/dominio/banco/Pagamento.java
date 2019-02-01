package com.target.treinamento.orientacaoobjeto.dominio.banco;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Pagamento {

	private String bandeira;
	private String operacao;
	private String valorPgto;

	Cartao visa = new Visa();
	Cartao mastercard = new Mastercard();


	void incializa() {

		lerArquivo();

		/*
		System.out.println("Informe a bandeira");
		System.out.println("[1] - Visa");
		System.out.println("[2] - Mastercard");
		lerBandeira();
		System.out.println("Informe a operação");
		System.out.println("[1] - Débito");
		System.out.println("[2] - Crédito");
		lerOperacao();
		System.out.println("Informe o valor");
		lerValor();*/



}

	public void  lerArquivo() {
		BufferedReader buffer = null;

		try {
			buffer = new BufferedReader( new FileReader("C:\\Users\\RAFAEL BAUER\\Documents\\transacoes.txt"));
		} catch (FileNotFoundException e1) {

			e1.printStackTrace();
		}




		while (!buffer.equals(null)) {	
			String linha = null;

			try {
				linha = buffer.readLine();
			} catch (IOException e) {
				System.out.println("Acabou");
				e.printStackTrace();
			}
			String[] linhaManipulada = linha.split(";");
			this.bandeira = linhaManipulada[0];
			this.operacao = linhaManipulada[1]; 
			this.valorPgto = linhaManipulada[2]; 
			
			if (bandeira.equals("VISA") && operacao.equals("1")) {
				visa.debito(valorPgto);
			} else if(bandeira.equals("VISA") && operacao.equals("2")) {
				visa.credito(valorPgto);
			} else if  (bandeira.equals("MASTERCARD") && operacao.equals("1")) {
				mastercard.debito(valorPgto);
			}else if  (bandeira.equals("MASTERCARD") && operacao.equals("2")) {
				mastercard.credito(valorPgto);
			}
		}

	}





}
/*
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

	}*/


