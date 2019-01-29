package com.target.treinamento.orientacaoobjeto.dominio.banco;

public class Transferencia {
	
	private Conta contaOrigem;
	private Conta contaDestino;
	private Float valor;

	
	public Transferencia(Conta contaOrigem, Conta contaDestino, Float valor) {
		this.contaOrigem = contaOrigem;
		this.contaDestino = contaDestino;
		this.valor = valor;
		
		
		
	}
 	
	
	public Conta getContaOrigem() {
		return contaOrigem;
	}
	public void setContaOrigem(Conta contaOrigem) {
		this.contaOrigem = contaOrigem;
	}
	public Conta getContaDestino() {
		return contaDestino;
	}
	public void setContaDestino(Conta contaDestino) {
		this.contaDestino = contaDestino;
	}


	public Float getValor() {
		return valor;
	}
	
	public void setValor(Float valor) {
		this.valor = valor;
	}
	
	public void transfere() {
		
		contaOrigem.setSaldo(contaOrigem.getSaldo() - valor);
		contaDestino.setSaldo(contaDestino.getSaldo() + valor);
		
	}
}
