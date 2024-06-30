package entities;

public class ImportProduct extends Produto  {

	private Double importTaxa;

	public ImportProduct(String nome, Double preco, Double importTaxa) {
		super(nome, preco);
		this.importTaxa = importTaxa;
	}

	public Double getImportTaxa() {
		return importTaxa;
	}

	public void setImportTaxa(Double importTaxa) {
		this.importTaxa = importTaxa;
	}
	
	//priceTag
	//totalPrice
	
	public Double totalPrice() {
		return getPreco() + importTaxa;
	}
	
	@Override
	public String priceTag() {
		return getNome() + " $" + String.format("%.2f", totalPrice()) + " (Taxa: $" + importTaxa + ")";
	}
}
