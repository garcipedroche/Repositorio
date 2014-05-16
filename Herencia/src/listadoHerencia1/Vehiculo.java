package listadoHerencia1;

/**
 * 1. Implementa la superclase Vehiculo y las subclases Coche y Camion. Básate
 * para ello en la documentación aportada en el documento de Jorge Sánchez.
 * 
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 * 
 */
public class Vehiculo {
	public int velocidad;
	public int ruedas;

	public void parar() {
		velocidad = 0;
	}

	public void acelerar(int kmh) {
		velocidad += kmh;
	}

}