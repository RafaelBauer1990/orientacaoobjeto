package com.target.treinamento.orientacaoobjeto.dominio.banco;

public class Pessoa {

	private String nome;
	private String cpf;

	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;

	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Pessoa) {
			return this.nome.equals(getNome());
		}

		return super.equals(obj);
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return new Pessoa(this.nome, this.cpf);

	}
}
