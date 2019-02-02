package com.target.treinamento.orientacaoobjeto.dominio.banco;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		Pagamento pgto = new Pagamento();

		try {
			pgto.incializa();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	

}
