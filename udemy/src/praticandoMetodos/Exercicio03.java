package praticandoMetodos;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		Aluno3 aluno = new Aluno3();
		System.out.print("Nome do Aluno: ");
		aluno.nome = scan.nextLine();
		System.out.println("Notas");
		aluno.nota1 = scan.nextDouble();
		aluno.nota2 = scan.nextDouble();
		aluno.nota3 = scan.nextDouble();

		System.out.printf("NOTA FINAL: %.2f%n" , aluno.calculaMedia());

		if (aluno.calculaMedia() < 60) {
			System.out.println("FAILD");
			System.out.printf("PONTOS QUE FALTAM: %.2f%n", aluno.faltaPontos());
		} else {
			System.out.println("PASS");
		}

		scan.close();

	}
}
