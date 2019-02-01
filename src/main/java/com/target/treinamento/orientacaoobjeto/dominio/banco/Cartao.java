package com.target.treinamento.orientacaoobjeto.dominio.banco;

public interface Cartao {
	
	void debito(String valorPgto);
	void credito(String valor);

}
