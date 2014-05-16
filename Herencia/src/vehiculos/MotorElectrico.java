package vehiculos;

import java.text.DecimalFormat;

import utiles.Teclado;

public class MotorElectrico extends Motor {
	private float bateria = 100;
	private static final TipoCombustible tipoCombustible = TipoCombustible.ELECTRICO;
	DecimalFormat df = new DecimalFormat("#.##");

	@Override
	boolean consumir(double consumo) {
		return descargar(consumo);
	}

	@Override
	public String toString() {
		return super.toString() + "[bateria=" + bateria + ", tipoCombustible="
				+ tipoCombustible + "]";
	}

	@Override
	void repostar() {
		cargar();
	}

	private void cargar() {
		System.out.println();
		double minutosCarga = Teclado.leerDecimal("La batería contiene el "
				+ df.format(bateria)
				+ "% de carga. \n¿Cuanto tiempo en minutos"
				+ " desea cargarlo? (Max " + df.format(100 - bateria) + "):");
		bateria += Math.abs(minutosCarga);
		comprobarCarga();
	}

	private boolean descargar(double gastoBateria) {
		double consumo = Math.abs(gastoBateria * 0.01);
		if (consumo > bateria) {
			System.out.println("No tiene suficiente batería."
					+ " Debe cargarla antes.");
			return false;
		} else {
			bateria -= consumo;
			return true;
		}
	}

	private void comprobarCarga() {
		if (bateria > 100) {
			System.out.println("No necesitará cargarlo durante tanto"
					+ " tiempo, lo dejaremos solo hasta que la"
					+ " batería se cargue completamente.");
			bateria = 100;
		} else {
			System.out.println("Ha cargado su vehiculo satisfactoriamente.");
		}
	}
}
