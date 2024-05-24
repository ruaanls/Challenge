package br.com.fiap.challenge;

import java.util.ArrayList;
import java.util.List;

public class ChamadoSinistro 
{
	private int protocoloChamado;
	private String logradouro;
	private int numero;
	private String cidade;
	private String estadoSinistro;
	
	public ChamadoSinistro(int protocoloChamado, String logradouro, int numero, String cidade, String estadoSinisto) {
		super();
		this.protocoloChamado = protocoloChamado;
		this.logradouro = logradouro;
		this.numero = numero;
		this.cidade = cidade;

	}

	public int getProtocoloChamado() {
		return protocoloChamado;
	}

	public void setProtocoloChamado(int protocoloChamado) {
		this.protocoloChamado = protocoloChamado;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstadoSinistro() {
		return estadoSinistro;
	}

	public void setEstadoSinistro(String estadoSinistro) {
		this.estadoSinistro = estadoSinistro;
	}

	

	
	
	
	
	
}
