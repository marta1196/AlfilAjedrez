package org.iesalandalus.programacion.alfilajedrez;

import org.iesalandalus.programacion.utilidades.Entrada;

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

	private static int elegirOpcion() {

		int opcionMenuPrincipal;

		mostrarMenu();
		opcionMenuPrincipal = Entrada.entero();

		return opcionMenuPrincipal;
	}

	private static Color elegirColor() {

		Color color = null;
		int opcionColor = 0;

		do {
			System.out.println("Introduzca una opción para escoger el color del alfil:");
			System.out.println("1.Blanco");
			System.out.println("2.Negro");

			opcionColor = Entrada.entero();

			switch (opcionColor) {

			case 1:

				color = Color.BLANCO;
				break;

			case 2:

				color = Color.NEGRO;
				break;

			default:
				System.out.println("Lo siento pero esa opción no esta permitida");
				break;
			}

		} while (opcionColor != 1 && opcionColor != 2);

		return color;
	}

	private static char elegirColumnaInicial() {

		char columnaInicial;

		do {

			System.out.println("Introduzca c o f para elegir columna inicial del alfil: ");
			columnaInicial = Entrada.caracter();

			if (columnaInicial != 'c' && columnaInicial != 'f') {

				System.out.println("Lo siento pero esa opción no esta permitida");
			}

		} while (columnaInicial != 'c' && columnaInicial != 'f');

		return columnaInicial;
	}

	private static void mostrarMenuDirecciones() {

		System.out.println("Introduzca una opción:");
		System.out.println("1.Arriba a la derecha");
		System.out.println("2.Abajo a la derecha");
		System.out.println("3.Abajo a la izquierda");
		System.out.println("4.Arriba a la izquierda");
	}

	private static Direccion elegirDireccion() {
		
		Direccion direccion = null;
		int opcionMenuDireccion = 0;
		
		do {
			mostrarMenuDirecciones();

			opcionMenuDireccion = Entrada.entero();

			switch (opcionMenuDireccion) {

			case 1:

				direccion = Direccion.ARRIBA_DERECHA;
				break;

			case 2:

				direccion = Direccion.ABAJO_DERECHA;
				break;

			case 3:

				direccion = Direccion.ABAJO_IZQUIERDA;
				break;

			case 4:

				direccion = Direccion.ARRIBA_IZQUIERDA;
				break;

			default:

				System.out.println("Lo siento pero esa opción no esta permitida");
				break;
			}

		} while (opcionMenuDireccion < 1 || opcionMenuDireccion > 4);

		return direccion;
	}
}
