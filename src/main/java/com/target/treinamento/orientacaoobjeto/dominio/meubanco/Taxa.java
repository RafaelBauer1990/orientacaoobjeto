package com.target.treinamento.orientacaoobjeto.dominio.meubanco;

public enum Taxa {

	VISA(1, "Visa", 0.05, 0.001, new Visa()),
	MASTERCARD(2, "Mastercard", 0.1, 0.002, new Mastercard());

	private Integer codigo;
	private String nomeBandeira;
	private Double valorTaxa;
	private Double confins;
	private Cartao cartao;

	//construtor do enum Visa ou Mastercard
	Taxa(Integer codigo, String nomeBandeira, Double valorTaxa, Double confins, Cartao cartao) {

		this.codigo = codigo;
		this.nomeBandeira = nomeBandeira;
		this.valorTaxa = valorTaxa;
		this.confins = confins;
		this.cartao = cartao;

	}


		public static Taxa valueOf(Integer codigo) {
		for(Taxa taxa : Taxa.values()) {
			if(codigo.equals(taxa.getCodigo())) { 
				return taxa;
			}
		}
		return null;

//		public static  Taxa getEnum(String getNomeBandeira) {
//			for(Taxa taxa : Taxa.values()) {
//				if(getNomeBandeira.equalsIgnoreCase(taxa.getNomeBandeira())) {
//					return taxa;
//				}
//			}
//			return null;
//		}

	}



	public Integer getCodigo() {
		return codigo;
	}


	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}



	public String getNomeBandeira() {
		return nomeBandeira;
	}

	public void setNomeBandeira(String nomeBandeira) {
		this.nomeBandeira = nomeBandeira;
	}

	public Double getValorTaxa() {
		return valorTaxa;
	}

	public void setValorTaxa(Double valorTaxa) {
		this.valorTaxa = valorTaxa;
	}

	public Double getConfins() {
		return confins;
	}

	public void setConfins(Double confins) {
		this.confins = confins;
	}

	public Cartao getCartao() {
		return cartao;
	}

	public void setCartao(Cartao cartao) {
		this.cartao = cartao;
	}



}





