package br.com.generation.projetojava2;


import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

public class Doador extends Usuario {
	
	
	private int DoaAlimentos;
	private int DoaRoupas;
	private int DoaBrinquedo;
	private int DoaFarmacia;
	private int DoaOutros;
	ArrayList <Objetos> Doacoes = new ArrayList<>();

	
	
	public int getDoaAlimentos() {
		return DoaAlimentos;
	}

	public void setDoaAlimentos(int doaAlimento) {
		DoaAlimentos = doaAlimento;
	}

	public int getDoaRoupas() {
		return DoaRoupas;
	}

	public void setDoaRoupas(int doaRoupas) {
		DoaRoupas = doaRoupas;
	}

	public int getDoaBrinquedo() {
		return DoaBrinquedo;
	}

	public void setDoaBrinquedo(int doaBrinquedo) {
		DoaBrinquedo = doaBrinquedo;
	}

	public int getDoaFarmacia() {
		return DoaFarmacia;
	}

	public void setDoaFarmacia(int doaFarmacia) {
		DoaFarmacia = doaFarmacia;
	}

	public int getDoaOutros() {
		return DoaOutros;
	}
	public void setDoaOutros(int doaOutros) {
		DoaOutros = doaOutros;
	}
	


	public void Doacao(Scanner read) {
		System.out.println("\n=================== DOADOR =====================");
		System.out.println("ESCOLHA A OPÇÃO QUE DESEJA DOAR:");
		System.out.println("\n1 - ALIMENTOS NÃO PERECÍVEIS(Kg) \n2 - ROUPAS \n3 - BRINQUEDOS \n4 - PRODUTOS DE FARMÁCIA \n5 - OUTROS");
		int numero = 0 ;
		numero = read.nextInt();
		read.nextLine();
		switch (numero) {
		case 1:
			System.out.println("===============================================");
			System.out.println("ITEM ESCOLHIDO: ALIMENTOS NÃO PERECÍVEIS(Kg)");
			System.out.println("\nQUANTOS KG DE ALIMENTOS DESEJA DOAR?");
			this.DoaAlimentos +=read.nextInt();
			break;
		case 2:
			System.out.println("===============================================");
			System.out.println("ITEM ESCOLHIDO: ROUPAS");
			System.out.println("\nQUANTAS ROUPAS DESEJAR DOAR?");
			this.DoaRoupas +=read.nextInt();
			break;
		case 3:
			System.out.println("===============================================");
			System.out.println("ITEM ESCOLHIDO: BRINQUEDOS");
			System.out.println("\nQUANTOS BRINQUEDOS DESEJA DOAR");
			this.DoaBrinquedo +=read.nextInt();
			break;
		case 4:
			System.out.println("================================================");
			System.out.println("ITEM ESCOLHIDO: FARMÁCIA");
			System.out.println("\nQUANTOS PRODUTOS DESEJA DOAR?");
			this.DoaFarmacia +=read.nextInt();
			break;
		case 5:
			System.out.println("===============================================");
			System.out.println("OUTROS");
			System.out.println("\nDIGITE O QUE DESEJA DE DOAR?");
			String produto = read.nextLine();
			System.out.println("\nQUAL A QUANTIDADE DESSE ITEM GOSTARIA DE DOAR?");
			// Como fazer para ler int e char - Excluir Outros ???
			int quantidade = read.nextInt();
			

			Doacoes.add(new Objetos(produto, quantidade));
			
			break;
		default:
			System.out.println("===============================================");
			System.out.println("NÚMERO INVÁLIDO!");
		}
	}
	
	
		public void Cadastramento(Scanner read){	
			System.out.println("===============================================");
			System.out.println("       INICIE SEU CADASTRO:\n ");
			System.out.println("INSIRA SEU NOME: ");
			setNome(read.nextLine());
			System.out.println("INSIRA SEU EMAIL: ");
			setEmail(read.nextLine());
			System.out.println("INSIRA SUA SENHA: ");
			setSenha(read.nextLine());
		}
		public void MessagemDoador(Scanner read) {
			int RecebeConfirmacao = 0;
			while(RecebeConfirmacao != 1) {
				System.out.println();
				System.out.println("===============================================");
				System.out.println("\nRESUMO DE SUA SOLICITAÇÃO DE DOAÇÃO\n");
				System.out.println(getNome());
				System.out.println("PRODUTOS ESCOLHIDOS FORAM:\n");
				if (getDoaAlimentos()>1) {
					System.out.println("["+getDoaAlimentos()+" KG DE ALIMENTOS NÃO PERECÍVEIS]\n");
				}
				else if (getDoaAlimentos() == 1) {
					System.out.println("["+getDoaAlimentos()+" KG DE ALIMENTOS NÃO PERECÍVEL]\n");
				}
				if (getDoaRoupas()>1) {
					System.out.println("["+getDoaRoupas()+" ROUPAS]\n");
				}
				else if (getDoaRoupas() == 1){
					System.out.println("["+getDoaRoupas()+" ROUPA]\n");
				}
				if(getDoaBrinquedo() > 1) {
					System.out.println("["+getDoaBrinquedo()+" BRINQUEDOS]\n");
				}
				else if (getDoaBrinquedo() == 1) {
					System.out.println("["+getDoaBrinquedo()+" BRINQUEDO]\n");
				}
				if(getDoaFarmacia()>1) {
					System.out.println("["+getDoaFarmacia()+" FARMÁCIA]\n");
				}
				for(Objetos i: Doacoes ) {
					System.out.println(i);
				}
			    System.out.println("===============================================");
				System.out.println("VOCÊ DESEJA? ");
				System.out.println("\n1 - FINALIZAR DOAÇÃO \n2 - MAIS DOAÇÕES \n3 - CORRIGIR  \n4 - CANCELAR");
			
				RecebeConfirmacao = read.nextInt();
				if(RecebeConfirmacao == 1) {
					System.out.println("===============================================");
					System.out.println("         Obrigade, "+getNome() + "."        );
					System.out.println("Sua ajuda fará a diferença em outras VIDAS!");
				}
				else if(RecebeConfirmacao == 2) {
					Doacao(read);
				}
				else if (RecebeConfirmacao == 3) {
					setDoaAlimentos(0);
					setDoaBrinquedo(0);
					setDoaRoupas(0);
					setDoaFarmacia(0);
					Doacao(read);
			}
				else {
					setDoaAlimentos(0);
					setDoaBrinquedo(0);
					setDoaRoupas(0);
					setDoaFarmacia(0);
					System.out.println("===============================================");
					System.out.println("             SOLICITAÇÃO CANCELADA ");
					System.out.println("===============================================");
					break;
				}	
			}
		}
		
	}
