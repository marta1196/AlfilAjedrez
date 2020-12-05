package org.iesalandalus.programacion.alfilajedrez;

public class Alfil {

	private Posicion posicion;
	private Color color;

	public Alfil() {

		setColor(Color.NEGRO);
		setPosicion(new Posicion(8, 'f'));
	}

	public Alfil(Color color) {

		setColor(color);

		if (color.equals(Color.BLANCO)) {

			setPosicion(new Posicion(1, 'f'));

		} else if (color.equals(Color.NEGRO)) {

			setPosicion(new Posicion(8, 'f'));
		}

	}

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
