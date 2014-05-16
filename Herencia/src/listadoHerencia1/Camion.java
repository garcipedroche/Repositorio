package listadoHerencia1;

public class Camion extends Vehiculo {
	public int ruedas = 8;
	public int gasolina;

	public void repostar(int litros) {
		gasolina += litros;
	}
}
