package com.target.treinamento.orientacaoobjeto.dominio.classeabstrata;

public class Gerente extends Funcionario{

	@Override
	public Double getSalario() {
		return 2000.0;
	}
	
	@Override
	public Double getBonificacao() {
		return 2.2;
	}
}
