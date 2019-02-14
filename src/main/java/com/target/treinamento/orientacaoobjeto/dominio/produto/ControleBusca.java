package com.target.treinamento.orientacaoobjeto.dominio.produto;

import java.util.ArrayList;
import java.util.List;

public class ControleBusca implements Busca{

	List<Produto> produtos = new ArrayList<Produto>();

	// achar como chamar o retorno do metodo lerCodigo() da classe principal e passar como parametro no lugar do T id
	public <T> Produto BuscaPorCodigo(T id) {
		Principal principal = new Principal();

		
		for (Produto produto : produtos) {
			//compara os objetos do código do produto com o objeto Codigo do produtoLido
			if (produto.getCodigo().getId().equals(id)) {
				return produto;
			}	
		}
			return null;
		}
	
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	}




