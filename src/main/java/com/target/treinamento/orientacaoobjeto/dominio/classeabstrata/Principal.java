package com.target.treinamento.orientacaoobjeto.dominio.classeabstrata;

public class Principal {
	
	public static void main(String[] args) {
		
		Principal principal = new Principal();
		principal.inicializa();
		
	}

	private void inicializa() {
		
		ControleBonificacao controleBonificacao = new ControleBonificacao();
		controleBonificacao.registra(new Gerente());
		
		
		controleBonificacao.registra(new Programador());
		
		
		controleBonificacao.registra(new Diretor());

		
		System.out.println("O total de bonificação do gerente é de: R$" + controleBonificacao.getTotalBonificacoes());
		System.out.println("O salario + bonificação do gerente é de: R$" + controleBonificacaoGerente.);
		
	}

}
