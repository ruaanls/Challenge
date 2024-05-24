package br.com.fiap.challenge;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Agendamentos 
{
	private String horario;
	private Veiculo veiculo;
	private List<CentrosAutomotivos> centrosAutomotivos = new ArrayList<CentrosAutomotivos>();
	
	
	public Agendamentos()
	{
		
	}

	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public List<CentrosAutomotivos> getCentrosAutomotivos() {
		return centrosAutomotivos;
	}

	public void setCentrosAutomotivos(CentrosAutomotivos centrosAutomotivos) {
		this.centrosAutomotivos.add(centrosAutomotivos);
	}
	
	public String Agendado(LocalTime horario, Veiculo veiculo, CentrosAutomotivos centroAutomotivo )
	{
		Random rand = new Random();
		int protocolo = rand.nextInt((90000) + 10000);
		return "Agendamento de conserto para o Veículo: "+veiculo.getMarca()+" - "+ veiculo.getModelo()+" Protocolo N- "+ protocolo + 
				"\nLocal: " + centroAutomotivo + "\nHorário: " + horario;
		
	}
	
}
