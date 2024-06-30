package exercicio10;

import java.util.Locale;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("Quantos alunos serão digitados? ");
		int n = scan.nextInt();

		String[] nome = new String[n];
		double[] nota1 = new double[n];
		double[] nota2 = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + " aluno:");
			scan.nextLine();
			nome[i] = scan.nextLine();
			nota1[i] = scan.nextDouble();
			nota2[i] = scan.nextDouble();

		}

		System.out.println();
		System.out.println("ALUNOS APROVADOS: ");
		for (int i = 0; i < n; i++) {
			double media = (nota1[i] + nota2[i]) / 2.0;
			if (media >= 6.0) {
				System.out.println(nome[i]);
			}

		}

		scan.close();
	}

}
