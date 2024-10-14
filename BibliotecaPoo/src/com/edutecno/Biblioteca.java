package com.edutecno;

import java.util.ArrayList;
import java.util.Date;

public class Biblioteca {
	private ArrayList<Item> items;
	private ArrayList<Usuario> usuarios;
	private ArrayList<Prestamo> prestamos;
	
	
	public Biblioteca() {
		this.items = new ArrayList<>();
		this.usuarios = new ArrayList<>();
		this.prestamos = new ArrayList<>();
	}
	
	public void anadirItem(Item item) {
		items.add(item);
	}
	
	public void registrarUsuario(Usuario usuario) {
		usuarios.add(usuario);
	}
	
	public void realizarPrestamo(Item item, Usuario usuario, Date fechaPrestamo, Date fechaDevolucion) {
		Prestamo prestamo = new Prestamo(item, usuario, fechaPrestamo, fechaDevolucion);
		prestamos.add(prestamo);
	}
	
	public void devolverItem(Prestamo prestamo) {
		prestamos.remove(prestamo);
	}
	
	public void mostrarItems() {
		for (Item item : items) 
			item.mostrarDetalles();
		}
	
	public void mostrarPrestamos() {
		for (Prestamo prestamo : prestamos) {
			System.out.println("Préstamo de " + prestamo.getItem().getTitulo() + " a " + prestamo.getUsuario().getNombre());
		}
	
	}

	public Item getItemById(int id) {
		for (Item item : items) {
			if (item.getId() == id) {
				return item;
			}
		}
		return null;
	}

	public Usuario getUsuarioById(int id) {
		for (Usuario usuario : usuarios) {
			if (usuario.getId() == id) {
				return usuario;
			}
		}
		return null;
	}

	public Prestamo getPrestamoByItemId(int id) {
		for (Prestamo prestamo : prestamos) {
			if (prestamo.getItem().getId() == id) {
				return prestamo;
			}
		}
		return null;
	}
}
