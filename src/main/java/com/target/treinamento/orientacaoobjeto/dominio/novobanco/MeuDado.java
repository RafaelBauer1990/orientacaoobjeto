package com.target.treinamento.orientacaoobjeto.dominio.novobanco;

public class MeuDado<T> {
	
	// op tipo T fornece a possibilidade de utilizar esse atributo com tipos de dados diferentes conforme necessidade 
	private T minhaClasse;
	private String nomeDaClasse;
	
	
	
	public T getMinhaClasse() {
		return minhaClasse;
	}
	public void setMinhaClasse(T minhaClasse) {
		this.minhaClasse = minhaClasse;
	}
	public String getNomeDaClasse() {
		return nomeDaClasse;
	}
	public void setNomeDaClasse(String nomeDaClasse) {
		this.nomeDaClasse = nomeDaClasse;
	}
	
		
	

}
