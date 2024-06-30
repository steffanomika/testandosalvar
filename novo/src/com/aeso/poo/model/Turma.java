package com.aeso.poo.model;

public class Turma {
	private Long id;
	private Disciplina disciplina;
	private Professor professor;
	private Integer capacidadeDaTurma;

	public Turma(Long id, Disciplina disciplina, Professor professor, Integer capacidadeDaTurma) {
		this.setId(id);
		this.setDisciplina(disciplina);
		this.setProfessor(professor);
		this.setCapacidadeDaTurma(capacidadeDaTurma);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Integer getCapacidadeDaTurma() {
		return capacidadeDaTurma;
	}

	public void setCapacidadeDaTurma(Integer capacidadeDaTurma) {
		this.capacidadeDaTurma = capacidadeDaTurma;
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
		Turma other = (Turma) obj;
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
		builder.append("Id: " + id + "\n");
		builder.append("Disciplina: " + disciplina);
		builder.append("Professor: " + professor);
		builder.append("Capacidade da turma: " + capacidadeDaTurma + "\n");

		return builder.toString();
	}
}
