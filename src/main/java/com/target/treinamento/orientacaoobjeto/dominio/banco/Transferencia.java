package com.target.treinamento.orientacaoobjeto.dominio.banco;

public class Transferencia {
	
	private Conta contaOrigem;
	private Conta contaDestino;
	private Float valor;
	private Float saldoOrigemFinal;
	private Float saldoDestinoFinal;
	
	public Transferencia(Conta contaOrigem, Conta contaDestino, Float valor, Float saldoOrigemFinal, Float saldoDestinoFinal) {
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
		
		Float saldoOrigem = this.contaOrigem.getSaldo();
		Float saldoDestino = this.contaDestino.getSaldo();
		Float saldoOrigemFinal = saldoOrigem - this.valor;
		Float saldoDestinoFinal = saldoDestino + this.valor;

	}
}
