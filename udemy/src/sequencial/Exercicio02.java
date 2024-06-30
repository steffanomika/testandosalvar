package sequencial;

import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {

		double raiod, area, area2, pi = 3.14159;

		String raio = JOptionPane.showInputDialog("Informe o valor do raio");
		raiod = Double.parseDouble(raio);

		area = pi * (Math.pow(raiod, 2));
		area2 = pi * raiod * raiod;

		JOptionPane.showMessageDialog(null, "Area: " + area + " dois: " + area2);
	}

}
