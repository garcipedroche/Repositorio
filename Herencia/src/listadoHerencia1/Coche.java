package listadoHerencia1;

public class Coche extends Vehiculo {
	public int ruedas = 4;
	public int gasolina;

	public void repostar(int litros) {
		gasolina += litros;
	}
}
