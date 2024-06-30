package com.aeso.poo.model;

public class Projeto {
	private String projeto;
	private Float nota;

	public Projeto(String projeto, Float nota) {
		this.setProjeto(projeto);
		this.setNota(nota);
	}

	public String getProjeto() {
		return projeto;
	}

	public void setProjeto(String projeto) {
		this.projeto = projeto;
	}

	public Float getNota() {
		return nota;
	}

	public void setNota(Float nota) {
		this.nota = nota;
	}

}
