package repeticaofor;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Insira um número: ");
		int N = scan.nextInt();

		int fat = 1;
		for (int i = 1; i <= N; i++) {
			fat = fat * i;
		}

		System.out.println(fat);

		scan.close();
	}

}
