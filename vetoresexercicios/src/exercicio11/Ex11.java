package exercicio11;

import java.util.Locale;
import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.println("Quantas pessoas serão digitadas?");
		int n = scan.nextInt();

		double[] altura = new double[n];
		char[] genero = new char[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Altura da " + (i + 1) + "a pessoa:");
			altura[i] = scan.nextDouble();
			System.out.print("Gênero da " + (i + 1) + "a pessoa:");
			genero[i] = scan.next().charAt(0);

		}

		double menorAltura = altura[0];
		double maiorAltura = altura[0];

		for (int i = 1; i < n; i++) {
			if (altura[i] < menorAltura) {
				menorAltura = altura[i];
				System.out.printf("%nMENOR ALTURA: %.2f%n", menorAltura);
			}
			if (altura[i] > maiorAltura) {
				maiorAltura = altura[i];
				System.out.printf("%nMAIOR ALTURA: %.2f%n", maiorAltura);
			}
		}

		double mediaMulheres = 0.0, soma = 0.0;
		int mulheres = 0, homens = 0;
		;

		for (int i = 0; i < n; i++) {
			if (genero[i] == 'F') {
				soma += altura[i];
				mulheres++;
			} else {
				homens++;
			}
		}

		mediaMulheres = soma / mulheres;
		System.out.printf("Media de altura das mulheres: %.2f%n", mediaMulheres);
		System.out.println("Números de homens: " + homens);
		scan.close();
	}

}
