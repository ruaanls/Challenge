package br.com.fiap.challenge;

public class Veiculo 
{
	private String placa;
	private String marca;
	private String modelo;
	private int ano;
	private String renavam;
	
	private String nomeCarro;
	public Veiculo(String nomeCarro, String placa, String marca, String modelo, int ano, String renavam) {
		super();
		this.placa = placa;
		this.marca = marca;
		this.ano = ano;
		this.renavam = renavam;
		this.modelo = modelo;
		this.setNomeCarro(nomeCarro);
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getRenavam() {
		return renavam;
	}
	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getNomeCarro() {
		return nomeCarro;
	}
	public void setNomeCarro(String nomeCarro) {
		this.nomeCarro = nomeCarro;
	}
	@Override
	public String toString() {
		return "Veiculo:  "+ nomeCarro + " Placa: " + placa + " Marca: " + marca + " Modelo: " + modelo + " Ano: " + ano + " Renavam " + renavam + "\n";
		
	}
	
	
	
	
	
}
