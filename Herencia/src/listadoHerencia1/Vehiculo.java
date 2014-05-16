package listadoHerencia1;

/**
 * 1. Implementa la superclase Vehiculo y las subclases Coche y Camion. B�sate
 * para ello en la documentaci�n aportada en el documento de Jorge S�nchez.
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