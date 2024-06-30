package exercicio02;

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar? ");
		int n = scan.nextInt();

		double[] vetor = new double[n];

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = scan.nextDouble();
		}

		double soma = 0.0;

		System.out.println();
		System.out.print("VALORES: ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("%.1f ", vetor[i]);
			soma += vetor[i];
		}

		double media = soma / n;
		System.out.printf("%nSOMA = %.2f%n", soma);
		System.out.printf("MÉDIA = %.2f%n", media);

		scan.close();
	}
}
