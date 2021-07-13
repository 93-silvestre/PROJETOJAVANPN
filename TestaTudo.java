package br.com.generation.projetojava2;

import java.util.Scanner;

public class TestaTudo{

	

	public static void main(String[] args) {
		//Objetos usados
		Scanner read = new Scanner (System.in);
		Logar log = new Logar ();
		Doador Doa1 = new Doador();
		Beneficiario Recebe1 = new Beneficiario();
		int ApoioOuBenef = 0;
		int Continuar = 0;
		
		//TeleInicial
		System.out.println("===============================================");
		System.out.println("    SEJA BEM VINDES A N�S POR N�S !\n        ");
		System.out.println("  LIGANDO PESSOAS � UM PROP�SITO MAIOR !      ");
		System.out.println("===============================================");
		
		
		//Cadastro ou Login
		System.out.println("       VOC� J� � CADASTRADO?\n");
		System.out.println("    1 - SIM       |      2 - N�O");
		int cadastroLogin = read.nextInt();
		read.nextLine();
		//Simulamos um login aqui
		//login : adm
		//senha: 123
		//ser� um doador
		
		if (cadastroLogin  ==1 ) {
			log.login(read);
			Doa1.setNome("Us�ario Teste");
			ApoioOuBenef =1;
		}
		else {
			//triagem
			System.out.println("===============================================");
			System.out.println("         ESCOLHA SEU PERFIL :\n ");
			System.out.println("    1 - DOADOR    |    2 - AMPARADO"); 
			ApoioOuBenef =read.nextInt();
			read.nextLine();
			if (ApoioOuBenef == 1 ) {
				Doa1.Cadastramento(read);
				Doa1.Doacao(read);
			}
			
			else {
				Recebe1.Cadastramento(read);
				
				Recebe1.Demanda(read);
			}
		}
		
		
		//la�o de repeti��o caso o usario deseje fazer mais alguma doa��o ou pedido
		do {	
			
	

			//usando o res la de cima para diferencia um doador, de um beneficiario;
			if (ApoioOuBenef == 1) {
				System.out.println("===============================================");
				System.out.println("        DESEJA FAZER MAIS UMA DOA��O?\n");
				System.out.println("         1- SIM       |         2- NAO");
				Continuar = read.nextInt();
				read.nextLine();
				if (Continuar == 2 ){
					break;
				}
				Doa1.Doacao(read);
			}
			else {
				System.out.println("===============================================");
				System.out.println("         DESEJA FAZER MAIS UM PEDIDO?\n ");
				System.out.println("          1- SIM       |         2- NAO");
				Continuar = read.nextInt();
				if (Continuar == 2 ){
					break;
				}
				Recebe1.Demanda(read);
			}
		}while(Continuar != 2);
		
		
		
			//Mensagem de agradecimento
			if (ApoioOuBenef ==1) {	
			Doa1.MessagemDoador(read);
		}
			else {
			Recebe1.MessagemReceptor(read);
		}
	}

}
