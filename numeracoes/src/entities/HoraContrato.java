package entities;

import java.time.LocalDate;

public class HoraContrato {

	private LocalDate date;
	private Double valorHora;
	private Integer hora;

	public HoraContrato() {

	}

	public HoraContrato(LocalDate date, Double valorHora, Integer hora) {
		this.date = date;
		this.valorHora = valorHora;
		this.hora = hora;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getValorHora() {
		return valorHora;
	}

	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}

	public Integer getHora() {
		return hora;
	}

	public void setHora(Integer hora) {
		this.hora = hora;
	}

}
