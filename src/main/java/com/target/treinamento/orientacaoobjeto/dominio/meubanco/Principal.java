package com.target.treinamento.orientacaoobjeto.dominio.meubanco;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		// chama o método incializa para não manter dados estaticos
		Principal principal = new Principal();
		try {
			principal.inicializa();
		} catch (IOException e) {
			System.out.println("Não foi possivel ioncializar o programa");
			e.printStackTrace();
		}
		

	}

	// método que chama a sequencia de metodos que realizam as tarefas da aplicação
	public void inicializa() throws IOException{

		List<String> lista = lerPagamento();
		List<Pagamento> pagamentos = new ArrayList<Pagamento>();
		//System.out.println(lista);


		for (String linha : lista) {

			String[] linhaQuebrada = linha.split(";");
			//System.out.println(linhaQuebrada);

			Pagamento pagamento = new Pagamento();



			pagamento.setBandeira(linhaQuebrada[0].toUpperCase());
			pagamento.setOperacao(Integer.valueOf(linhaQuebrada[1]));
			pagamento.setValor(Double.valueOf(linhaQuebrada[2]));
			pagamento.setNomeCliente(linhaQuebrada[3].toUpperCase());
			pagamentos.add(pagamento);
			System.out.println(pagamentos);
		}
		processaPagamento(pagamentos);

	}

	// processa o pagamento identificando bandeira, operação, valor e nome do cliente

	private void processaPagamento(List<Pagamento> pagamentos) { 
		
		for (Pagamento pagamento : pagamentos) {
			
			System.out.println(pagamento);
			System.out.println(pagamento.getOperacao());
			Taxa enumTaxa = Taxa.valueOf(pagamento.getBandeira());
			System.out.println(enumTaxa);
			
			
			
			
		}
		



	}



	// lê o arquivo com o registro dos pagamento
	public List<String> lerPagamento() throws IOException {

		// instancia o arquivo
		FileReader arq = new FileReader("C:\\Users\\RAFAEL BAUER\\Documents\\pagamentoParaProcessar.txt");
		// lê o conteúdo do arquivo
		BufferedReader lerArq = new BufferedReader(arq);

		// salva o conteúdo de uma linha na variável
		String linha = lerArq.readLine();

		// instancia uma lista para quardar as linhas lidas
		List<String> listaDoArquivo = new ArrayList<String>();

		// percorre todo o arquivo até chegar na última linha onde a linha será igual a
		// null.
		while (linha != null) {

			// adiciona a linha dentro da lista
			listaDoArquivo.add(linha);

			// System.out.println(linha);
			linha = lerArq.readLine();
		}

		return listaDoArquivo;

	}
}
