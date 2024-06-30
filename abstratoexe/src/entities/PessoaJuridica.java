package entities;

public class PessoaJuridica extends Pessoa {

	private Integer numFuncionario;

	public PessoaJuridica(String nome, Double rendaAnual, Integer numFuncionario) {
		super(nome, rendaAnual);
		this.numFuncionario = numFuncionario;
	}

	public Integer getNumFuncionario() {
		return numFuncionario;
	}

	public void setNumFuncionario(Integer numFuncionario) {
		this.numFuncionario = numFuncionario;
	}

	@Override
	public double imposto() {
		double result = 0.0;
		if (numFuncionario > 10) {
			result = getRendaAnual() * 0.14;
		} else {
			result = getRendaAnual() * 0.16;
		}

		return result;
	}

}
