package entities;

public class PessoaFisica extends Pessoa {

	private Double gastosSaude;

	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double imposto() {
		double result = 0.0;
		if (gastosSaude != null) {
			result = (getRendaAnual() * 0.25) - (gastosSaude * 0.5);
		} else if (getRendaAnual() < 20000.00) {
			result = getRendaAnual() * 0.15;
		} else {
			result = getRendaAnual() * 0.25;
		}

		return result;
	}

}
