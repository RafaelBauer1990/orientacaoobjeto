package com.target.treinamento.orientacaoobjeto.dominio.classeabstrata;

public class Diretor extends Funcionario{

	@Override
	public Double getSalario() {
		return 1500.0;
	}
	
	@Override
	public Double getBonificacao() {
		return 0.01;
	}


}
