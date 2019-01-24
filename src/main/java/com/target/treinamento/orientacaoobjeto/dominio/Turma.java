package com.target.treinamento.orientacaoobjeto.dominio;

//objeto
public class Turma {

	//atributos da classe
	private String nome;
	private Aluno aluno;
	private Professor professor;
	private Sala sala;
	private Disciplina  disciplina;
	private Integer capacidade;

	public String getNome() {
		return this.nome;
	}
	
	public void setCpf(String nome) {
		this.nome = nome;
	}
	
	public Aluno getAluno() {
		return this.aluno;
	}
	
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	public Professor getProfessor() {
		return this.professor;
	}
	
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public Sala getSala() {
		return this.sala;
	}
	
	public void setSala(Sala sala) {
		this.sala= sala;
	}
	
	public Disciplina  getDisciplina() {
		return this.disciplina;
	}
	
	public void setSala(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
	public Integer getCapacidade() {
		return this.capacidade;
	}
	
	public void setCapacidade(Integer capacidade) {
		this.capacidade = capacidade;
	}
	
}
