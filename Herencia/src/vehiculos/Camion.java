package vehiculos;

public class Camion extends Vehiculo {
	private static final int MIN_PLAZAS = 2;
	private static final int MAX_PLAZAS = 3;
	private static final int MIN_RUEDAS = 4;
	private static final int MAX_RUEDAS = 8;
	private int tara;
	private Motor motor;

	private Camion(int ruedas, int plazas, int velMaxima, int tara) {
		super(ruedas, plazas, velMaxima);
		this.tara = tara;
	}

	static public Camion getInstance(int velMaxima, int tara) {
		return new Camion(Vehiculo.pedirRuedas(MIN_RUEDAS, MAX_RUEDAS),
				Vehiculo.pedirPlazas(MIN_PLAZAS, MAX_PLAZAS),
				Math.abs(velMaxima), tara);
	}

	public int getTara() {
		return tara;
	}

	@Override
	void desplazarse(int distancia) {
		if (!estaRoto()) {
			if (getVelocidad() > 0) {
				if (motor.consumir(distancia * 7)) {
					super.desplazarse(distancia);
				}
			} else
				System.out.println("Debe acelerar primero.");
		} else
			System.out.println("El camión está roto.");
	}

	@Override
	void parar() {
		if (!estaRoto()) {
			if (motor.consumir(getVelocidad() * 2)) {
				super.parar();
			}
		} else
			System.out.println("El camión está roto.");
	}

	@Override
	void acelerar(int incrementoVelocidad) {
		if (!estaRoto()) {
			if (motor.consumir(incrementoVelocidad * 5)) {
				super.acelerar(incrementoVelocidad);
			}
		} else
			System.out.println("El camión está roto.");
	}

	void repostar() {
		motor.repostar();
	}

	@Override
	public String toString() {
		return super.toString() + "[tara=" + tara + ", motor=" + motor + "]";
	}
}
