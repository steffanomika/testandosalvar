package com.aeso.poo.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.aeso.poo.model.Aluno;
import com.aeso.poo.model.Disciplina;
import com.aeso.poo.model.Professor;
import com.aeso.poo.model.Turma;

public class BaseDeDados {
	private static List<Professor> professores = new ArrayList<Professor>();
	private static List<Aluno> alunos = new ArrayList<Aluno>();
	private static List<Turma> turmas = new ArrayList<Turma>();
	private static List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	private static boolean isPopular = true;

	private BaseDeDados() {
	}

	static {
		if (isPopular) {
			isPopular = false;
			popularProfessor();
			popularAlunos();
			popularDisciplinas();
			popularTurmas();
		}
	}

	public static List<Professor> getProfessores() {
		return professores;
	}

	public static List<Aluno> getAlunos() {
		return alunos;
	}

	public static List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public static List<Turma> getTurmas() {
		return turmas;
	}

	private static void popularProfessor() {
		Professor professor1 = new Professor(1L, "Bill gates", UtilData.inserirData("05/05/1950"), "Chefe", "bill",
				"123");
		Professor professor2 = new Professor(2L, "Mark zuckberg", UtilData.inserirData("06/07/1990"), "Chefe", "mark",
				"123");
		Professor professor3 = new Professor(3L, "Agostinho carrara", UtilData.inserirData("07/03/1930"),
				"Administrador", "carrara", "taxicarrara123");
		Professor professor4 = new Professor(4L, "Julio Almeidia", UtilData.inserirData("11/08/1993"), "Chefe", "chefe",
				"123");

		professores.addAll(Arrays.asList(professor1, professor2, professor3, professor4));
	}

	private static void popularAlunos() {
		Aluno aluno1 = new Aluno(1L, "Jo�o Andrade", UtilData.inserirData("24/03/2001"), 3, "john", "123");
		Aluno aluno2 = new Aluno(2L, "Steffano Mikael", UtilData.inserirData("07/01/2000"), 3, "mikael", "123");

		alunos.addAll(Arrays.asList(aluno1, aluno2));
	}

	private static void popularDisciplinas() {
		Disciplina disciplina1 = new Disciplina(1l, "Modelagem e programa��o orientada a objetos", "2 horario");
		Disciplina disciplina2 = new Disciplina(2l, "Desenvolvimento de software II", "2 horario");
		Disciplina disciplina3 = new Disciplina(3l, "Projeto de banco de dados", "2 horario");
		Disciplina disciplina4 = new Disciplina(4l, "Algoritmos", "2 horario");

		disciplinas.addAll(Arrays.asList(disciplina1, disciplina2, disciplina3, disciplina4));

	}

	private static void popularTurmas() {
		if (disciplinas.isEmpty()) {
			throw new IllegalArgumentException(
					"Cadastre primeiro as disciplinas na base de dados para poder cadastrar uma turma!");
		}

		if (professores.isEmpty()) {
			throw new IllegalArgumentException(
					"Cadastre primeiro os professores na base de dados para poder cadastrar uma turma!");

		}

		Turma turma1 = new Turma(1L, disciplinas.get(0), professores.get(1), 20);
		Turma turma2 = new Turma(2L, disciplinas.get(1), professores.get(2), 35);
		Turma turma3 = new Turma(3L, disciplinas.get(1), professores.get(3), 41);
		Turma turma4 = new Turma(4L, disciplinas.get(3), professores.get(2), 15);

		turmas.addAll(Arrays.asList(turma1, turma2, turma3, turma4));
	}

}
