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
		
		produtos.add(new Produto("Netflix", "Entretenimento", 17.50, "NE001"));
		produtos.add(new Produto("Liquidificador", "Eletrodoméstico", 285.50, "LI055"));
		produtos.add(new Produto("Arroz", "Alimento", 285.50, "AR023"));
		
		
	}

}
