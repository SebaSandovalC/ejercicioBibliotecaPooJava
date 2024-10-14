package com.edutecno;

import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca();
		Scanner scanner = new Scanner(System.in);
		
		
		boolean salir = false;
		while (!salir) {
		System.out.println("\n--- Sistema de Gestión de Biblioteca ---");
        System.out.println("1. Añadir nuevo libro");
        System.out.println("2. Añadir nueva revista");
        System.out.println("3. Registrar usuario");
        System.out.println("4. Prestar item");
        System.out.println("5. Devolver item");
        System.out.println("6. Mostrar inventario");
        System.out.println("7. Mostrar préstamos actuales");
        System.out.println("8. Salir");
        
        int opcion = scanner.nextInt();
        scanner.nextLine();
        
        switch (opcion) {
        	case 1:
        		
        		System.out.println("Introducir ID del libro: ");
        		int idLibro = scanner.nextInt();
        		scanner.nextLine();
        		System.out.println("Introducir título del Libro: ");
        		String tituloLibro = scanner.nextLine();
        		System.out.println("Introducir año de publicación: ");
        		int anioLibro = scanner.nextInt();
        		scanner.nextLine();
        		System.out.println("Introducir autor del libro: ");
        		String autor = scanner.nextLine();
        		System.out.println("Introducir ISBN: ");
        		String isbn = scanner.nextLine();
        		Libro libro = new Libro(idLibro, tituloLibro, anioLibro, autor,isbn);
        		biblioteca.anadirItem(libro);
        		break;
        	case 2:
        		
        		System.out.println("Introducir ID de la revista: ");
        		int idRevista = scanner.nextInt();
        		scanner.nextLine();
        		System.out.println("Introducir título de la revista: ");
        		String tituloRevista = scanner.nextLine();
        		System.out.println("Introducir año de publicacion: ");
        		int anioRevista = scanner.nextInt();
        		scanner.nextLine();
        		System.out.println("Introducir numero de la revista: ");
        		int numero = scanner.nextInt();
        		scanner.nextLine();
        		System.out.println("Introducir mes de la revista: ");
        		String mes = scanner.nextLine();
        		Revista revista = new Revista(idRevista, tituloRevista, anioRevista, numero, mes);
        		biblioteca.anadirItem(revista);
        		break;
        	case 3:
        		
        		System.out.println("Introducir ID del usuario: ");
        		int idUsuario = scanner.nextInt();
        		scanner.nextLine();
        		System.out.println("Introducir nombre del usuario");
        		String nombreUsuario = scanner.nextLine();
        		System.out.println("Introducir correo del usuario: ");
        		String emailUsuario = scanner.nextLine();
        		Usuario usuario = new Usuario(idUsuario, nombreUsuario, emailUsuario);
        		biblioteca.registrarUsuario(usuario);
        		break;
        	case 4:
        		
        		System.out.println("Introducion ID del item a prestar: ");
        		int idItemPrestar = scanner.nextInt();
        		scanner.nextLine();
        		System.out.println("Introducir ID del usuario que realiza el prestamo: ");
        		int idUsuarioPrestar = scanner.nextInt();
        		scanner.nextLine();
        		System.out.println("Introducir fecha de devolucion (yyyy-mm-dd): ");
        		String fechaDevolucionString = scanner.nextLine();
        		Date fechaPrestamo = new Date();
        		Date fechaDevolucion = java.sql.Date.valueOf(fechaDevolucionString);
        		Item itemPrestar = biblioteca.getItemById(idItemPrestar);
        		Usuario usuarioPrestar = biblioteca.getUsuarioById(idUsuarioPrestar);
        		if (itemPrestar != null && usuarioPrestar != null) {
        			biblioteca.realizarPrestamo(itemPrestar, usuarioPrestar, fechaPrestamo, fechaDevolucion);
        		} else {
        			System.out.println("Item o usuario no encontrado.");
        		}
        		break;
        	case 5:
        		
        		System.out.println("Introducir ID del item a devolver: ");
        		int idItemDevolver = scanner.nextInt();
        		scanner.nextLine();
        		Prestamo prestamo = biblioteca.getPrestamoByItemId(idItemDevolver);
        		if (prestamo != null) {
        			biblioteca.devolverItem(prestamo);
        			System.out.println("Prestamo no encontrado.");
        		}
        		break;
        	case 6:	
        		
        		biblioteca.mostrarItems();
        		break;
        	case 7:
        		
        		biblioteca.mostrarPrestamos();
        		break;
        	case 8:
        		
        		salir = true;
        		System.out.println("Sistema de biblioteca cerrado.");
        		break;
        	default:
        		System.out.println("Opcion no valida.");
        		       		
        }

	}
		scanner.close();
	}
}
