package com.edutecno;

public class Libro extends Item {
	private String autor;
	private String isbn;
	

	public Libro(Integer id, String titulo, Integer anioPublicacion, String autor, String isbn) {
		super(id, titulo, anioPublicacion);
		this.autor = autor;
		this.isbn = isbn;
	}


	@Override
	public void mostrarDetalles() {
		System.out.println("Libro: " + getTitulo() + " por " + autor + " (ISBN: " + isbn + ")");
		
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

}
