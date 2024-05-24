package br.com.fiap.challenge;

import java.util.ArrayList;
import java.util.List;

public class Sinistro 
{
	private String tipoSinistro; 

	private ChamadoSinistro chamadoSinistro;
	private Veiculo veiculo;
	private Cliente cliente;
	private List<OficinasReferenciadas> oficnasReferenciadas = new ArrayList<OficinasReferenciadas>();

	
	
	public Sinistro(String tipoSinistro, ChamadoSinistro chamadoSinistro, Veiculo veiculo,
			Cliente cliente) {
		super();
		this.tipoSinistro = tipoSinistro;

		this.chamadoSinistro = chamadoSinistro;
		this.veiculo = veiculo;
		this.cliente = cliente;

		
	}
	
	public Sinistro()
	{
		
	}
	public String getTipoSinistro() {
		return tipoSinistro;
	}
	public void setTipoSinistro(String tipoSinistro) {
		this.tipoSinistro = tipoSinistro;
	}

	public ChamadoSinistro getProtocoloSinistro() {
		return chamadoSinistro;
	}
	public void setProtocoloSinistro(ChamadoSinistro protocoloSinistro) {
		this.chamadoSinistro = protocoloSinistro;
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
	
	
	public List<OficinasReferenciadas> getOficnasReferenciadas() {
		return oficnasReferenciadas;
	}
	public void setOficnasReferenciadas(OficinasReferenciadas oficnasReferenciadas) {
		this.oficnasReferenciadas.add(oficnasReferenciadas);
	}
	
	
	public String sinistroAcionado()
	{
		return "Sinistro do tipo "+ tipoSinistro + " Acionado com suceso\nSolicitante: " + cliente.getNome() +  "\nVeículo: " + veiculo.getMarca() + veiculo.getModelo() + "\nProtocolo: "
				+ chamadoSinistro.getProtocoloChamado();
	}
	
	
	
	
	
}
