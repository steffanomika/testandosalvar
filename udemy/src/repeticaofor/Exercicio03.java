package repeticaofor;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double N1, N2, N3, mediaPonderada;

		/* Calculando Média ponderada */

		System.out.print("Digite o numero ");
		int Nquantidade = scan.nextInt();

		for (int i = 0; i < Nquantidade; i++) {
			N1 = scan.nextDouble();
			N2 = scan.nextDouble();
			N3 = scan.nextDouble();

			mediaPonderada = (N1 * 2.0 + N2 * 3.0 + N3 * 5.0) / 10.0;

			System.out.printf("Media ponderada: %.1f%n", mediaPonderada);
		}

	}

}
