package com.target.treinamento.orientacaoobjeto.dominio.banco;

import java.util.Scanner;

public class Transacao {
	
	Integer pan;
	Integer opcao;
	Float valor;
	
	Visa visa = new Visa();
	
	public Integer lerPan() {
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
		
	}
	
	public Integer lerOpcao() {
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
		
	}
	
	public Float lerValor() {
		Scanner scan = new Scanner(System.in);
		return scan.nextFloat();
		
	}
	
	public void selecionaCartao() {
		if (opcao.equals(1)) {
			visa.debito();
		} else if (opcao.equals(2)) {
			visa.credito();
		} 
		
		}
		
	}

}
