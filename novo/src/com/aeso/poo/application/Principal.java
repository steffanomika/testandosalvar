package com.aeso.poo.application;

import java.util.List;
import java.util.Scanner;

import com.aeso.poo.gui.TelaAluno;
import com.aeso.poo.util.BaseDeDados;

public class Principal {
	public static void main(String[] args) {
		// Grupo: João Andrade, Stéffano Mikael, Diego Massanori.

		Scanner teclado = new Scanner(System.in);
		TelaAluno telaAluno = new TelaAluno();
		int escolha = 0;

		do {
			try {
				System.out.println("1 - Imprimir professores");
				System.out.println("2 - Imprimir Alunos");
				System.out.println("3 - Imprimir Disciplinas");
				System.out.println("4 - Imprimir Turmas");
				System.out.println("5 - Cadastrar aluno");
				System.out.println("9 - Sair do sistema");
				System.out.print("Escolha: ");
				escolha = teclado.nextInt();

				if (escolha == 1) {
					imprimir(BaseDeDados.getProfessores());

				} else if (escolha == 2) {
					imprimir(BaseDeDados.getAlunos());

				} else if (escolha == 3) {
					imprimir(BaseDeDados.getDisciplinas());

				} else if (escolha == 4) {
					imprimir(BaseDeDados.getTurmas());

				} else if (escolha == 5) {
					telaAluno.cadastarAluno(teclado);
				}

			} catch (Exception e) {
				System.out.println("Ocorreu um erro inesperado no sistema!");
				teclado = new Scanner(System.in);
			}
			System.out.println();
		} while (escolha != 9);

		System.out.println("---------------------------------");
		System.out.println("Obrigado por usar o nosso sistema! Volte sempre.");

		teclado.close();
	}

	private static <E> void imprimir(List<E> lista) {
		for (E e : lista) {
			System.out.println(e);
		}
	}

}
