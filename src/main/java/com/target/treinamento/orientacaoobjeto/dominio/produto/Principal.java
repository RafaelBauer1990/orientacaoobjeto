package com.target.treinamento.orientacaoobjeto.dominio.produto;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Principal {


	List<Produto> produtos = new LinkedList<Produto>();
	
	private Codigo produtoLido;
	
	public static void main(String[] args) {
		Principal principal = new Principal();
		principal.inicializa();
		
		
		
		

	}

	private void inicializa() {

		carregaProdutos();
		ControleBusca controleBusca = new ControleBusca();
		controleBusca.setProdutos(produtos);
		
		System.out.print("Informe o código do produto: ");
//		this.produtoLido = lerCodigo();
		lerCodigo();
		
		System.out.println(controleBusca.BuscaPorCodigo().getCodigo());
		

		
		
//		buscaProduto();
//				
//				
//		
//	}
//	
//
//	private void buscaProduto() {
//		for (Produto produto : produtos) {
//			//compara os objetos do código do produto com o objeto Codigo do produtoLido
//			if (produto.getCodigo().getId().equals(produtoLido.getId())) {
//				System.out.println(produto);
//			}	
//		}
		
					
	}

	public Codigo getProdutoLido() {
		return produtoLido;
	}

	public void setProdutoLido(Codigo produtoLido) {
		this.produtoLido = produtoLido;
	}

	private String lerCodigo() {
		Scanner scan = new Scanner(System.in);
		
		//cria um objeto da entrada no teclado
		//return new Codigo<String>(scan.nextLine());
		return scan.nextLine();
		
	}

	private Produto carregaProdutos() {
		
		
		Codigo<String> prod1 = new Codigo<String>("IMP34");
		Codigo<Double>  prod2 = new Codigo<Double>(123.32);
		Codigo<Integer> prod3 = new Codigo<Integer>(123);
		

//		prod1.setId("IMP34");
//		prod2.setId(123.32);
//		prod3.setId(123);
		
		produtos.add(new Produto("Arroz", "Alimento", prod1));
		produtos.add(new Produto("Liquidificador", "Eletrodoméstico", prod2));
		produtos.add(new Produto("Sabão", "Limpeza", prod3));
		
		
		//System.out.println(produtos.get(0));
		return null;
				
	}

}
