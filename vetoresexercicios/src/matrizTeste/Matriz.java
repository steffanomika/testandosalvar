package matrizTeste;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Linhas: ");
		int m = scan.nextInt();
		System.out.print("Colunas: ");
		int n = scan.nextInt();

		int[][] vetor = new int[m][n];

		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor[i].length; j++) {
				vetor[i][j] = scan.nextInt();

			}
		}

		System.out.println();
		System.out.print("Valor de X: ");
		int x = scan.nextInt();

		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor[i].length; j++) {
				if (vetor[i][j] == x) {
					System.out.println("Posição: " + i + "," + j);
					if (j > 0) {
						System.out.println("Esquerda: " + vetor[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Acima: " + vetor[i - 1][j]);
					}
					if (j < vetor[i].length - 1) {
						System.out.println("Direita: " + vetor[i][j + 1]);
					}
					if (i < vetor.length - 1) {
						System.out.println("De baixo: " + vetor[i + 1][j]);
					}

				}
			}
		}

		scan.close();

	}

}
