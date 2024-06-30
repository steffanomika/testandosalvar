package exercicio06;

import java.util.Scanner;

public class Exe06 {

	public static void main(String[] args) {

		// SOMA DE VETORES

		Scanner scan = new Scanner(System.in);

		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = scan.nextInt();

		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];

		System.out.println("Digite os valores do vetor A: ");

		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}

		System.out.println();
		System.out.println("Digite os valores do vetor B: ");
		for (int i = 0; i < b.length; i++) {
			b[i] = scan.nextInt();
		}

		// separar as tarefas??
		System.out.println();
		System.out.println("VETOR RESULTANTE: ");
		for (int i = 0; i < c.length; i++) {
			c[i] = a[i] + b[i];
			System.out.printf("%d%n", c[i]);

		}

		scan.close();

	}

}
