package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsadoProduct extends Produto {

	private LocalDate dataFabric;

	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public UsadoProduct(String nome, Double preco, LocalDate dataFabric) {
		super(nome, preco);
		this.dataFabric = dataFabric;
	}

	public LocalDate getDataFabric() {
		return dataFabric;
	}

	public void setDataFabric(LocalDate dataFabric) {
		this.dataFabric = dataFabric;
	}

	// priceTag

	@Override
	public String priceTag() {
		return getNome() + " (usado)" + " $" + String.format("%.2f", getPreco()) + " (data de fabricação "
				+ fmt.format(dataFabric) + ")";
	}

}
