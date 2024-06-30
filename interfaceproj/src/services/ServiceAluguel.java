package services;

import java.time.Duration;

import entities.CarroAluguel;
import entities.Fatura;

public class ServiceAluguel {

	private Double precoHora;
	private Double precoDia;

	private TaxService taxService;

	public ServiceAluguel(Double precoHora, Double precoDia, TaxService taxService) {
		this.precoHora = precoHora;
		this.precoDia = precoDia;
		this.taxService = taxService;
	}

	// gerando fatura dentro do CarroAluguel
	// DURAÇÃO - arredonda pra cima 4:10 = 5 Horas.
	// Até 12h, calculo por hora, passou disso o calculo é por dia
	public void processaFatura(CarroAluguel carroAluguel) {

		// converte para minutos para e depois divide por 60 para pegar FRAÇÃO DE HORA
		double minutos = Duration.between(carroAluguel.getComeço(), carroAluguel.getFim()).toMinutes();
		double horas = minutos / 60.0;

		// calculando a fatura em termos de horas se for menor que 12 (else em termos de
		// dia)
		double pagamentoBasico;
		if (horas <= 12.0) {
			pagamentoBasico = precoHora * Math.ceil(horas); // arredondando para cima
		} else {
			pagamentoBasico = precoDia * Math.ceil(horas / 24.0); // pegando a duração de horas em dias /24
		}

		// CALCULANDO IMPOSTO
		double imposto = taxService.tax(pagamentoBasico);

		carroAluguel.setFatura(new Fatura(pagamentoBasico, imposto));
	}
}
