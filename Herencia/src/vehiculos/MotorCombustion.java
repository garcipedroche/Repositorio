package vehiculos;

import java.text.DecimalFormat;

import utiles.Teclado;

public class MotorCombustion extends Motor {
	private int cilindrada;
	private TipoCombustible tipoCombustible;
	private float combustible;
	private final float capacidadCombustible;
	DecimalFormat df = new DecimalFormat("#.##");

	public MotorCombustion(int cilindrada, TipoCombustible tipoCombustible,
			float combustible, float capacidadCombustible) {
		this.cilindrada = cilindrada;
		this.tipoCombustible = tipoCombustible;
		this.combustible = combustible;
		this.capacidadCombustible = capacidadCombustible;
	}

	@Override
	public String toString() {
		return super.toString() + "[cilindrada=" + cilindrada
				+ ", tipoCombustible=" + tipoCombustible + ", combustible="
				+ combustible + ", capacidadCombustible="
				+ capacidadCombustible + "]";
	}

	boolean consumir(double consumo) {
		return quemarCombustible(consumo);
	}

	void repostar() {
		echarCombustible();
	}

	private boolean quemarCombustible(double gastoCombustible) {
		double consumo = Math.abs(gastoCombustible * 0.001);
		if (consumo > combustible) {
			System.out.println("No tiene suficiente combustible."
					+ " Debe repostar antes.");
			return false;
		} else {
			combustible -= consumo;
			return true;
		}
	}

	private void echarCombustible() {
		System.out.println();
		double litrosRepostados = Teclado.leerDecimal("El depósito contiene "
				+ df.format(combustible) + "L de "
				+ tipoCombustible.toString().toLowerCase()
				+ ". \n¿Cuantos litros de "
				+ tipoCombustible.toString().toLowerCase()
				+ " desea repostar? (Max "
				+ df.format(capacidadCombustible - combustible) + "):");
		combustible += Math.abs(litrosRepostados);
		comprobarCombustible();
	}

	private void comprobarCombustible() {
		if (combustible > capacidadCombustible) {
			System.out.println("Ha intentado "
					+ "repostar más de lo que el tanque "
					+ "de combustible permite. Solo lo llenaremos "
					+ "hasta el máximo.");
			combustible = capacidadCombustible;
		} else {
			System.out.println("Ha repostado satisfactoriamente.");
		}
	}
}
