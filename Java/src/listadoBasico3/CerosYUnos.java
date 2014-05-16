package listadoBasico3;

import utiles.Teclado;

/**
 * 6. Define la clase CerosYUnos que lea una secuencia de ceros y unos. Mostrará
 * el número de ceros de la secuencia. Dejará de leer cuando el usuario
 * introduzca el número 2.
 * 
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 */
public class CerosYUnos {
	public static void main(String[] args) {
		int x = -1;
		int cont = 0;
		do {
			System.out.println("Introduce 0 o 1. Con 2 se para.");
			x = Teclado.leerEntero();
			if (x == 0) {
				cont++;
			}
		} while (x != 2);
		
		System.out.println("Has introducido "+ cont + " ceros.");
	}
}
