package entities;

import java.time.LocalDateTime;

public class CarroAluguel {

	private LocalDateTime começo;
	private LocalDateTime fim;

	private Veiculo veiculo;
	private Fatura fatura;

	// Sem fatura no construtor pois a fatura será criada depois, não agora
	public CarroAluguel(LocalDateTime começo, LocalDateTime fim, Veiculo veiculo) {
		this.começo = começo;
		this.fim = fim;
		this.veiculo = veiculo;
	}

	public LocalDateTime getComeço() {
		return começo;
	}

	public void setComeço(LocalDateTime começo) {
		this.começo = começo;
	}

	public LocalDateTime getFim() {
		return fim;
	}

	public void setFim(LocalDateTime fim) {
		this.fim = fim;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Fatura getFatura() {
		return fatura;
	}

	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}

}
