package com.target.treinamento.orientacaoobjeto.dominio.classeabstrata.extrato;

public abstract class Extrato {

	public void cabecalho() {
		System.out.println("cabeçalho");
	}

	public abstract void meio();

	public void rodape() {
		System.out.println("rodapé");
	}
	
	public void imprime() {
		
		cabecalho();
		meio();
		rodape();
		
	}

}
