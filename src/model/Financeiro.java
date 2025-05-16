package model;

public class Financeiro extends Pessoa {
	private double salario;

	public Financeiro(String nome, String cpf, String email, double salario) {
		super(nome, cpf, email);
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}
