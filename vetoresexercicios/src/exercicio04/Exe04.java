package exercicio04;

import java.util.Scanner;

public class Exe04 {

	public static void main(String[] args) {

		// Descobrir NÚMEROS PARES

		Scanner scan = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar? ");
		int n = scan.nextInt();

		int[] vetor = new int[n];

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = scan.nextInt();
		}

		System.out.println();
		System.out.println("NÚMEROS PARES: ");

		int pares = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.printf("%d ", vetor[i]);
				pares++;
			}

		}

		System.out.printf("%n%nQUANTIDADE DE PARES = %d", pares);

		scan.close();

	}

}
