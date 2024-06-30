package primeiroprojeto;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Nome do aluno");
		String nota1 = JOptionPane.showInputDialog("Nota 1");
		String nota2 = JOptionPane.showInputDialog("Nota 2");
		String nota3 = JOptionPane.showInputDialog("Nota 3");
		String nota4 = JOptionPane.showInputDialog("Nota 4");

		/* VER VIDEO DE COMO MUDAR STRING PARA DOUBLE JDEV TREINAMENTOS */

		double notas1 = Double.parseDouble(nota1);
		double notas2 = Double.parseDouble(nota2);
		double notas3 = Double.parseDouble(nota3);
		double notas4 = Double.parseDouble(nota4);

		/*
		 * O valor não pode ter "," virgulas, tem que ser em "." ponto. (ver isso
		 * depois) <-- IMPORTANTE (acho que é locale)
		 */

		double media = ((notas1 + notas2 + notas3 + notas4) / 4);

		if (media >= 90) {
			JOptionPane.showMessageDialog(null, "PARABÉNS, MÉDIA DE " + media);
		} else if (media >= 70) {
			JOptionPane.showMessageDialog(null, nome + " ESTÁ  APROVADO POR " + media);
		} else if (media >= 50) {
			JOptionPane.showMessageDialog(null, nome + " ESTÁ EM RECUPERAÇÃO POR " + media);
		} else {
			JOptionPane.showMessageDialog(null, nome + " ESTÁ REPROVADO POR " + media);
		}

	}
}
