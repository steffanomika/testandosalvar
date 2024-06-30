package com.aeso.poo.model;

public class RendimentoEscolar {
	private Turma turma;
	private Aluno aluno;
	private Semestre semestre;
	private Trabalho trabalho;
	private Projeto projeto;

	public RendimentoEscolar(Turma turma, Aluno aluno, Semestre semestre, Trabalho trabalho, Projeto projeto) {
		this.turma = turma;
		this.aluno = aluno;
		this.semestre = semestre;
		this.trabalho = trabalho;
		this.projeto = projeto;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Semestre getSemestre() {
		return semestre;
	}

	public void setSemestre(Semestre semestre) {
		this.semestre = semestre;
	}

	public Trabalho getTrabalho() {
		return trabalho;
	}

	public void setTrabalho(Trabalho trabalho) {
		this.trabalho = trabalho;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

}
