package com.aeso.poo.model;

import java.util.Date;

import com.aeso.poo.util.UtilData;

public abstract class Pessoa {
	private Long id;
	private String nome;
	private Date dataDeNascimento;

	public Pessoa(Long id, String nome, Date dataDeNascimento) {
		this.setId(id);
		this.setNome(nome);
		this.setDataDeNascimento(dataDeNascimento);
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

	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
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
		Pessoa other = (Pessoa) obj;
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
		builder.append("Id: " + this.id + "\n");
		builder.append("Nome: " + this.nome + "\n");
		builder.append("Data de nascimento: " + UtilData.formatarData(dataDeNascimento) + "\n");

		return builder.toString();
	}

}
