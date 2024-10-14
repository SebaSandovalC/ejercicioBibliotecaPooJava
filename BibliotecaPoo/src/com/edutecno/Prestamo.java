package com.edutecno;

import java.util.Date;

public class Prestamo {
	private Item item;
	private Usuario usuario;
	private Date fechaPrestamo;
	private Date fechaDevolucion;
	
	
	public Prestamo(Item item, Usuario usuario, Date fechaPrestamo, Date fechaDevolucion) {
		super();
		this.item = item;
		this.usuario = usuario;
		this.fechaPrestamo = fechaPrestamo;
		this.fechaDevolucion = fechaDevolucion;
	}
	
	public boolean estaRetrasado() {
		Date hoy = new Date();
		return hoy.after(fechaDevolucion);
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Date getFechaPrestamo() {
		return fechaPrestamo;
	}

	public void setFechaPrestamo(Date fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	public Date getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(Date fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}
	
	
}
