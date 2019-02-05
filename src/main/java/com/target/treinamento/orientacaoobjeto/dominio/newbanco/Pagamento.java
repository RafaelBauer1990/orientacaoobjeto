package com.target.treinamento.orientacaoobjeto.dominio.newbanco;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.BreakIterator;

public class Pagamento {
	
	String bandeira;
	Integer operacao;
	String nomeCliente;
	Double valor;
	
	public void inicializa() throws IOException{
		
	
		FileReader arq = new FileReader("C:\\Users\\aluno03sala04\\workspace-rafael\\orientacaoobjeto\\arquivos\\transacoes.txt");
		BufferedReader arqLido = new BufferedReader(arq);
		
		String linha = arqLido.readLine();
		System.out.println(linha);
		
		while (linha != null) {
			
			
			String[] linhaQuebrada = linha.split(";");
			String linha = arqLido.readLine();
			
			System.out.println(linhaQuebrada);
				
			
		} 

		
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
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}


}
