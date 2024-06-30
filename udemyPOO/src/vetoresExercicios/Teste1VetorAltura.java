package vetoresExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Teste1VetorAltura {

	public static void main(String[] args) {

		// VETOR DO TIPO """VALOR"""
		// programa que lê altura de N pessoas
		// armazena alturas em um vetor e calcula media das pessoas

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("Número de pessoas: ");
		int n = scan.nextInt();
		System.out.print("Alturas: ");

		double[] vetor = new double[n];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = scan.nextDouble();
		}

		double soma = 0.0;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}

		double media = soma / n;
		System.out.printf("Média de altura: %.2f", media);

		scan.close();
	}
}
