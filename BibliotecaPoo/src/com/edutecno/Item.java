package com.edutecno;

public abstract class Item {
	protected Integer id;
	protected String titulo;
	protected Integer anioPublicacion;
	
	public Item(Integer id, String titulo, Integer anioPublicacion) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.anioPublicacion = anioPublicacion;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getAnioPublicacion() {
		return anioPublicacion;
	}

	public void setAnioPublicacion(Integer anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}
	
	public abstract void mostrarDetalles();
}
