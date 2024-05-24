package br.com.fiap.challenge;

import java.util.List;

public class CentrosAutomotivos 
{
	private String nome;
	private Endereco endereco;
	public CentrosAutomotivos(String nome, Endereco endereco) {
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
		return nome + "\nEndereço: "+ endereco+"\n";
	}
	
	
	
}
