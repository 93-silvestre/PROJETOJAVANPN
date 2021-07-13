package br.com.generation.projetojava2;

import java.util.Scanner;

public class Logar {
	Doador Doa1 = new Doador();
	private String admin  = "adm";
	private String password = "123";
	String email;
	String senha;

	public String getAdmin() {
		return admin;
	}
	public void setAdmim(String adm) {
		this.admin = adm;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public void login(Scanner read) {
		String email,senha;
		boolean cadastro = true;
	
		do {
			System.out.println("INSIRA SEU NOME: ");
			email = read.nextLine();
			System.out.println("INSIRA SUA SENHA: ");
			senha= read.nextLine();
			if(email.equals(getAdmin())  && senha.equals("123")) { 
				System.out.println("LOGIN EFETUADO");
				cadastro = true;
			}
			else{
				System.out.println("LOGIN OU SENHA INVÁLIDOS");
				cadastro =false;
			}
		}while(cadastro == false);
		
	}
}