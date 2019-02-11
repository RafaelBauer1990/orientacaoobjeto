package com.target.treinamento.orientacaoobjeto.dominio.newbanco;


public enum Taxa {
	VISA(1, "Visa", 0.05, 0.001, new Visa()),
	MASTERCARD(2, "Mastercard", 0.1, 0.002, new Mastercard());
	
	private Integer codigo;
	private String bandeira;
	private Double taxa;
	private Double cofins;
	private Cartao cartao;
	
		
	private Taxa(Integer codigo, String bandeira, Double taxa, Double cofins, Cartao cartao) {
		this.codigo = codigo;
		this.bandeira = bandeira;
		this.taxa = taxa;
		this.cofins = cofins;
		this.cartao = cartao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getBandeira() {
		return bandeira;
	}

	public void setBandeira(String bandeira) {
		
		this.bandeira = bandeira;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}

	public Double getCofins() {
		return cofins;
	}

	public void setCofins(Double cofins) {
		this.cofins = cofins;
	}

	public Cartao getCartao() {
		return cartao;
	}

	public void setCartao(Cartao cartao) {
		this.cartao = cartao;
	}

	
	}

