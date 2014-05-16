package listadoBasico3;

import utiles.Teclado;

/**
 * 9. Define la clase Suma2 que realice una suma y la muestre . Para ello
 * implementa el método sumar con los dos argumentos que sean los sumandos. Ha
 * de devolver su suma. Documéntalo correctamente ( @ param y @ return)
 * 
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 */
public class Suma2 {
	public static void main(String[] args) {
		int x, y;
		x = introducir();
		y = introducir();
		suma(x, y);
	}

	/**
	 * 
	 * @param x es el primer sumando.
	 * @param y es el segundo sumando.
	 */
	public static void suma(int x, int y) {
		System.out.println("Suma: " + x + "+" + y + "=" + (x + y));
	}

	/**
	 * 
	 * @return Devuelve el valor introducido por teclado.
	 */
	public static int introducir() {
		int valor;
		System.out.println("Introduce valor:");
		valor = Teclado.leerEntero();
		return valor;
	}
}
