package com.aeso.poo.model;

public class Trabalho {
	private String[] trabalhos = new String[3];
	private Float[] notasDoTrabalhos = new Float[3];

	public Trabalho() {
	}

	public String[] getTrabalhos() {
		return trabalhos;
	}

	public void setTrabalhos(String[] trabalhos) {
		this.trabalhos = trabalhos;
	}

	public Float[] getNotasDoTrabalhos() {
		return notasDoTrabalhos;
	}

	public void setNotasDoTrabalhos(Float[] notasDoTrabalhos) {
		this.notasDoTrabalhos = notasDoTrabalhos;
	}

}
