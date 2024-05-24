package br.com.fiap.challenge;

public class OficinasReferenciadas 
{
	private String nome;
	private Endereco endereco;
	
	public OficinasReferenciadas(String nome, Endereco endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Oficina Referenciada: "+ nome + "\nEndereço: "+ endereco;
	}
	
	
}
