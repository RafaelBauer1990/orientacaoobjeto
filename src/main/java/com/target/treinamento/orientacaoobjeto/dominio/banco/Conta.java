package com.target.treinamento.orientacaoobjeto.dominio.banco;

public class Conta {
	
	private Integer numConta;
	private Float saldo;
	private Pessoa pessoa;
	
	
	public Conta(Integer numConta, Float saldo, Pessoa pessoa) {
		this.numConta = numConta;
		this.saldo = saldo;
		this.pessoa = pessoa;
			
	}
	
	public Integer getNumConta() {
		return numConta;
	}
	public void setNumConta(Integer numConta) {
		this.numConta = numConta;
	}

	public Float getSaldo() {
		return saldo;
	}
	public void setSaldo(Float saldo) {
		this.saldo = saldo;
	}
	

}
