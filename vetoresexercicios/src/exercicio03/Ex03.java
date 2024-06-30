package exercicio03;

import java.util.Locale;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("Quantas pessoa serão digitadas? ");
		int n = scan.nextInt();

		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];

		double somaAltura = 0.0;
		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %da pessoa:%n", i + 1);
			System.out.print("Nome: ");
			nome[i] = scan.nextLine();
			scan.nextLine();
			System.out.print("Idade: ");
			idade[i] = scan.nextInt();
			System.out.print("Altura: ");
			altura[i] = scan.nextDouble();
			somaAltura += altura[i];
		}

		int menores = 0;

		for (int i = 0; i < n; i++) {
			if (idade[i] < 16) {
				menores++;
			}

		}

		double media = somaAltura / n;
		double percentualMenores = (double) menores / n * 100;

		System.out.println();
		System.out.printf("Altura média: %.2f", media);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%n" + percentualMenores);

		for (int i = 0; i < n; i++)
			if (idade[i] < 16) {
				System.out.println(nome[i]);
			}

		scan.close();
	}

}
