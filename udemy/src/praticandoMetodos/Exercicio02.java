package praticandoMetodos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		Funcionario2 funcionario = new Funcionario2();

		System.out.print("Nome: ");
		funcionario.nome = scan.nextLine();
		System.out.print("Salário: ");
		funcionario.salarioBruto = scan.nextDouble();
		System.out.print("Imposto: ");
		funcionario.imposto = scan.nextDouble();

		System.out.println();
		System.out.println("Funcionario: " + funcionario);
		System.out.println();

		System.out.print("Aumento: ");
		double aumento = scan.nextDouble();
		funcionario.aumentaSalario(aumento);
		System.out.println();

		System.out.println("Atualização do funcionario: " + funcionario);

		scan.close();
	}

}
