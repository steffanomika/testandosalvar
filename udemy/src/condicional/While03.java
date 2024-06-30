package condicional;

import java.util.Scanner;

public class While03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		/*Ler tipo de combustivel (alcool=1, gasolina=2, diesel=3, fim=4
		 * se informar um numero diferente d 4, deve continuar pedidn codigo
		 * (o programa encerra quando digitar 4 e mostrar a quantidade de cada tipo
		 * de combustivel que foi digitado*/

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		System.out.println("Informe o código");
		int codigo = scan.nextInt();

		while (codigo != 4) {
			codigo = scan.nextInt();
			if (codigo == 1) {
				alcool++;
			} else if (codigo == 2) {
				gasolina++;
			} else if (codigo == 3) {
				diesel++;
			}
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
	}

}
