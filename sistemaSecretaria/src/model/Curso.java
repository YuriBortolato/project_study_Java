package model;

public class Curso {
	private String nome;
	private int cargaHora;
	public Curso(String nome, int cargaHora) {
		this.nome = nome;
		this.cargaHora = cargaHora;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCargaHora() {
		return cargaHora;
	}
	public void setCargaHora(int cargaHora) {
		this.cargaHora = cargaHora;
	}
	
}
