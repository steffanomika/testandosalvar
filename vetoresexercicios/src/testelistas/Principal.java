package testelistas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		List<Funcionario> lista = new ArrayList<>();

		System.out.print("Quantos funcionarios? ");
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.println();
			System.out.println("Funcionario #" + (i + 1) + ": ");
			System.out.print("ID: ");
			int id = scan.nextInt();

			while (hasId(lista, id)) {
				System.out.print("ID já existe, digite novamente: ");
				id = scan.nextInt();
			}

			System.out.print("Nome: ");
			scan.nextLine();
			String nome = scan.nextLine();
			System.out.print("Salario: ");
			double salario = scan.nextDouble();

			lista.add(new Funcionario(id, nome, salario));
		}

		System.out.println();
		System.out.print("Entre com ID do funcionario que quer aumentar: ");
		int idAumento = scan.nextInt();

		Funcionario funcionario = lista.stream().filter(x -> x.getId() == idAumento).findFirst().orElse(null);

		if (funcionario == null) {
			System.out.println("ID inexistente!");
		} else {
			System.out.print("Entre com a porcentagem: ");
			double porcentagem = scan.nextDouble();
			funcionario.aumentaSalario(porcentagem);
		}

		System.out.println();
		System.out.println("LISTA DE FUNCIONARIOS:");
		for (Funcionario imprimir : lista) {
			System.out.println(imprimir);
		}

		scan.close();
	}

	public static boolean hasId(List<Funcionario> lista, int id) {
		Funcionario funcionario = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return funcionario != null;
	}

}
