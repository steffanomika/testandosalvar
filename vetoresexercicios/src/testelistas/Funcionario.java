package testelistas;

public class Funcionario {

	private Integer id;
	private String nome;
	private Double salario;

	public Funcionario(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void aumentaSalario(double porcentagem) {
		this.salario += salario * porcentagem / 100;
	}

	public Double getSalario() {
		return salario;
	}

	@Override
	public String toString() {
		return id + ", " + nome + ", " + String.format("%.2f", salario);
	}

}
