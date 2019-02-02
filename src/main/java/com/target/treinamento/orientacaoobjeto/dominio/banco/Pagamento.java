package com.target.treinamento.orientacaoobjeto.dominio.banco;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Pagamento {

	private String bandeira;
	private Integer operacao;
	private Double valorPgto;

	Cartao visa = new Visa();
	Cartao mastercard = new Mastercard();


	void incializa() throws IOException {

		List<String> list = lerArquivo();
		System.out.println(list);
		List<Transacao> transacoes = new ArrayList<Transacao>();


		for (String linha : list) {

			String[] linhaQuebrada = linha.split(";");

			Transacao transacao = new Transacao();

			transacao.setBandeira(linhaQuebrada[0]);
			transacao.setOperacao(Integer.valueOf(linhaQuebrada[1]));
			transacao.setValor(Double.valueOf(linhaQuebrada[2]));
			transacao.setNomeCliente(linhaQuebrada[3]);

			transacoes.add(transacao);
		}

		processaTransacao(transacoes);
		

	}


	private void processaTransacao(List<Transacao> transacoes) {
		for (Transacao transacao : transacoes) {
			Taxas meuEnum = Taxas.valueOf(transacao.getBandeira().toUpperCase());

			Cartao cartao = meuEnum.getCartao();

			if(transacao.getOperacao() == 1) {
				cartao.debito(valorPgto);
			} else if (transacao.getOperacao() == 2) {
				cartao.credito(valorPgto);
			}
			
			
		}

	}


	private List<String> lerArquivo() throws IOException {
		InputStream inputStream = new FileInputStream("C:\\Users\\aluno03sala04\\workspace-rafael\\orientacaoobjeto-rdanieli\\src\\main\\resources\\transacoes.txt");

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

		List<String> minhasLinhas = new ArrayList<String>();

		while(true) {
			String linha = bufferedReader.readLine();
			if(linha != null) {
				minhasLinhas.add(linha);	
			} else {
				break;
			}
		}

		return minhasLinhas;


	}
}



