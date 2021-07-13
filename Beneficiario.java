package br.com.generation.projetojava2;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

public class Beneficiario extends Usuario {
	
	private int RecebeAlimentos;
	private int RecebeRoupas;
	private int RecebeBrinquedo;
	private int RecebeFarmacia;
	private Objetos outros;
	
	ArrayList <Objetos> Pedidos = new ArrayList<>();
	

	public int getRecebeAlimentos() {
		return RecebeAlimentos;
	}

	public void setRecebeAlimentos(int recebeAlimentos) {
		RecebeAlimentos = recebeAlimentos;
	}

	public int getRecebeRoupas() {
		return RecebeRoupas;
	}

	public void setRecebeRoupas(int recebeRoupas) {
		RecebeRoupas = recebeRoupas;
	}

	public int getRecebeBrinquedo() {
		return RecebeBrinquedo;
	}

	public void setRecebeBrinquedo(int recebeBrinquedo) {
		RecebeBrinquedo = recebeBrinquedo;
	}

	public int getRecebeFarmacia() {
		return RecebeFarmacia;
	}

	public void setRecebeFarmacia(int recebeFarmacia) {
		RecebeFarmacia = recebeFarmacia;
	}

	// Colocando o valor inicial da doacao ou ajustando o valor;



	public void Demanda(Scanner read) {
		
		System.out.println("\n=================== DOADOR =====================");
		System.out.println("\nO QUE VOCÊ DESEJA RECEBER: \n1 - ALIMENTOS NÃO PERECÍVEIS(kg)"
				+ "\n2 - ROUPAS \n3 - BRINQUEDOS \n4 - FARMÁCIA \n5 - OUTROS");
		int numero = 0;
		numero = read.nextInt();
		read.nextLine();
		switch (numero) {
		case 1:
			System.out.println("===============================================");
			System.out.println("ITEM ESCOLHIDO: ALIMENTOS NÃO PERECÍVEIS(Kg)");
			System.out.println("\nQUANTOS KG A MAIS DE ALIMENTOS DESEJA RECEBER");
			this.RecebeAlimentos += read.nextInt();
			break;
		case 2:
			System.out.println("===============================================");
			System.out.println("ITEM ESCOLHIDO: ROUPAS");
			System.out.println("\nQUANTAS ROUPAS A MAIS GOSTARIA DE RECEBER?");
			this.RecebeRoupas += read.nextInt();
			break;
		case 3:
			System.out.println("===============================================");
			System.out.println("ITEM ESCOLHIDO: BRINQUEDOS");
			System.out.println("\nQUANTOS BRINQUEDOS A MAIS DESEJA RECEBER?");
			this.RecebeBrinquedo += read.nextInt();
			break;
		case 4:
			System.out.println("===============================================");
			System.out.println("ITEM ESCOLHIDO: FARMÁCIA");
			System.out.println("\nQUANTOS ITENS A MAIS DESEJA RECEBER?");
			this.RecebeFarmacia += read.nextInt();
			;
			break;
		case 5:
			System.out.println("===============================================");
			System.out.println("OUTROS");
			System.out.println("\nO QUE GOSTARIA DE RECEBER?");
			String produto = read.nextLine();
			System.out.println("\nQUAL A QUANTIDADE DESSE ITEM GOSTARIA DE RECEBER?");
			// Como fazer para ler int e char - Excluir Outros ???
			int quantidade = read.nextInt();
			

			Pedidos.add(new Objetos(produto, quantidade));
			
			break;
		}
	}

	public void Cadastramento(Scanner read) {
		
		System.out.println("===============================================");
		System.out.println("       INICIE SEU CADASTRO:\n ");
		System.out.println("INSIRA SEU NOME: ");
		setNome(read.nextLine());
		System.out.println("INSIRA SEU EMAIL: ");
		setEmail(read.nextLine());
		System.out.println("INSIRA SUA SENHA: ");
		setSenha(read.nextLine());
	}

	public void MessagemReceptor(Scanner read) {
		int RecebeConfirmacao = 0;
		while (RecebeConfirmacao != 1) {
			System.out.println("===============================================");
			System.out.println("\nRESUMO DE SUA SOLICITAÇÃO \n");
			System.out.println(getNome());
			System.out.println("PRODUTOS ESCOLHIDOS FORAM:\n");
			if (getRecebeAlimentos() > 1) {
				System.out.println("[" + getRecebeAlimentos() + " KG DE ALIMENTOS NÃO PERECÍVEIS]\n");
			} else if (getRecebeAlimentos() == 1) {
				System.out.println("[" + getRecebeAlimentos() + " KG DE ALIMENTO NÃO PERECÍVEL]\n");
			}
			if (getRecebeRoupas() > 1) {
				System.out.println("[" + getRecebeRoupas() + " ROUPAS]\n");
			} else if (getRecebeRoupas() == 1) {
				System.out.println("[" + getRecebeRoupas() + " ROUPA]\n");
			}
			if (getRecebeBrinquedo() > 1) {
				System.out.println("[" + getRecebeBrinquedo() + " BRINQUEDOS]\n");
			} else if (getRecebeBrinquedo() == 1) {
				System.out.println("[" + getRecebeBrinquedo() + " BRINQUEDO]\n");
			}
			if (getRecebeFarmacia() > 0) {
				System.out.println("[" + getRecebeFarmacia() + " FARMÁCIA]\n");
			}
			for(Objetos i: Pedidos ) {
				System.out.println(i);
			}
			System.out.println("===============================================");
			System.out.println("\nVOCÊ DESEJA?");
		    System.out.println("\n1 - FINALIZAR SOLICITAÇÃO \n2 - MAIS SOLICITAÇÃO \n3 - CORRIGIR  \n4 - CANCELAR");

			RecebeConfirmacao = read.nextInt();
			// Confirmação do pedido
			if (RecebeConfirmacao == 1) {
				System.out.println("===============================================");
				System.out.println("Obrigade, " + getNome() + "por confiar em nosso processo!.\n "
						           +"Em breve entraremos em contato para informar "
						           + "a disponibilidade de sua solicitação.");
								 
			}
			// Fazer mais pedidos ou doações
			else if (RecebeConfirmacao == 2) {
				Demanda(read);
			}
			// Zero os pedidos
			else if (RecebeConfirmacao == 3) {
				setRecebeAlimentos(0);
				setRecebeBrinquedo(0);
				setRecebeRoupas(0);
				setRecebeFarmacia(0);
				Demanda(read);
			}
			// Cancela os pedidos
			else {
				setRecebeAlimentos(0);
				setRecebeBrinquedo(0);
				setRecebeRoupas(0);
				setRecebeFarmacia(0);
				System.out.println(" SOLICITAÇÃO CANCELADA !!  ");
				break;
			}
		}
	}

}