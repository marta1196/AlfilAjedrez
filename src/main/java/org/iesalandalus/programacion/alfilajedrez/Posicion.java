package org.iesalandalus.programacion.alfilajedrez;

public class Posicion {

	private int fila;
	private char columna;

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
