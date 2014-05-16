package vehiculos;

/**
 * Clase Bicicleta. Hereda de la clase vehiculo
 *
 * Esta clase ha sido documentada por Jose Manuel Garcia Valverde
 *
 * @author Miguel Rodriguez Lopez
 */

public class Bicicleta extends Vehiculo {
	private static final int MIN_PLAZAS = 1;
	private static final int MAX_PLAZAS = 2;
	private static final int NUMRUEDAS = 2;
	private int pinones;

	protected Bicicleta(int plazas, int velMaxima, int pinones) {
		super(NUMRUEDAS, plazas, velMaxima);
		this.pinones = pinones;
	}

	static public Bicicleta getInstance(int velMaxima, int pinones) {
		return new Bicicleta(Vehiculo.pedirPlazas(MIN_PLAZAS, MAX_PLAZAS),
				Math.abs(velMaxima), Math.abs(pinones));
	}

	public int getPinones() {
		return pinones;
	}

	@Override
	void desplazarse(int distancia) {
		super.desplazarse(distancia);
	}

	@Override
	void parar() {
		super.parar();
	}

	@Override
	void acelerar(int incrementoVelocidad) {
		super.acelerar(incrementoVelocidad);
	}

	@Override
	public String toString() {
		return super.toString() + "[pinones=" + pinones + "]";
	}

	void repostar() {
		System.out.println("No es un vehiculo a motor.");
	}
}
