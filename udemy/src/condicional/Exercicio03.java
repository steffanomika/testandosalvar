package condicional;

import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {

		String A, B;
		int Aa, Bb;

		A = JOptionPane.showInputDialog("Valor A");
		B = JOptionPane.showInputDialog("Valor B");

		Aa = Integer.parseInt(A);
		Bb = Integer.parseInt(B);

		if (Aa % Bb == 0 || Bb % Aa == 0) {
			JOptionPane.showMessageDialog(null, "SÃO MULTIPLOS");
		} else {
			JOptionPane.showMessageDialog(null, "NÃO SÃO MULTIPLOS");
		}
		/*------------------------------------------------------------------------------**/
		if (Aa >= Bb) {
			if (Aa % Bb == 0) {
				JOptionPane.showMessageDialog(null, "SÃO MULTIPLOS");
			} else {
				JOptionPane.showMessageDialog(null, "NÃO SÃO MULTIPLOS");
			}
		} else if (Bb >= Aa) {
			if (Bb % Aa == 0) {
				JOptionPane.showMessageDialog(null, "SÃO MULTIPLOS");
			} else {
				JOptionPane.showMessageDialog(null, "NÃO SÃO MULTIPLOS");
			}
		}
	}
}