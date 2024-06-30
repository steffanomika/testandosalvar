package sequencial;

import javax.swing.JOptionPane;

public class Exercicio04 {

	public static void main(String[] args) {

		String numeroFuncionario, horasTrabalho, valorHora;
		int numeroFuncionarioI, horasTrabalhoI;
		double salario, valorHorad;

		numeroFuncionario = JOptionPane.showInputDialog("Número do funcionário");
		horasTrabalho = JOptionPane.showInputDialog("Horas trabalhadas");
		valorHora = JOptionPane.showInputDialog("Quanto recebe por hora");

		numeroFuncionarioI = Integer.parseInt(numeroFuncionario);
		horasTrabalhoI = Integer.parseInt(horasTrabalho);
		valorHorad = Double.parseDouble(valorHora);

		salario = valorHorad * horasTrabalhoI;

		JOptionPane.showMessageDialog(null, "Salário: " + salario);

	}

}
