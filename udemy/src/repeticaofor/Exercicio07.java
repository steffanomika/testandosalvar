package repeticaofor;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite um número ");
		int N = scan.nextInt();

		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " " + (int) Math.pow(i, 2) + " " + (int) Math.pow(i, 3));
		}

		System.out.println(" ------------------------------ ");
		for (int i = 1; i <= N; i++) {
			System.out.println(i + " " + i * i + " " + i * i * i);
		}
	}

}
