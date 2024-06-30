package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.ItemPedido;
import entities.Pedido;
import entities.Produto;
import entities.enums.PedidoStatus;

public class Application {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");


		System.out.println("ENTRE COM OS DADOS DO CLIENTE");
		System.out.print("Nome: ");
		String nome = scan.nextLine();
		System.out.print("Email: ");
		String email = scan.next();
		System.out.print("Data nascimento (DD/MM/YYYY): ");
		LocalDate dataNascimento = LocalDate.parse(scan.next(), fmt2);

		Cliente cliente = new Cliente(nome, email, dataNascimento);

		System.out.println();
		System.out.println("ENTRE COM OS DADOS DO PEDIDO");
		System.out.print("Status: ");
		PedidoStatus status = PedidoStatus.valueOf(scan.next());

		Pedido pedido = new Pedido(LocalDateTime.now(), status, cliente);

		System.out.print("Quantos items terá o pedido? ");
		int n = scan.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do #" + i + " item");
			System.out.print("Nome do produto: ");
			String nomeProduto = scan.next();
			System.out.print("Preço do produto: ");
			double precoProduto = scan.nextDouble();

			Produto produto = new Produto(nomeProduto, precoProduto);

			System.out.print("Quantidade: ");
			int quantidade = scan.nextInt();

			ItemPedido item = new ItemPedido(quantidade, precoProduto, produto);
			pedido.addItem(item);
		}

		System.out.println();
		System.out.println("DADOS FINAIS");
		System.out.println(pedido);

	}

}
