package br.com.generation.projetojava2;

public class Objetos {
	private String objetos;
	private int quantidade;
	
	public Objetos(String objetos, int quantidade) {
		super();
		this.objetos = objetos;
		this.quantidade = quantidade;
	}
	public String getObjetos() {
		return objetos;
	}
	public void setObjetos(String objetos) {
		this.objetos = objetos;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	@Override
	public String toString() {
		return   "["+this.quantidade +" "+this.objetos+"]" ;
	}
	
	
}