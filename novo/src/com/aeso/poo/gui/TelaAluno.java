package com.aeso.poo.gui;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.aeso.poo.model.Aluno;
import com.aeso.poo.util.BaseDeDados;
import com.aeso.poo.util.UtilData;

public class TelaAluno {

	public void cadastarAluno(Scanner teclado) {
		System.out.print("Id: ");
		Long id = teclado.nextLong();

		while (hasId(id, BaseDeDados.getAlunos())) {
			System.out.print("ID existente, digite novamente: ");
			id = teclado.nextLong();
		}

		System.out.print("Nome: ");
		teclado.nextLine();
		String nome = teclado.nextLine();
		System.out.print("Data de nascimento(dd/MM/yyyy): ");
		Date dataNascimento = UtilData.inserirData(teclado.next());
		System.out.print("Periodo: ");
		Integer periodo = teclado.nextInt();
		System.out.print("Nome de usuario: ");
		teclado.nextLine();
		String nomeUsuario = teclado.nextLine();
		System.out.print("Senha: ");
		String senha = teclado.nextLine();

		Aluno aluno = new Aluno(id, nome, dataNascimento, periodo, nomeUsuario, senha);
		BaseDeDados.getAlunos().add(aluno);
		System.out.println("O aluno " + aluno.getNome() + " foi cadastrado no sistema com sucesso!");
	}

	public boolean hasId(Long id, List<Aluno> lista) {
		Aluno aluno = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		return aluno != null;
	}
}
