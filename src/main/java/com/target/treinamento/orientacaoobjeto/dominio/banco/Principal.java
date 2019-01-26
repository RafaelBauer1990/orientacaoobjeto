package com.target.treinamento.orientacaoobjeto.dominio.banco;

public class Principal {

	public static void main(String[] args) {

		Principal principal = new Principal();

		principal.inicializa();


	}

	public void inicializa() {
		Pessoa p1 = new Pessoa("Joao", "123.456.789-56");
		Conta c1 = new Conta (1, 1000f, p1);

		Pessoa p2 = new Pessoa("Alfredo", "987.654.321.52");
		Conta c2 = new Conta (2, 0f, p2);
		
		Transferencia t1 = new Transferencia(c1, c2, 100f);
		t1.transfere();
		
		

	
		System.out.println(p1.getNome()+" - "+ c1.getSaldo());
		System.out.println(p2.getNome()+" - "+ c2.getSaldo());
		//System.out.println(t1.getContaOrigem() +" - "+ t1.getContaDestino());

	}

}
