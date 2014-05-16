package vehiculos;

public class BicicletaMotor extends Bicicleta {
	private Motor motor;

	BicicletaMotor(int plazas, int velMaxima, int pinones) {
		super(plazas, velMaxima, pinones);
	}

	@Override
	void desplazarse(int distancia) {
		if (!estaRoto()) {
			if (getVelocidad() > 0) {
				if (motor.consumir(distancia)) {
					super.desplazarse(distancia);
				}
			} else
				System.out.println("Debe acelerar primero.");
		} else
			System.out.println("La bicicleta está rota.");
	}

	@Override
	void parar() {
		if (!estaRoto()) {
			if (motor.consumir(getVelocidad() * 0.2)) {
				super.parar();
			}
		} else
			System.out.println("La bicicleta está rota.");
	}

	@Override
	void acelerar(int incrementoVelocidad) {
		if (!estaRoto()) {
			if (motor.consumir(incrementoVelocidad * 0.5)) {
				super.acelerar(incrementoVelocidad);
			}
		} else
			System.out.println("La bicicleta está rota.");
	}

	void repostar() {
		motor.repostar();
	}

	@Override
	public String toString() {
		return super.toString() + "[motor=" + motor + "]";
	}

}
