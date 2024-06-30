package praticandoMetodos;

public class Funcionario2 {

	String nome;
	double salarioBruto;
	double imposto;

	public double salarioLiquido() {
		return salarioBruto - imposto;
	}

	public void aumentaSalario(double aumento) {
		salarioBruto += salarioBruto * aumento / 100.0;
	}

	public String toString() {
		return nome + ", $ " + String.format("%.2f", salarioLiquido());
	}
}
