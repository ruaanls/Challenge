package br.com.fiap.challenge;

import java.util.ArrayList;
import java.util.List;

public class Cliente 
{

	private List<String> nome = new ArrayList<String>();
	private List<Veiculo> veiculos = new ArrayList<Veiculo>();
	private Endereco endereco;
	private List<String> cpf = new ArrayList<String>();
	private List<String> senha = new ArrayList<String>();
	private int acessoArray;
	
	
	
	public Cliente()
	{
		this.cpf.add("123.456");
		this.cpf.add("123.789");
		this.senha.add("senha123");
		this.senha.add("Java é top");
		this.nome.add("Ruan");
		this.nome.add("Joãozinho");
	}
	
	
	
	
	




	public boolean Login(String cpf, String senha) {
	    boolean senhaVerificada = false;
	    boolean loginVerificado = false;
	    int cont = 0;

	    for (String cpfEncontrado : this.cpf) {
	        if (cpfEncontrado.equals(cpf)) {
	            loginVerificado = true;
	            this.acessoArray = cont;
	        }
	        
	        cont+=1;
	        
	    }

	    for (String senhaEncontrada : this.senha) {
	        if (senhaEncontrada.equals(senha)) {
	            senhaVerificada = true;
	        }
	    }

	    if ((loginVerificado == true) && (senhaVerificada == true)) 
	    {
	        return true;
	    } 
	    else 
	    {
	        return false;
	    }
	}
	
	
	public void Cadastro(String nome, String cpf, String senha) {
		this.cpf.add(cpf);
		this.senha.add(senha);
		this.nome.add(nome);
	}

	
	


	public String getNome() 
	{
		return nome.get(acessoArray);
	}


	public void setNome(List<String> nome) {
		this.nome = nome;
	}


	public List<String> getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		
		this.senha.add(senha);
	}


	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<String> getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf.add(cpf);
	}

	public List<Veiculo> getVeiculos() {
		return veiculos;
	}


	public void setVeiculos(Veiculo veiculos) {
		this.veiculos.add(veiculos);
	}




	

	
}