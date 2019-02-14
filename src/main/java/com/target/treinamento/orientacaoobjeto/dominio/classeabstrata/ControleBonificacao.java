package com.target.treinamento.orientacaoobjeto.dominio.classeabstrata;

public class ControleBonificacao {
	
	private Double totalEmBonificacoes = 0.0;

	public Double getTotalBonificacoes() {
		return totalEmBonificacoes;
		
	}
	public void registra(Funcionario funcionario) {
		this.totalEmBonificacoes += funcionario.getValorTotalFuncionarioComBonificacao();
		
	}
	
}
