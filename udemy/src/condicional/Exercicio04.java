package condicional;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int horaInicial = scan.nextInt();
		int horaFinal = scan.nextInt();

		int duracao;
		if (horaFinal < horaInicial) {
			duracao = (24 - horaInicial) + horaFinal;
		} else {
			duracao = (horaFinal - horaInicial);
		}

		System.out.println("Duração: " + duracao);

		scan.close();
	}

}
