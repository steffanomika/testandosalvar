package sequencial;

import javax.swing.JOptionPane;

public class Exercicio05 {

	public static void main(String[] args) {

		String codigoUm, numeroPecaUm, codigoDois, numeroPecaDois, valorUm, valorDois;
		int numeroPecaUmI, numeroPecaDoisI;
		double valorUmD, valorDoisD, total;

		codigoUm = JOptionPane.showInputDialog("Codigo da peça 1");
		numeroPecaUm = JOptionPane.showInputDialog("Número de peças 1");
		valorUm = JOptionPane.showInputDialog("Valor peça 1");
		codigoDois = JOptionPane.showInputDialog("Código peça 2");
		numeroPecaDois = JOptionPane.showInputDialog("Número de peças 2");
		valorDois = JOptionPane.showInputDialog("Valor peça 2");

		numeroPecaUmI = Integer.parseInt(numeroPecaUm);
		numeroPecaDoisI = Integer.parseInt(numeroPecaDois);
		valorUmD = Double.parseDouble(valorUm);
		valorDoisD = Double.parseDouble(valorDois);

		total = numeroPecaUmI * valorUmD + numeroPecaDoisI * valorDoisD;

		JOptionPane.showMessageDialog(null, "Valor a pagar: R$ " + total);

	}

}
