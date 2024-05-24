package br.com.fiap.challenge;

import java.util.ArrayList;
import java.util.List;

public class Defeitos 
{
	private List<Defeitos> defeitos = new ArrayList<Defeitos>();
	private String nome;
	private String area;

	
	public Defeitos(String nome, String area) {
		super();
		this.nome = nome;
		this.area = area;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public List<Defeitos> getDefeitos() {
		return defeitos;
	}

	public void setDefeitos(Defeitos defeitos) {
		this.defeitos.add(defeitos);
	}
	
	
	

}
