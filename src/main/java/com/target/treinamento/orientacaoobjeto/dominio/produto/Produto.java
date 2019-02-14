package com.target.treinamento.orientacaoobjeto.dominio.produto;

public class Produto {
	
	private String nome;
	private String tipo;
	private Codigo codigo;


	public Produto(String nome, String tipo, Codigo codigo) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.codigo = codigo;
	}


	public Codigo<?> getCodigo() {
		return codigo;
	}


	public void setCodigo(Codigo<?> codigo) {
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


	// sempre que solicitar o objeto ele será retornado como string
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", tipo=" + tipo + ", codigo=" + codigo + "]";
	}
	
	

}
