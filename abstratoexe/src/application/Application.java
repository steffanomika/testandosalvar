package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Application {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		List<Pessoa> list = new ArrayList<Pessoa>();

		System.out.print("Numero de contribuintes: ");
		int N = scan.nextInt();

		for (int i = 1; i <= N; i++) {
			System.out.println("Contribuinte #" + i);
			System.err.print("Individual or Company (i/c)? ");
			char resp = scan.next().charAt(0);
			System.out.print("Nome:");
			String nome = scan.next();
			System.out.print("Renda anual: ");
			double rendaAnual = scan.nextDouble();

			if (resp == 'i') {
				System.out.print("Gastos com saúde: ");
				double gastosSaude = scan.nextDouble();
				list.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
			} else {
				System.out.print("Numeros de funcionarios: ");
				int numero = scan.nextInt();
				list.add(new PessoaJuridica(nome, rendaAnual, numero));
			}

		}

		System.out.println();
		System.out.println("TAXES PAID");

		double total = 0.0;
		for (Pessoa p : list) {
			System.out.printf(p.getNome() + ": $" + String.format("%.2f", p.imposto()) + "\n");
			total += p.imposto();
		}

		System.out.println();
		System.out.printf("TOTAL TEXES: " + String.format("%.2f", total));

		scan.close();
	}

}
