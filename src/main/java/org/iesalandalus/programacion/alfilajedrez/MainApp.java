package org.iesalandalus.programacion.alfilajedrez;

public class MainApp {

	private static Alfil alfil;

	private static void mostrarAlfil() {

		try {

			System.out.println(alfil.toString());

		} catch (NullPointerException e) {

			System.out.println("No se ha creado ningún alfil");
		}

	}

	private static void mostrarMenu() {

		System.out.println("Introduzca una opción:");
		System.out.println("1.Crear alfil por defecto");
		System.out.println("2.Crear un afil de un color");
		System.out.println("3.Crear un afil de un color en una columna inicial (c o f)");
		System.out.println("4.Mover el alfil");
		System.out.println("5.Salir");
	}
}
