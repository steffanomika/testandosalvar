package exercicio08;

import java.util.Locale;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("Quantos elementos terá o vetor? ");
		int n = scan.nextInt();

		int[] vetor = new int[n];

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = scan.nextInt();
		}

		double paresMedia = 0.0;
		double paresSoma = 0.0;
		int incrementa = 0;

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				paresSoma += vetor[i];
				incrementa++;
			}

		}

		if (incrementa == 0) {
			System.out.println("NENHUM PAR ENCONTRADO");
		} else {
			paresMedia = paresSoma / incrementa;
			System.out.printf("%nMEDIA DOS PARES: %.1f", paresMedia);

		}
		scan.close();

	}

}
