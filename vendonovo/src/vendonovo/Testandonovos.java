package vendonovo;

import javax.swing.JOptionPane;

public class Testandonovos {

	public static void main(String[] args) {
		
		String nome = "Stéffano";
		System.out.println(nome);
		
		String nome2 = JOptionPane.showInputDialog("Informe seu nome");
		JOptionPane.showMessageDialog(null, nome2);
	}
}
