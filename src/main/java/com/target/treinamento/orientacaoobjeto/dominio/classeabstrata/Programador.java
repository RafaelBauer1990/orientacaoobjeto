package com.target.treinamento.orientacaoobjeto.dominio.classeabstrata;

public class Programador extends Funcionario{

	@Override
	public Double getSalario() {
		return 5000.0;
	}
	
	@Override
	public Double getBonificacao() {
		return 5.0;
	}


}
