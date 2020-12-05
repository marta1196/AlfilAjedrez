package org.iesalandalus.programacion.alfilajedrez;

public class Alfil {

	private Posicion posicion;
	private Color color;

	private void setPosicion(Posicion posicion) {

		this.posicion = posicion;
	}

	public Posicion getPosicion() {

		return posicion;
	}

	private void setColor(Color color) {

		if (color == null || color.equals("")) {

			throw new NullPointerException("ERROR: No se puede asignar un color nulo.");
		}

		this.color = color;
	}

	public Color getColor() {

		return color;
	}
}
