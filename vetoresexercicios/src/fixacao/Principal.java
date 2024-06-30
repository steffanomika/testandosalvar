package fixacao;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("Quantos quartos serão ocupados? ");
		int quantidade = scan.nextInt();

		Estudantes[] aluguel = new Estudantes[10];

		for (int i = 0; i < quantidade; i++) {
			System.out.print("Nome: ");
			scan.nextLine();
			String nome = scan.nextLine();
			System.out.print("Email: ");
			String email = scan.next();
			System.out.print("Quarto: ");
			int quarto = scan.nextInt();
			aluguel[quarto] = new Estudantes(nome, email);

		}

		for (int i = 0; i < 10; i++) {
			if (aluguel[i] != null) {
				System.out.println(i + "# " + aluguel[i]);
			}

		}

		scan.close();
	}

}
