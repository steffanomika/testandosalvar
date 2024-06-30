package exercicio05;

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		// MOSTRAR O MAIOR VALOR E A POSIÇÃO DO MESMO

		System.out.print("Quantos números você vai digitar? ");
		int n = scan.nextInt();

		double[] reais = new double[n];

		for (int i = 0; i < reais.length; i++) {
			System.out.print("Digite um número: ");
			reais[i] = scan.nextDouble();
		}

		int posmaior = 0;
		double maior = reais[0];

		for (int i = 1; i < reais.length; i++) {
			if (reais[i] > maior) {
				maior = reais[i];
				posmaior = i;
			}
		}

		System.out.printf("%nMAIOR VALOR = %.1f\n", maior);
		System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posmaior);

		scan.close();
	}
}
