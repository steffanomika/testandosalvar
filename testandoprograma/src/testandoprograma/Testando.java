package testandoprograma;

import javax.swing.JOptionPane;

public class Testando {
	
	public static void main(String[] args) {
		
		String nome = "stéffano";
		System.out.println(nome);
		
		String nome1 = JOptionPane.showInputDialog("Seu nome");
		JOptionPane.showMessageDialog(null, nome1);
		
		
	}

}
