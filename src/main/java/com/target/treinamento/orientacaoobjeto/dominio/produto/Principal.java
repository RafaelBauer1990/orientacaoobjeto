package com.target.treinamento.orientacaoobjeto.dominio.produto;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	static List<Produto> produtos = new LinkedList<Produto>();
	
	public static void main(String[] args) {
		inicializa();

	}

	private static void inicializa() {
		
		

		carregaProdutos();
		
		
	}
	

	private static void carregaProdutos() {

		

		Produto prod1 = new Produto("Açucar", "Alimento", 5.50, "IMP34");
		Produto prod2 = new Produto("Liquidificador", "Eletrodomestico", 170.50, "SEC1413");
		Produto prod3 = new Produto("Netflix", "Entretenimento", 17.50, "NE001");

		produtos.add(prod1);
		produtos.add(prod2);
		produtos.add(prod3);
		
	}

}
