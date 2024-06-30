package primeiroprojetodois;

import javax.swing.JOptionPane;

public class Application {
	public static void main(String[] args) {

		String carro = JOptionPane.showInputDialog("Quatidade de carros");
		String pessoas = JOptionPane.showInputDialog("Quantidade de pessoas");

		/*
		 * double carroD = Double.parseDouble(carro); double pessoasD =
		 * Double.parseDouble(pessoas);
		 */

		int carrosI = Integer.parseInt(carro);
		int pessoasI = Integer.parseInt(pessoas);

		int sobra = carrosI % pessoasI;

		JOptionPane.showMessageDialog(null, carrosI + " carros para " + pessoasI + " pessoas e sobraram " + sobra);

	}

}
