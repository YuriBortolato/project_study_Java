package view;

import java.util.Scanner;

import controller.AlunoController;
import model.Aluno;

public class menuView {
	private AlunoController alunoController = new AlunoController();
	private Scanner scanner = new Scanner(System.in);
	
	public void menuExibir() {
		int opcao;
		do {
		System.out.println("1 - Adicionar Aluno");
		System.out.println("2 - Listar Aluno");
		System.out.println("0 - Sair");
		opcao = scanner.nextInt();
		scanner.nextLine();
		
		switch (opcao) {
		case 1: 
			System.out.println("Nome: ");
			String nome = scanner.nextLine();
			System.out.println("CPF: ");
			String cpf = scanner.nextLine();
			System.out.println("Email: ");
			String email = scanner.nextLine();
			System.out.println("Matricula: ");
			String matricula = scanner.nextLine();
            alunoController.adicionarAluno(new Aluno(nome, cpf, email, matricula));
            break;
            
		case 2:
			for (Aluno a : alunoController.listarAlunos()) {
				System.out.println("Aluno: " + a.getNome());
			}
			break;
		}
	}while (opcao != 0);
}
}
