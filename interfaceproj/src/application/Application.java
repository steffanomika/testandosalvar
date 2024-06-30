package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.CarroAluguel;
import entities.Veiculo;
import services.BrazilTaxService;
import services.ServiceAluguel;

public class Application {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		System.out.println("---- DADOS DO ALUGUEL ----");
		System.out.print("Modelo do carro: ");
		String modeloCarro = scan.nextLine();
		System.out.print("Retirada (dd/mm/yyyy hh:mm) C");
		LocalDateTime começo = LocalDateTime.parse(scan.nextLine(), fmt);
		System.out.print("Retorno: (dd/mm/yyyy hh:mm) ");
		LocalDateTime fim = LocalDateTime.parse(scan.nextLine(), fmt);

		// instanciando o objeto aluguel do carro para depois calcular e lançar a fatura
		CarroAluguel carroAluguel = new CarroAluguel(começo, fim, new Veiculo(modeloCarro));

		System.out.print("Entre com o preço por hora: ");
		double precoHora = scan.nextDouble();
		System.out.print("Entre com o preço por dia: ");
		double precoDia = scan.nextDouble();

		ServiceAluguel serviceAluguel = new ServiceAluguel(precoHora, precoDia, new BrazilTaxService());

		serviceAluguel.processaFatura(carroAluguel);

		System.out.println("FATURA:");
		System.out.println("Pagamento básico: " + String.format("%.2f", carroAluguel.getFatura().getBasicPayment()));
		System.out.println("Imposto: " + String.format("%.2f", carroAluguel.getFatura().getTax()));
		System.out.println("Pagamento total: " + String.format("%.2f", carroAluguel.getFatura().getTotalPayment()));

		scan.close();

	}

}
