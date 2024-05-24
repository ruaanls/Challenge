package br.com.fiap.challenge;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class Aplicacao 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		Cliente c1 = new Cliente();
		
		Veiculo veiculoTeste = new Veiculo("Carro Teste", "ABC-1234", "Marca X", "Modelo Y", 2024, "1z");
		
		
		Agendamentos agendar = new Agendamentos();
		
       
		Endereco enderecoCentro1 = new Endereco("Rua Quirino dos Santos", 230, "Centro Automotivo", "Barra Funda", "SP", "01141-020");
		CentrosAutomotivos centro = new CentrosAutomotivos("Centro Automotivo Porto - Barra Funda", enderecoCentro1);
		agendar.setCentrosAutomotivos(centro);
		
		Endereco enderecoCentro2 = new Endereco("Rua Pedroso", 394, "Centro Automotivo", "Bela Vista", "SP", "01322-010");
		centro = new CentrosAutomotivos("Centro Automotivo Porto - Bela Vista", enderecoCentro2);
		agendar.setCentrosAutomotivos(centro);
		Endereco enderecoCentro3 = new Endereco("Avenida Firestone", 1609, "Centro Automotivo", "Santo André", "SP", "09015-390");
		centro = new CentrosAutomotivos("Centro Automotivo Porto - Santo André", enderecoCentro3);
		agendar.setCentrosAutomotivos(centro);
		
		
		Sinistro sinistro = new Sinistro();
		Endereco enderecoOficina1 = new Endereco("Avenida João Ramalho", 1443, "Oficina Referenciada", "Mauá","SP","09371-520");
		OficinasReferenciadas oficina = new OficinasReferenciadas("Carfio II", enderecoOficina1);
		sinistro.setOficnasReferenciadas(oficina);
		
		enderecoOficina1 = new Endereco("Avenida Goiás", 2323, "Oficina Referenciada", "São Caetano do Sul", "SP", "09550-050");
		oficina = new OficinasReferenciadas("Goiás Car Serviços Automotivos", enderecoOficina1);
		sinistro.setOficnasReferenciadas(oficina);
		
		enderecoOficina1 = new Endereco("Rua Marabá", 80, "Oficina Referenciada", "São Bernardo do Campo", "SP", "09635-040");
		oficina = new OficinasReferenciadas("DIKAR", enderecoOficina1);
		sinistro.setOficnasReferenciadas(oficina);
		
		
		
		Defeitos defeito = new Defeitos("Vela de Ignição", "Mecânica");
		defeito.setDefeitos(defeito);
		
		defeito = new Defeitos("Caixa de Direção", "Direção");
		defeito.setDefeitos(defeito);
		
		
		
		
		
		System.out.println("Seja Bem-vindo ao sistema do centro automotivo porto :)\n ");
		
		
		
		c1.setVeiculos(veiculoTeste);
		int opcaoLogin = 1;
		while(opcaoLogin == 1 || opcaoLogin == 2)
		{
	
			System.out.println("\tAcesse sua Conta ou Crie uma Nova\n1- Fazer Login\n2-Cadastrar Nova Conta");
			opcaoLogin = input.nextInt();
			switch (opcaoLogin)
			{
				case 1:
					System.out.println("Por favor digite seu CPF: \n");
					String cpf = input.next() + input.nextLine();
					System.out.println("Digite sua senha: \n");
					String senha = input.nextLine();
					boolean respostaLogin = c1.Login(cpf, senha);
					if(respostaLogin == true)
					{
						System.out.printf("Seja bem-vindo de volta %s, estamos te redirecionando ao menu principal\n\n ",c1.getNome());
						opcaoLogin = -1;
						break;
					}
					
					else
					{
						System.out.println("CPF OU SENHA INCORRETOS. Por favor tente novamente ou crie uma nova conta\n ");
						break;
					}
					
				
				case 2:
					System.out.println("Crie sua conta Porto conosco abaixo :) \n\nDigite seu CPF: ");
					String cpfNovo = input.next() + input.nextLine();
					System.out.println("Crie sua senha: ");
					String senhaNova = input.nextLine();
					System.out.println("Para finalizar como você quer ser chamado? ");
					String nomeNovo = input.nextLine();
					c1.Cadastro(nomeNovo, cpfNovo, senhaNova);
					
			}
		
		}
		
		int opcaoMenu = 1;
		while((opcaoMenu == 1) || (opcaoMenu == 2) || (opcaoMenu == 3) || (opcaoMenu == 0))
		{
			System.out.println("\t----MENU----");
			System.out.println("Selecione uma das opções abaixo:\n1 - Cadastrar Veículo\n2 - Agendar Conserto\n3 - Acionar Sinistro\n0 - Sair\n");
		    opcaoMenu = input.nextInt();
		    switch(opcaoMenu)
		    {
		    	case 1:
		    		int quantidadeCarros = 0;
		    		while(quantidadeCarros < 1 || quantidadeCarros > 3)
		    		{
		    			System.out.print("Quantos carros você deseja adicionar?\nAVISO: Pelo fato do sistema ainda estar em fase de testes limitamos o número de veículos cadastrados a 3\n");
			            quantidadeCarros = input.nextInt();
		    		}
		    		

		            for (int i = 0; i < quantidadeCarros; i++) 
		            {
		                System.out.println("Informe as informações do carro " + (i + 1) + ":");

		                System.out.print("Nome do carro: ");
		                String nomeCarro = input.next() + input.nextLine();

		                System.out.print("Placa: ");
		                String placa = input.nextLine();

		                System.out.print("Marca: ");
		                String marca = input.nextLine();

		                System.out.print("Modelo: ");
		                String modelo = input.nextLine();

		                System.out.print("Ano: ");
		                int ano = input.nextInt();

		                System.out.print("Renavam: ");
		                String renavam = input.next() + input.nextLine();

		                Veiculo veiculo = new Veiculo(nomeCarro, placa, marca, modelo, ano, renavam);
		                c1.setVeiculos(veiculo);
		            }
		    		System.out.println("Você deseja voltar ao menu ou sair?\n1 - Voltar ao Menu\n2 - SAIR\n");
		    		int opcaoCadastro = input.nextInt();
		    		
		    		if(opcaoCadastro == 2)
		    		{
		    			opcaoMenu = 0;
		    		}
		    		else
		    		{
		    			break;
		    		}
		    		
		    			
		    	case 2:
		    		System.out.println("Escolha o veículo que irá ao conserto:");
		    		int contador = 1;
		    		for (Veiculo veiculo : c1.getVeiculos()) {
		    		    System.out.println(contador + " - " + veiculo.toString());
		    		    contador++;
		    		}
		    		System.out.print("Escolha sua Opção: ");
		    		int escolhaCarro = input.nextInt();

		    		if (escolhaCarro >= 1 && escolhaCarro <= c1.getVeiculos().size()) 
		    		{
		    		    Veiculo veiculoEscolhido = c1.getVeiculos().get(escolhaCarro - 1);
		    		    System.out.println("Você escolheu o carro: " + veiculoEscolhido.toString());
		    		    System.out.println("\n\n\tAgende seu Conserto\n");
		    		    System.out.print("Informe o horário do conserto (HH:mm): ");
		    	        String hora = input.next();

		    	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
		    	        LocalTime horario = LocalTime.parse(hora, formatter);
		    	        System.out.println("Escolha o Centro Automotivo mais perto de você: ");
		    	        
		    	        contador = 1;
		    	        for(CentrosAutomotivos centrosAutomotivos: agendar.getCentrosAutomotivos())
		    	        {
		    	        	System.out.println(contador +  " - " + centrosAutomotivos.toString());
		    	        	contador+=1;
		    	        }
		    	        
		    	        int escolhaCentro = input.nextInt();
		    	        
		    	        if(escolhaCentro >= 1 && escolhaCentro <= agendar.getCentrosAutomotivos().size())
		    	        {
		    	        	CentrosAutomotivos centroEscolhido = agendar.getCentrosAutomotivos().get(escolhaCentro -1);
		    	        	System.out.println(agendar.Agendado(horario, veiculoEscolhido, centroEscolhido));
		    	        	System.out.println("RETORNANDO AO MENU PRINCIPAL...");
		    	        	break;
		    	        	
		    	        }
		    	        
		    	        else
		    	        {
		    	        	System.out.println("Opção Inválida");
		    	        	break;
		    	        }
		    	        
		    		}
		    		
		    		else 
		    		{
		    		    System.out.println("Opção inválida. Tente novamente.");
		    		    break;
		    		}
		    	
		    	case 3:
		    		System.out.println(c1.getNome()+ " Para acionar o sinistro precisaremos de algumas informações rápidas sobre aonde você está e qual o veículo que sofreu o sinistro\n");
		    		System.out.println("Qual é o veículo que sofreu o sinistro? ");
		    		contador = 1;
		    		for(Veiculo veiculo: c1.getVeiculos())
		    		{
		    			System.out.println(contador + " - " + veiculo);
		    		}
		    		int opcaoVeiculoSinistro = input.nextInt();
		    		
		    		if(opcaoVeiculoSinistro >=1 && opcaoVeiculoSinistro <= c1.getVeiculos().size())
		    		{
		    			Veiculo veiculoEscolhido = c1.getVeiculos().get(opcaoVeiculoSinistro-1);
		    			System.out.println("O veículo escolhido foi: \n"+c1.getVeiculos().get(opcaoVeiculoSinistro-1));
		    			System.out.println("Qual é o tipo do sinistro?\nColisão\nEnchente\nPane Elétrica ");
		    			String tipoSinistro = input.next() + input.nextLine();
		    			System.out.println("Agora precisaremos saber aonde aconteceu o sinistro, para que a equipe possa lhe ajudar\n");
		    			System.out.println("Digite o logradouro do local: ");
		    			String logradouroSinistro = input.nextLine();
		    			System.out.println("Qual o número do incidente? ");
		    			int numeroSinistro =  input.nextInt();
		    			System.out.println("Qual a cidade que ocorreu o acidente? ");
		    			String cidadeSinistro = input.next() + input.nextLine();
		    			System.out.println("Qual foi o estado em que isso aconteceu?");
		    			String estadoSinistro = input.nextLine();
		    			Random rand = new Random();
		    			int protocolo = rand.nextInt((90000) + 10000);
		    			System.out.println("Escolha a Oficina Referenciada mais próxima do ocorrido para aonde seu carro será levado: ");
		    			contador = 1;
		    			for(OficinasReferenciadas oficinas: sinistro.getOficnasReferenciadas())
		    			{
		    				System.out.println(contador + "- "+ oficinas);
		    				contador+=1;
		    			}
		    			
		    			int opcaoOficinaSinistro = input.nextInt();
		    			if(opcaoOficinaSinistro >= 1 && opcaoOficinaSinistro <= sinistro.getOficnasReferenciadas().size())
		    			{
		    				OficinasReferenciadas oficinaEscolhida = sinistro.getOficnasReferenciadas().get(opcaoOficinaSinistro-1);
		    				int indexOficina = opcaoOficinaSinistro - 1;
		    				ChamadoSinistro chamado = new ChamadoSinistro(protocolo, logradouroSinistro, numeroSinistro, cidadeSinistro, estadoSinistro);
			    			sinistro = new Sinistro(tipoSinistro, chamado, veiculoEscolhido, c1);
			    			System.out.println(sinistro.sinistroAcionado());
			    			System.out.println("Seu veículo será direcionado ao seguinte Centro Automotivo\n"+oficinaEscolhida);
			    			System.out.println("RETORNANDO AO MENU PRINCIPAL...");
			    			break;
			    			
			    			
		    			}
		    			
		    			
		    			
		    			
		    		}
		    		
		    		else
		    		{
		    			System.out.println("Opção Inválida");
		    		}
		    	
		    			    		
		    		
		    	
		    	case 0:
		    		opcaoMenu = -1;
		    		break;
		    		
		    		
		    	
		    }
		}
		
		System.out.println("Muito obrigado por usar nosso sistema "+ c1.getNome() + ", Esperamos que tenha gostado :)");
		System.out.println("Sistema feito por Ruan Lima\nDiagramas feitos por Ruan Lima e Richardy Borges\nSistema revisado por Henrique Izzi ");
		
	}
}
