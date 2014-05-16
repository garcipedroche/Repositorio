package exMiguelRodriguezLopez;

/**
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 * 
 */
public class Plato {
	/**
	 * Cantidad de comida que contiene cada plato
	 */
	private int cantidad=200;

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * Decrementa la cantidad de comida del plato
	 * @param cantidad que desea comer
	 */
	public void comer(int cantidad) {
		this.cantidad -= cantidad;
	}
}
