package com.target.treinamento.orientacaoobjeto.dominio.classeabstrata;

public abstract class Funcionario {
	
	private Double bonificacao = 1.2;


	// obriga a implementação nas classes que extends funcionarios
	public abstract Double getSalario();

	// Permite a sobrescrita do metodo por outra classe senão assume o valor default
	public Double getBonificacao() {
		return bonificacao;
	}
	
	public Double getValorTotalFuncionarioComBonificacao() {
		return getBonificacao() * getSalario();
	}
	
}
