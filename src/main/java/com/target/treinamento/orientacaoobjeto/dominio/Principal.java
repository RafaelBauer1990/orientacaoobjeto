package com.target.treinamento.orientacaoobjeto.dominio;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Principal e1 = new Principal();

		e1.setEmpregado();
								

	}
	
	private void setEmpregado() {
		
		Empregado e1 = new Empregado("João", "Gerente", 15000.00);
		Empregado e2 = new Empregado("João", "Gerente", 15000.00);
		Empregado e3 = new Empregado("João", "Gerente", 15000.00);

		System.out.println(e1.getNome() +" "+ e1.getCargo() +" "+ e1.getSalario());
		System.out.println(e2.getNome() +" "+ e2.getCargo() +" "+ e2.getSalario());
		System.out.println(e3.getNome() +" "+ e3.getCargo() +" "+ e3.getSalario());
		
		
	}
	

}



