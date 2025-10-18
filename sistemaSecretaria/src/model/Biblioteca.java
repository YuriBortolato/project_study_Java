package model;

public class Biblioteca {
	private String livroNome;
	private String volume;
	private String autor;
	
	
	public Biblioteca(String livroNome, String volume, String autor) {
		this.livroNome = livroNome;
		this.volume = volume;
		this.autor = autor;
	}

	public String getLivroNome() {
		return livroNome;
	}


	public void setLivroNome(String livroNome) {
		this.livroNome = livroNome;
	}


	public String getVolume() {
		return volume;
	}


	public void setVolume(String volume) {
		this.volume = volume;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
}
