package com.target.treinamento.orientacaoobjeto.dominio.novobanco;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.text.AbstractDocument.LeafElement;



public class Principal {
	public static void main(String[] args) {

		try {
			new Principal().inicializa();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		MeuDado<String> meuDado = new MeuDado<String>();
		
		meuDado.getMinhaClasse("Está é minha classe muito legal");

	}

	private void inicializa() throws IOException {
		List<String> list = lerArquivo();
		System.out.println("vai printar...");
		System.out.println(list);
		List<Transacao> transacaoes = new ArrayList<Transacao>();

		int contador = 0;
		Double soma = 0.0;
		Double media = 0.0;
		Double menorValor = 0.0;
		Double maiorValor = 0.0;

		for (String linha : list) {

			String[] linhaQuebrada = linha.split(";");

			Transacao transacao = new Transacao();

			transacao.setBandeira(linhaQuebrada[0]);
			transacao.setOperacao(Integer.valueOf(linhaQuebrada[1]));
			transacao.setValor(Double.valueOf(linhaQuebrada[2]));
			transacao.setNomeCliente(linhaQuebrada[3]);

			transacaoes.add(transacao);

			//Inclui o indice do espaço contido na string nomeCliente
			Integer indiceSobrenome = transacao.getNomeCliente().indexOf(" ");
			//printa o nome e sobrenome utilizando uma substring dizendo a posição inicial e a final
			System.out.println(transacao.getNomeCliente().substring(indiceSobrenome).toUpperCase() + ", " + transacao.getNomeCliente().substring(0, indiceSobrenome));


			//pega o valor da transação que está na primeira posição da lista de transações
			menorValor = transacaoes.get(0).getValor();

			if (transacao.getValor() < menorValor) {

				menorValor = transacao.getValor();
			} 

			if (transacao.getValor() > maiorValor)

				maiorValor = transacao.getValor();
		}

		//percorre toda a  
		for (Transacao transacao : transacaoes) {

			soma = soma + transacao.getValor();
			contador++;
		}

		System.out.println("A soma de todas as transações é: " + soma);
		media = soma/contador;
		System.out.println("A ticket médio é de: " + media);
		System.out.println("O menor valor do ticket é: " + menorValor);
		System.out.println("O maior valor do ticket é: " + maiorValor);



		processaTransacoes(transacaoes);
	}

	private void processaTransacoes(List<Transacao> transacaoes) throws IOException {

		BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\\\Users\\\\aluno03sala04\\\\workspace-rafael\\\\orientacaoobjeto\\\\arquivos\\\\saidaTransacoes.txt", false));

		NumberFormat format = DecimalFormat.getInstance(Locale.US);
		format.setMinimumFractionDigits(2);
		format.setMaximumFractionDigits(2);

		// interação sobre todas as transações
		for (Transacao transacao : transacaoes) {

			// Utilizo o valueOf para obter o Enum, baseado no nome da bandeira
			Taxas meuEnum = Taxas.valueOf(transacao.getBandeira().toUpperCase());

			// Obtenho o cartão selecionado baseado na informação do arquivo
			Cartao cartao = meuEnum.getCartao();

			Double novoValor = 0.0;

			// Verifico qual a operação o usuário selecionou
			if (transacao.getOperacao() == 1) {

				// Executo a chamada da interface débito, passando o valor
				novoValor = cartao.debito(transacao.getValor());

			} else if (transacao.getOperacao() == 2) {

				// Executo a chamada da interface crédito, passando o valor
				novoValor = cartao.credito(transacao.getValor());

			}

			writer.append(meuEnum.getNome())
			.append(";")
			.append(transacao.getOperacao().toString())
			.append(";")
			.append(format.format(novoValor))
			.append(";")
			.append(transacao.getNomeCliente());

			writer.newLine();
		}

		writer.flush();
		writer.close();
	}

	private List<String> lerArquivo() throws IOException {
		InputStream inputStream = new FileInputStream("C:\\\\Users\\\\aluno03sala04\\\\workspace-rafael\\\\orientacaoobjeto\\\\arquivos\\\\transacoes.txt");

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

		List<String> minhasLinhas = new ArrayList<String>();

		while (true) {
			String linha = bufferedReader.readLine();
			if (linha != null) {
				minhasLinhas.add(linha);
			} else {
				break;
			}
		}

		return minhasLinhas;
	}
	
	
	
	

}