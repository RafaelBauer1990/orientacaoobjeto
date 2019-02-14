package com.target.treinamento.orientacaoobjeto.dominio.produto;

public class Codigo<T> {
	
	private T id;

	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Codigo [id=" + id + "]";
	}

	public Codigo(T id) {
		this.id = id;
	}
	
	public Codigo() {
		
	}
	
	

}
