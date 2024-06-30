package exercicioConstrutor;

import java.util.Locale;
import java.util.Scanner;

public class Application01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Conta conta;

		System.out.print("Número da conta: ");
		int contaNumero = scan.nextInt();
		System.out.print("Nome do titular: ");
		scan.nextLine();
		String nomeTitular = scan.nextLine();
		System.out.print("Depósito incial? [s/n] ");
		char resposta = scan.next().charAt(0);
		if (resposta == 's') {
			System.out.print("Entre com o valor do deposito: ");
			double depositoInicial = scan.nextDouble();
			conta = new Conta(contaNumero, nomeTitular, depositoInicial);
		} else {
			conta = new Conta(contaNumero, nomeTitular);
		}

		System.out.println();
		System.out.println("Conta corrente: ");
		System.out.println(conta);
		System.out.println();

		System.out.print("Valor do depósito: ");
		double deposito = scan.nextDouble();
		conta.depositoConta(deposito);
		System.out.println("ATUALIZAÇÃO:  " + conta);
		System.out.println();

		System.out.println("Valor do saque: ");
		double saque = scan.nextDouble();
		conta.saqueConta(saque);
		System.out.println("ATUALIZAÇÃO: " + conta);

		scan.close();
	}

}
