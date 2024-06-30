package execicio07;

import java.util.Locale;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		// MEDIA DO VETOR E ELEMENTOS ABAIXO DA MÉDIA

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = scan.nextInt();

		double[] vetor = new double[n];

		double soma = 0.0;
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = scan.nextDouble();
			soma += vetor[i];
		}

		double media = soma / n;

		System.out.printf("%nMÉDIA DOS VETORES: %.3f%n", media);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < media) {
				System.out.println(vetor[i]);
			}

		}

		scan.close();

	}

}
