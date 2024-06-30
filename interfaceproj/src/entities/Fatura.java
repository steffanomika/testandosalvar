package entities;

public class Fatura {

	private Double BasicPayment;
	private Double Tax;

	public Fatura(Double basicPayment, Double tax) {
		BasicPayment = basicPayment;
		Tax = tax;
	}
	public Double getBasicPayment() {
		return BasicPayment;
	}
	public void setBasicPayment(Double basicPayment) {
		BasicPayment = basicPayment;
	}
	public Double getTax() {
		return Tax;
	}
	public void setTax(Double tax) {
		Tax = tax;
	}
	
	public Double getTotalPayment() {
		return getBasicPayment() + getTax();
	}
	
	
}
