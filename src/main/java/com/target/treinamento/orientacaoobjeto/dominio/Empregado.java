package com.target.treinamento.orientacaoobjeto.dominio;

import java.util.Scanner;

public class Empregado {

	private String nome;
	private String cargo;
	private Double salario;


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public Double getSalario() {
		return salario;
	}


	public void setSalario(Double salario) {

		if ("Gerente".equals(cargo)) {
			Double salarioGerente = salario * 0.1;
			this.salario = salarioGerente + salario;
		} else {
			this.salario = salario;
		}
	}

}
