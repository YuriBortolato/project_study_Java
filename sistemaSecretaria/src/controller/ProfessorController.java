package controller;

import model.Professor;
import java.util.ArrayList;

public class ProfessorController {
    private ArrayList<Professor> professores = new ArrayList<>();

    public void adicionaProfessor(Professor professor) {
        professores.add(professor);
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }
}