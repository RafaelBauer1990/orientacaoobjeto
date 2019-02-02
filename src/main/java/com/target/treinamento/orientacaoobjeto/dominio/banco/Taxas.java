package com.target.treinamento.orientacaoobjeto.dominio.banco;


public enum Taxas {
	VISA(1, "Visa", 0.05, 0.001, new Visa()),
	MASTERCARD(2, "Mastercard", 0.1, 0.002, new Mastercard());
	
	private Integer codigo;
	private String nome;
	private Double valorTaxa; 
	private Double cofins;
	
	private Cartao cartao;
	
	Taxas(Integer codigo, String nome, Double valorTaxa, Double cofins, Cartao cartao){
		this.codigo = codigo;
		this.nome = nome;
		this.valorTaxa = valorTaxa;
		this.cofins = cofins;
		this.cartao = cartao;
	}

	public String getNome() {
		return nome;
	}

	public Double getValorTaxa() {
		return valorTaxa;
	}

	public Double getCofins() {
		return cofins;
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	
	public Cartao getCartao() {
		return cartao;
	}
	
	public static Taxas getEnum(String nome) {
		for(Taxas taxa : Taxas.values()) {
			if(nome.equals(taxa.getNome())) {
				return taxa;
			}
		}
		return null;
	}
	
	@Override
	public String toString() {
		return "[nome:"+this.nome+"] [taxa:"+this.valorTaxa+"] [cofins:"+this.cofins+"]";
	}
}
