package com.target.treinamento.orientacaoobjeto.dominio.meubanco;

public class Pagamento {

	String bandeira;
	Integer operacao;
	Double valor;
	String nomeCliente;
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getBandeira() {
		return bandeira;
	}
	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}
	public Integer getOperacao() {
		return operacao;
	}
	public void setOperacao(Integer operacao) {
		this.operacao = operacao;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Pagamento [bandeira = " + bandeira +", operacao = " + valor + "nomeCliente = " + nomeCliente +"]"; 
	}


}
