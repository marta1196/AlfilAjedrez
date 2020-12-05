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
}
