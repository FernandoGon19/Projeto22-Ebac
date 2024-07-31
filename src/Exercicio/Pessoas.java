package Exercicio;

import java.util.List;

public class Pessoas {

	String nome;
	String sexo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public Pessoas(String nome, String sexo) {
		super();
		this.nome = nome;
		this.sexo = sexo;
	}
	@Override
	public String toString() {
		return "Pessoas [nome=" + nome + ", sexo=" + sexo + "]";
	}
	
	
	
	
	
	
}
