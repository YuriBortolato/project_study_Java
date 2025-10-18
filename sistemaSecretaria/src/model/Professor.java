package model;

public class Professor extends Pessoa {
	private String disciplina;

	public Professor(String nome, String cpf, String email, String disciplina) {
		super(nome, cpf, email);
		this.disciplina = disciplina;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
}
