package praticandoMetodos;

import java.awt.geom.Area;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		Retangulo1 retangulo = new Retangulo1();

		System.out.print("Digite a largura: ");
		retangulo.largura = scan.nextDouble();

		System.out.print("Digite a altura: ");
		retangulo.altura = scan.nextDouble();

		System.out.printf("Area = %.2f%n", retangulo.Area());
		System.out.printf("Perimetro = %.2f%n", retangulo.perimetro());

		scan.close();
	}
}
