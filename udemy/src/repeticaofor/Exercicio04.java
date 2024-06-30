package repeticaofor;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int Nquantidade = scan.nextInt();
		int a, b;

		for (int i = 0; i < Nquantidade; i++) {
			a = scan.nextInt();
			b = scan.nextInt();

			if (b == 0) {
				System.out.println("Divisão impossivel");
			} else {
				double divisao = (double) a / b;
				System.out.println("divisão " + divisao);
			}
		}
	}

}
