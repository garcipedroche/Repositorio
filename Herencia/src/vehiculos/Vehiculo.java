package vehiculos;

import utiles.Teclado;

public abstract class Vehiculo {
	private int ruedas;
	private int plazas;
	private int velocidad = 0;
	private int velMaxima;
	private boolean roto = false;

	Vehiculo(int ruedas, int plazas, int velMaxima) {
		this.ruedas = ruedas;
		this.plazas = plazas;
		this.velMaxima = velMaxima;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public boolean estaRoto() {
		return roto;
	}

	abstract void repostar();

	void desplazarse(int distancia) {
		if (!estaRoto())
			System.out.println("Ha recorrido " + distancia + " metros.");
		else
			System.out.println("El vehiculo está roto.");
	}

	void parar() {
		if (!estaRoto()) {
			velocidad = 0;
			System.out.println("Ha detenido el vehículo.");
		} else
			System.out.println("El vehiculo está roto.");
	}

	void acelerar(int incrementoVelocidad) {
		if (!estaRoto())
			if (incrementoVelocidad < 0) {
				System.out.println("No puede acelerar una cantidad negativa.");
			} else {
				velocidad += incrementoVelocidad;
				comprobarVelocidad();
				System.out.println("Ahora se desplaza a " + getVelocidad()
						+ "km/h.");
			}
		else
			System.out.println("El vehiculo está roto.");
	}

	private void comprobarVelocidad() {
		if (velocidad > velMaxima) {
			System.out.println("El vehiculo se ha roto...");
			roto = true;
		}
	}

	@Override
	public String toString() {
		return "\n" + this.getClass().getSimpleName() + "[ruedas=" + ruedas
				+ ", plazas=" + plazas + ", velocidad=" + velocidad
				+ ", velMaxima=" + velMaxima + ", roto=" + roto + "]";
	}

	static int pedirPlazas(int minPlazas, int maxPlazas) {
		int plazasIntroducidas;
		do {
			plazasIntroducidas = Teclado
					.leerEntero("Nº de plazas del vehiculo (entre " + minPlazas
							+ " y " + maxPlazas + "):");
			if (plazasIntroducidas <= maxPlazas
					&& plazasIntroducidas >= minPlazas)
				return plazasIntroducidas;
			System.out.println("Error, Nº de plazas incorrecto.");
		} while (true);
	}

	static int pedirRuedas(int minRuedas, int maxRuedas) {
		int ruedasIntroducidas;
		do {
			ruedasIntroducidas = Teclado
					.leerEntero("Nº de ruedas del vehiculo (entre " + minRuedas
							+ " y " + maxRuedas + "):");
			if (ruedasIntroducidas <= maxRuedas
					&& ruedasIntroducidas >= minRuedas
					&& ruedasIntroducidas % 2 == 0)
				return ruedasIntroducidas;
			System.out.println("Error, Nº de ruedas incorrecto.");
		} while (true);
	}
}