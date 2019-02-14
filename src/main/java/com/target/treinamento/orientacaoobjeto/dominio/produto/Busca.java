package com.target.treinamento.orientacaoobjeto.dominio.produto;

public interface Busca {
	
	<T> Produto BuscaPorCodigo(T id);

}
