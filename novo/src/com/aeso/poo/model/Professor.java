package com.aeso.poo.model;

import java.util.Date;

public class Professor extends Pessoa {
	private String cargo;
	private String nomeDeUsuario;
	private String senha;

	public Professor(Long id, String nome, Date dataDeNascimento, String cargo, String nomeDeUsuario, String senha) {
		super(id, nome, dataDeNascimento);
		this.setCargo(cargo);
		this.setNomeDeUsuario(nomeDeUsuario);
		this.setSenha(senha);
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
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
		builder.append("DADOS DO PROFESSOR:\n");
		builder.append(super.toString());
		builder.append("Cargo: " + this.cargo + "\n");
		builder.append("Nome de usuario: " + this.nomeDeUsuario + "\n");
		builder.append("Senha: " + this.senha + "\n");

		return builder.toString();
	}

}
