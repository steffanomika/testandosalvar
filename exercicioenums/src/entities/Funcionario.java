package entities;

import java.util.ArrayList;
import java.util.List;

import entities.enums.FuncionarioLevel;

public class Funcionario {

	private String nome;
	private FuncionarioLevel level;
	private Double salarioBase;
	private Departamento departamento;

	// um funcionario tem varios contratos, entao faz LISTA DE CONTRATOS (diagrama)
	// um tem varios
	private List<HoraContrato> contratos = new ArrayList<>();

	public Funcionario() {
	}

	// lista nao passa no construtor, ela inicia VAZIA
	public Funcionario(String nome, FuncionarioLevel level, Double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.level = level;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public FuncionarioLevel getLevel() {
		return level;
	}

	public void setLevel(FuncionarioLevel level) {
		this.level = level;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<HoraContrato> getContratos() {
		return contratos;
	}

	// vai pegar a LISTA de contratos e ADICIONAR o contrato que veio no ARGUMENTO
	public void addContratos(HoraContrato contrato) {
		contratos.add(contrato);
	}

	// LISTA DE CONTRATOS
	// adicionar e remove por METODOS entao nao precisa do SET
	public void removeContrato(HoraContrato contrato) {
		contratos.remove(contrato);
	}

	// renda dp funcionario baseada no ano e no mes (quanto ganhou)
	// calculo: SALARIO BASE + O TANTO QUE GANHOU NOS CONTRATOS DAQUELE MÊS (lista)

	public double renda(int ano, int mes) {
		double soma = salarioBase;
		// para cada contrato C na lista de contratos
		for (HoraContrato c : contratos) {
			int c_ano = c.getDate().getYear();
			int c_mes = c.getDate().getMonthValue();
			if (c_ano == ano && c_mes == mes) {
				soma += c.valorTotal();
			}
		}
		return soma;
	}
}
