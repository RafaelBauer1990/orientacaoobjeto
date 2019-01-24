package com.target.treinamento.orientacaoobjeto.dominio;

public class Professor {
	
	private String cpf;
	private String rg;
	private String nome;
	private Integer capacidade;

	public String getCpf() {
		return this.cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getRg() {
		return this.rg;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Integer getCapacidade() {
		return this.capacidade;
	}
	
	public void setCapacidade(Integer capacidade) {
		this.capacidade = capacidade;
	}

}
