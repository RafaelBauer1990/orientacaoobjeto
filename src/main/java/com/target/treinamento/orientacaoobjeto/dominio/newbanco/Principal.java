package com.target.treinamento.orientacaoobjeto.dominio.newbanco;

import java.io.IOException;

public class Principal {

	public static void main(String[] args) {
		Pagamento pagamento = new Pagamento();
		
		try {
			pagamento.inicializa();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
