package vehiculos;
/**
 * Clase coche que hereda de vehiculo
 * Comentada por Jose Manuel Garcia Valverde
 *
 * @author Miguel Rodriguez
 * 
 *  
*/
public class Coche extends Vehiculo {
	private static final int MIN_PLAZAS = 2;
	private static final int MAX_PLAZAS = 9;
	private static final int NUMRUEDAS = 4;
	private Motor motor;

	private Coche(int plazas, int velMaxima, Motor motor) {
		super(NUMRUEDAS, plazas, velMaxima);
		this.motor = motor;
	}

	static public Coche getInstance(int velMaxima, Motor motor) {
		return new Coche(Vehiculo.pedirPlazas(MIN_PLAZAS, MAX_PLAZAS),
				Math.abs(velMaxima), motor);
	}

	@Override
	void desplazarse(int distancia) {
		if (!estaRoto()) {
			if (getVelocidad() > 0) {
				if (motor.consumir(distancia * 5)) {
					super.desplazarse(distancia);
				}
			} else
				System.out.println("Debe acelerar primero.");
		} else
			System.out.println("El coche está roto.");
	}

	@Override
	void parar() {
		if (!estaRoto()) {
			if (motor.consumir(getVelocidad())) {
				super.parar();
			}
		} else
			System.out.println("El coche está roto.");
	}

	@Override
	void acelerar(int incrementoVelocidad) {
		if (!estaRoto()) {
			if (motor.consumir(incrementoVelocidad * 3)) {
				super.acelerar(incrementoVelocidad);
			}
		} else
			System.out.println("El coche está roto.");
	}

	void repostar() {
		motor.repostar();
	}

	@Override
	public String toString() {
		return super.toString() + "[motor=" + motor + "]";
	}
}