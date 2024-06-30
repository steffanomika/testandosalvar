package com.aeso.poo.model;

import java.util.Date;

public class Aluno extends Pessoa {
	private Integer periodo;
	private String nomeDeUsuario;
	private String senha;

	public Aluno(Long id, String nome, Date dataDeNascimento, Integer periodo, String nomeDeUsuario, String senha) {
		super(id, nome, dataDeNascimento);
		this.setPeriodo(periodo);
		this.setNomeDeUsuario(nomeDeUsuario);
		this.setSenha(senha);
	}

	public Integer getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Integer periodo) {
		this.periodo = periodo;
	}

	public String getNomeDeUsuario() {
		return nomeDeUsuario;
	}

	public void setNomeDeUsuario(String nomeDeUsuario) {
		this.nomeDeUsuario = nomeDeUsuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DADOS DO ALUNO:\n");
		builder.append(super.toString());
		builder.append("Periodo: " + this.periodo + "\n");
		builder.append("Nome de usuario: " + this.nomeDeUsuario + "\n");
		builder.append("Senha: " + this.senha + "\n");

		return builder.toString();
	}
}
