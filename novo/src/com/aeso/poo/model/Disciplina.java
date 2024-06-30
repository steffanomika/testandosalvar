package com.aeso.poo.model;

public class Disciplina {
	private Long id;
	private String nome;
	private String ementa;

	public Disciplina(Long id, String nome, String ementa) {
		this.setId(id);
		this.setNome(nome);
		this.setEmenta(ementa);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmenta() {
		return ementa;
	}

	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DADOS DA DISCIPLINA:\n");
		builder.append("Id: " + this.id + "\n");
		builder.append("Nome: " + this.nome + "\n");
		builder.append("Ementa: " + this.ementa + "\n");

		return builder.toString();
	}
}
