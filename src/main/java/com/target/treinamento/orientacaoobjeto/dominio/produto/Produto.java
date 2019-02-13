package com.target.treinamento.orientacaoobjeto.dominio.produto;

public class Produto extends Codigo{
	
	private String nome;
	private String tipo;
	private Double preco;
	private String codigo;
	




	public Produto(String nome, String tipo, Double preco,String codigo) {
		this.nome = nome;
		this.tipo = tipo;
		this.preco = preco;
		this.codigo = codigo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public Double getPreco() {
		return preco;
	}


	public void setPreco(Double preco) {
		this.preco = preco;
	}

}
