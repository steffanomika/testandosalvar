package repeticaofor;

import java.util.Scanner;

public class Intervalo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/* intervalo de [10,20] */
		/* quantos valores X estão dentro e fora do intervalo (in,out) */

		System.out.print("Digite: ");
		int n = sc.nextInt();

		int in = 0;
		int out = 0;

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				in++;
			} else {
				out++;
			}
		}

		System.out.println(in + " in");
		System.out.println(out + " out");

		sc.close();
	}
}
