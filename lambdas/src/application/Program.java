package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		List<Funcionario> lista = new ArrayList<>();

		lista.add(new Funcionario("Maria", "maria@gmail.com", 3200.00));
		lista.add(new Funcionario("Alex", "alex@gmail.com", 1900.00));
		lista.add(new Funcionario("Marco", "marco@gmail.com", 1700.00));
		lista.add(new Funcionario("Bob", "bob@gmail.com", 3500.00));
		lista.add(new Funcionario("Ana", "ana@gmail.com", 2800.00));

		System.out.print("Entre com um salário: ");
		double salarioMaior = scan.nextDouble();

		System.out.println();
		System.out.println("Email das pessoas com salários acima de " + String.format("%.2f", salarioMaior));

		List<String> emails = lista.stream().filter(x -> x.getSalario() > salarioMaior).map(x -> x.getEmail()).sorted()
				.collect(Collectors.toList());

		emails.forEach(System.out::println);

		System.out.println();

		double soma = lista.stream().filter(x -> x.getNome().charAt(0) == 'M').map(x -> x.getSalario()).reduce(0.0,
				(x, y) -> x + y);

		System.out
				.println("Soma dos salarios dos funcionarios que o nome começam com M: " + String.format("%.2f", soma));

		scan.close();

	}

}
