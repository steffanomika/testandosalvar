package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Departamento;
import entities.Funcionario;
import entities.HoraContrato;
import entities.enums.FuncionarioLevel;

public class Application {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		DateTimeFormatter formantando = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.print("Nome do departamento: ");
		String nomeDepartamento = scan.nextLine();
		System.out.println("ENTRE COM OS DADOS DO TRABAHADOR");
		System.out.print("Nome: ");
		String nomeFunconario = scan.nextLine();
		System.out.print("Nivel: ");
		String nivelFuncionario = scan.nextLine();
		System.out.print("Salário base: ");
		double salarioBase = scan.nextDouble();

		Funcionario funcionario = new Funcionario(nomeFunconario, FuncionarioLevel.valueOf(nivelFuncionario),
				salarioBase, new Departamento(nomeDepartamento));

		System.out.println();
		System.out.print("Quantos contratos para esse trabalhador? ");
		int n = scan.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Entre com o contrato #" + i);
			System.out.print("Data (DD/MM/YYYY): ");
			LocalDate contratoData = LocalDate.parse(scan.next(), formantando);
			System.out.print("Valor por hora: ");
			double valorPorHora = scan.nextDouble();
			System.out.print("Duração: (horas) ");
			int horas = scan.nextInt();
			HoraContrato contrato = new HoraContrato(contratoData, valorPorHora, horas);
			funcionario.addContratos(contrato);
		}

		System.out.println();
		System.out.print("Entre com o mês e ano para calcular o salário: (MM/YYYY) ");
		String anoMes = scan.next();
		int mes = Integer.parseInt(anoMes.substring(0, 2));
		int ano = Integer.parseInt(anoMes.substring(3));

		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Departamento: " + funcionario.getDepartamento().getNome());
		System.out.println("Renda para " + anoMes + ": " + String.format("%.2f", funcionario.renda(ano, mes)));

		scan.close();
	}

}
