package com.target.treinamento.orientacaoobjeto.dominio;

import java.util.Calendar;

public class Disciplina {
	private String nome;
	private Calendar dt_inicial;
	private Calendar dt_final;
	private String carga_horaria;
	private String conteudo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Calendar getDt_inicial() {
		return dt_inicial;
	}
	public void setDt_inicial(Calendar dt_inicial) {
		this.dt_inicial = dt_inicial;
	}
	public Calendar getDt_final() {
		return dt_final;
	}
	public void setDt_final(Calendar dt_final) {
		this.dt_final = dt_final;
	}
	public String getCarga_horaria() {
		return carga_horaria;
	}
	public void setCarga_horaria(String carga_horaria) {
		this.carga_horaria = carga_horaria;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	
}
