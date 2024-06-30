package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enums.PedidoStatus;

public class Pedido {

	private static DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

	private LocalDateTime momento;
	private PedidoStatus status;
	private Cliente cliente;

	private List<ItemPedido> itens = new ArrayList<ItemPedido>();

	public Pedido() {

	}

	public Pedido(LocalDateTime momento, PedidoStatus status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}

	public LocalDateTime getMomento() {
		return momento;
	}

	public void setMomento(LocalDateTime momento) {
		this.momento = momento;
	}

	public PedidoStatus getStatus() {
		return status;
	}

	public void setStatus(PedidoStatus status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemPedido> getItens() {
		return itens;
	}

	public void addItem(ItemPedido item) {
		itens.add(item);
	}

	public void removeItem(ItemPedido item) {
		itens.remove(item);
	}

	public double totalPrice() {
		double total = 0.0;
		for (ItemPedido item : itens) {
			total += item.subtotal();
		}
		return total;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Horario do pedido: ");
		sb.append(fmt3.format(momento) + "\n");
		sb.append("Status do pedido: ");
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(cliente.getNome() + " ");
		sb.append("(" + cliente.getDataNascimento() + ") - ");
		sb.append(cliente.getEmail() + "\n");
		sb.append("Itens do pedido: \n");
		for (ItemPedido item : itens) {
			sb.append(item.getProduto().getNome() + ", ");
			sb.append("$" + String.format("%.2f", item.getPreco()) + ", ");
			sb.append("Quantiade: " + item.getQuantidade() + ", ");
			sb.append("subTotal: $" + String.format("%.2f", item.subtotal()) + "\n");
		}

		sb.append("Total price: $" + String.format("%.2f", totalPrice()));
		return sb.toString();
	}

}
