package model;


public class Nota {
	private Aluno aluno;
	private Curso curso;
	private double valor;
	public Nota(Aluno aluno, Curso curso, double valor) {
		this.aluno = aluno;
		this.curso = curso;
		this.valor = valor;
	}
	
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	

}
