package exercicio09;

import java.util.Locale;
import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {

		// MOSTRAR O NOME DA PESSOA MAIS VELHA

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("Quantas pessoas você vai digitar? ");
		int n = scan.nextInt();

		String[] nome = new String[n];
		int[] idade = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %da pessoa: %n", (i + 1));
			System.out.print("Nome: ");
			nome[i] = scan.next();
			System.out.print("Idade: ");
			idade[i] = scan.nextInt();

		}

		int idadeMaior = idade[0];
		int nomepos = 0;

		for (int i = 1; i < n; i++) {
			if (idade[i] > idadeMaior) {
				idadeMaior = idade[i];
				nomepos = i;
			}
		}

		System.out.println("PESSOA MAIS VELHA: " + nome[nomepos]);
		
		scan.close();

	}

}
