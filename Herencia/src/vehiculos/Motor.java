package vehiculos;

import utiles.Teclado;

public abstract class Motor {
	private boolean roto = false;

	abstract boolean consumir(double consumo);

	abstract void repostar();

	boolean estaRoto() {
		return roto;
	}

	void romper() {
		roto = true;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "[roto=" + roto + "]";
	}

	static Motor getInstance() {
		do {
			System.out.println("Tipos de combustible:");
			System.out.println("1. Gasolina");
			System.out.println("2. Gasoleo");
			System.out.println("3. Electrico");
			int resp = Teclado.leerEntero();
			switch (resp) {
			case 1:
			case 2:
				TipoCombustible tipoCombustible;
				if (resp == 1)
					tipoCombustible = TipoCombustible.GASOLINA;
				else
					tipoCombustible = TipoCombustible.GASOLEO;
				double tanque = Teclado
						.leerDecimal("Capacidad del tanque de combustible:");
				float capacidadCombustible = (float) tanque;
				return new MotorCombustion(
						Teclado.leerEntero("Cilindrada del motor"),
						tipoCombustible, 0, capacidadCombustible);
			case 3:
				return new MotorElectrico();
			default:
				System.out.println("Error, Debe elegir una opción de las"
						+ " anteriores (entre 1 y 3).");
			}
		} while (true);
	}
}

enum TipoCombustible {
	GASOLINA, GASOLEO, ELECTRICO
}