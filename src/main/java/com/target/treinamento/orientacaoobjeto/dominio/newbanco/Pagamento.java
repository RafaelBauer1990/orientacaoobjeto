package com.target.treinamento.orientacaoobjeto.dominio.newbanco;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;

public class Pagamento {

	private String bandeira;
	private Integer operacao;
	private String nomeCliente;
	private Double valor;

	public void inicializa() throws IOException{
		
		lerArquivo();
	}

	
	

	private void lerArquivo() throws IOException {


		FileReader arq = new FileReader("C:\\Users\\RAFAEL BAUER\\eclipse-workspace\\MeuProjeto\\resouces\\arquivoInicial.txt");
		BufferedReader arqLido = new BufferedReader(arq);

		while (true) {

			List<String> listaPagamentos = new ArrayList<String>();
			String linha = arqLido.readLine();
			if (linha !=null) {
				String[] linhaQuebrada = linha.split(";");
				

				this.bandeira = linhaQuebrada[0].toUpperCase();
				this.operacao = Integer.valueOf(linhaQuebrada[1]);
				this.valor = Double.valueOf(linhaQuebrada[2]);
				this.nomeCliente = linhaQuebrada[3].toUpperCase();
				System.out.println(linhaQuebrada);
				//System.out.println("[bandeira: "  getBandeira() + " operação: " + getOperacao()+ " valor: " + getValor() + " Cliente: " + getNomeCliente()+"]");
				listaPagamentos.addAll(linhaQuebrada);
				//processaPagamento();
			} else {
				break;
			}
							
			}
		
		}


	//private void processaPagamento() {
		//}
		

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
