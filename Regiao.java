package br.com.generation.projetojava2;

import java.util.Scanner;

public class Regiao  {

	private String norte;
	private String sul;
	private String leste;
	private String oeste;
	private String centro;
	
	
	
	public String getNorte() {
		return norte;
	}



	public void setNorte(String norte) {
		this.norte = norte;
	}



	public String getSul() {
		return sul;
	}



	public void setSul(String sul) {
		this.sul = sul;
	}



	public String getLeste() {
		return leste;
	}



	public void setLeste(String leste) {
		this.leste = leste;
	}



	public String getOeste() {
		return oeste;
	}



	public void setOeste(String oeste) {
		this.oeste = oeste;
	}



	public String getCentro() {
		return centro;
	}



	public void setCentro(String centro) {
		this.centro = centro;
	}



	public void Regiao(Scanner read) {
		System.out.println("\n=================== REGIÃO =====================");
		System.out.println("ESCOLHA A SUA REGIAO:");
		System.out.println("\n1 - ZONA NORTE \n2 - ZONA LESTE \n3 - ZONA SUL \n4 - ZONA OESTE \n5 - CENTRO ");
		int numero = 0 ;
		numero = read.nextInt();
		read.nextLine();
		switch (numero) {
		case 1:
			System.out.println("===============================================");
			System.out.println("REGIÃO ESCOLHIDA: ZONA NORTE");
			this.norte +=read.nextInt();
			break;
		case 2:
			System.out.println("===============================================");
			System.out.println("REGIÃO ESCOLHIDA: ZONA LESTE");
			this.leste +=read.nextInt();
			break;
		case 3:
			System.out.println("===============================================");
			System.out.println("REGIÃO ESCOLHIDA: ZONA SUL");
			this.sul +=read.nextInt();
			break;
		case 4:
			System.out.println("================================================");
			System.out.println("REGIÃO ESCOLHIDA: ZONA OESTE");
			this.oeste +=read.nextInt();
			break;
		case 5:
			System.out.println("================================================");
			System.out.println("REGIÃO ESCOLHIDA: CENTRO");
			this.centro +=read.nextInt();
			break;
}
		
	}
}
     

