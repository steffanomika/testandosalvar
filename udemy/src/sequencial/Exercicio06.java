package sequencial;

import javax.swing.JOptionPane;

public class Exercicio06 {

	public static void main(String[] args) {

		String A, B, C;
		double Aa, Bb, Cc, triangulo, circulo, trapezio, quadrado, retangulo, pi = 3.14159;

		A = JOptionPane.showInputDialog("Valor de A");
		B = JOptionPane.showInputDialog("Valor de B");
		C = JOptionPane.showInputDialog("Valor de C");

		Aa = Double.parseDouble(A);
		Bb = Double.parseDouble(B);
		Cc = Double.parseDouble(C);

		triangulo = (Aa * Cc) / 2;
		circulo = Math.pow(Cc, 2) * pi;
		trapezio = ((Aa + Bb) * Cc) / 2;
		quadrado = Bb * Bb;
		retangulo = Aa * Bb;

		JOptionPane.showMessageDialog(null, "TRIÂNGULO " + triangulo);
		JOptionPane.showMessageDialog(null, "CIRCULO " + circulo);
		JOptionPane.showMessageDialog(null, "TRAPÉZIO " + trapezio);
		JOptionPane.showMessageDialog(null, "QUADRADO " + quadrado);
		JOptionPane.showMessageDialog(null, "RETÂNGULO " + retangulo);

	}
}
