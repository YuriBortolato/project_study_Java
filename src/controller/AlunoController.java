package controller;

import model.Aluno;
import java.util.ArrayList;

public class AlunoController {
	private ArrayList<Aluno> alunos = new ArrayList<>();

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public ArrayList<Aluno> listarAlunos() {
        return alunos;
    }
}
