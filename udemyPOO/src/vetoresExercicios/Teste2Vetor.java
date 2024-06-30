package vetoresExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Teste2Vetor {

	public static void main(String[] args) {

		// """"TIPO REFERÊNCIA""""
		// ler quantidade N de dados(nome, preço) de N produtos
		// Armazene N produtos em um vetor e mostrar preço médio dos produtos

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		System.out.print("Quantidade de produtos: ");
		int quantidade = scan.nextInt();
		Produto[] vetor = new Produto[quantidade];

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Nome: ");
			scan.nextLine();
			String nome = scan.nextLine();
			System.out.print("Preço: ");
			double preco = scan.nextDouble();
			vetor[i] = new Produto(nome, preco);

		}

		double soma = 0.0;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i].getPreco();
		}

		double mediaProduto = soma / vetor.length;
		System.out.printf("Média de preço: %.2f", mediaProduto);

		scan.close();
	}

}
