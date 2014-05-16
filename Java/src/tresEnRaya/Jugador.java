package tresEnRaya;

public class Jugador {
	private String nombre;
	private int puntos;

	Jugador(String nombre) {
		this.nombre = nombre;
		this.puntos = 0;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos() {
		this.puntos += 1;
	}

	public String getNombre() {
		return nombre;
	}

}