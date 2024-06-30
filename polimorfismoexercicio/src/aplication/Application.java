package aplication;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportProduct;
import entities.Produto;
import entities.UsadoProduct;

public class Application {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		List<Produto> lista = new ArrayList<Produto>();

		System.out.print("Entre com a quantidade de Produtos: ");
		int N = scan.nextInt();

		for (int i = 1; i <= N; i++) {
			System.out.println("Produto #" + i);
			System.out.print("Comum/Usado/Importado (c/u/i)? ");
			char resp = scan.next().charAt(0);
			if (resp == 'i') {
				System.out.print("Nome: ");
				String impoNome = scan.next();
				System.out.print("Preço: ");
				double impoPreco = scan.nextDouble();
				System.out.print("Taxa: ");
				double impoTaxa = scan.nextDouble();
				lista.add(new ImportProduct(impoNome, impoPreco, impoTaxa));

			}

			if (resp == 'c') {
				System.out.print("Nome: ");
				String comNome = scan.next();
				System.out.print("Preço: ");
				double comPreco = scan.nextDouble();
				lista.add(new Produto(comNome, comPreco));

			}

			if (resp == 'u') {
				System.out.print("Nome: ");
				String usaNome = scan.next();
				System.out.print("Preço: ");
				double usaPreco = scan.nextDouble();
				scan.next();
				System.out.print("Data fabricação (DD/MM/YYYY): ");
				LocalDate usaData = LocalDate.parse(scan.next(), fmt);
				lista.add(new UsadoProduct(usaNome, usaPreco, usaData));
			}

		}

		System.out.println();
		for (Produto p : lista) {
			System.out.println(p.priceTag());
		}

		scan.close();

	}

}
