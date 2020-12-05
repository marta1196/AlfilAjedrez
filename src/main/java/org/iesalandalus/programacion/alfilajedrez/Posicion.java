package org.iesalandalus.programacion.alfilajedrez;

public class Posicion {

	private int fila;
	private char columna;

	public Posicion(int fila, char columna) {

		setFila(fila);
		setColumna(columna);
	}

	public Posicion(Posicion posicion) {

		if (posicion == null) {

			throw new NullPointerException("ERROR: No es posible copiar una posición nula.");
		}

		this.fila = posicion.getFila();
		this.columna = posicion.getColumna();
	}

	private void setFila(int fila) {

		if (fila < 1 || fila > 8) {

			throw new IllegalArgumentException("ERROR: Fila no válida.");

		} else {

			this.fila = fila;
		}
	}

	public int getFila() {

		return fila;
	}

	private void setColumna(char columna) {

		if (columna < 'a' || columna > 'h') {

			throw new IllegalArgumentException("ERROR: Columna no válida.");

		} else {

			this.columna = columna;
		}
	}

	public char getColumna() {

		return columna;
	}
}
