package exercicioConstrutor;

public class Conta {

	private int contaNumero;
	private String nomeTitular;
	private double saldoConta;

	public Conta(int contaNumero, String nomeTitular, double depositoInicial) {
		this.contaNumero = contaNumero;
		this.nomeTitular = nomeTitular;
		depositoConta(depositoInicial);
	}

	public Conta(int contaNumero, String nomeTitular) {
		this.contaNumero = contaNumero;
		this.nomeTitular = nomeTitular;
	}

	public int getContaNumero() {
		return contaNumero;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldoConta() {
		return saldoConta;
	}

	public void depositoConta(double deposito) {
		this.saldoConta += deposito;
	}

	public void saqueConta(double saque) {
		this.saldoConta -= saque + 5.0;
	}

	public String toString() {
		return "Conta: " + contaNumero + ", Titular: " + nomeTitular + " Saldo: $ " + String.format("%.2f", saldoConta);
	}
}
