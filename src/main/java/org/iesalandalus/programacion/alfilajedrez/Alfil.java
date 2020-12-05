package org.iesalandalus.programacion.alfilajedrez;

import javax.naming.OperationNotSupportedException;

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

	public Alfil(Color color, char columna) {

		setColor(color);

		if (columna == 'c' || columna == 'f') {

			if (color.equals(Color.BLANCO)) {

				setPosicion(new Posicion(1, columna));

			} else if (color.equals(Color.NEGRO)) {

				setPosicion(new Posicion(8, columna));
			}

		} else {

			throw new IllegalArgumentException("ERROR: Columna no válida.");
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

	public void mover(Direccion direccion, int pasos) throws OperationNotSupportedException {

		if (direccion == null) {

			throw new NullPointerException("ERROR: La dirección no puede ser nula.");
		}

		if (pasos <= 0) {

			throw new IllegalArgumentException("ERROR: El número de pasos debe ser positivo.");
		}

		switch (direccion) {

		case ARRIBA_DERECHA:

			try {

				setPosicion(new Posicion(posicion.getFila() + pasos, (char) (posicion.getColumna() + pasos)));

			} catch (IllegalArgumentException e) {

				throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
			}

			break;

		case ABAJO_DERECHA:

			try {

				setPosicion(new Posicion(posicion.getFila() - pasos, (char) (posicion.getColumna() + pasos)));

			} catch (IllegalArgumentException e) {

				throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
			}

			break;

		case ABAJO_IZQUIERDA:

			try {

				setPosicion(new Posicion(posicion.getFila() - pasos, (char) (posicion.getColumna() - pasos)));

			} catch (IllegalArgumentException e) {

				throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
			}

			break;

		case ARRIBA_IZQUIERDA:

			try {

				setPosicion(new Posicion(posicion.getFila() + pasos, (char) (posicion.getColumna() - pasos)));

			} catch (IllegalArgumentException e) {

				throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
			}

			break;

		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((posicion == null) ? 0 : posicion.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alfil other = (Alfil) obj;
		if (color != other.color)
			return false;
		if (posicion == null) {
			if (other.posicion != null)
				return false;
		} else if (!posicion.equals(other.posicion))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "fila=" + posicion.getFila() + ", columna=" + posicion.getColumna() + ", color=" + color;
	}
}
