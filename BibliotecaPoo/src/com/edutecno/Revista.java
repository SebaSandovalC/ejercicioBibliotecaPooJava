package com.edutecno;

public class Revista extends Item{
	private int numero;
	private String mes;
	
	
	public Revista(Integer id, String titulo, int anioPublicacion, int numero, String mes ) {
		super(id, titulo, anioPublicacion);
		this.numero = numero;
		this.mes = mes;
	}


	@Override
	public void mostrarDetalles() {
		System.out.println("Revista: " + " (Número: " + numero + ", Mes: " + mes + ")" );
		
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getMes() {
		return mes;
	}


	public void setMes(String mes) {
		this.mes = mes;
	}
	

}
