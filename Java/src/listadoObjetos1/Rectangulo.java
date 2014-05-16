package listadoObjetos1;

public class Rectangulo {
	private int ancho = 0;
	private int largo = 0;

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho += ancho;
	}

	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo += largo;
	}

	public void mostrar() {
		if (this.getLargo() != this.getAncho()) {
			System.out.println("Soy un rectangulo de ancho " + ancho
					+ " metros y largo " + largo + " metros.");
		} else {
			System.out.println("Ahora soy un cuadrado de lado " + ancho
					+ " metros.");
		}
	}

}
