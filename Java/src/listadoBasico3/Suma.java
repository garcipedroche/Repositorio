package listadoBasico3;

import utiles.Teclado;

/**
 * 8. Define la clase Suma que realice una suma y la muestre . Para ello
 * implementa el método sumar que devuelva la suma de dos números, solicitados
 * por teclado. Documéntalo correctamente (@ return)
 * 
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 * 
 */
public class Suma {
	public static void main(String[] args) {
		int suma = 0;
		suma = suma();

		System.out.println("Suma=" + suma);
	}

	/**
	 * 
	 * @return Devuelve la suma de los valores introducidos por teclado.
	 */
	public static int suma() {
		int x,y,suma;
		System.out.println("Introduce x:");
		x = Teclado.leerEntero();
		System.out.println("Introduce y:");
		y = Teclado.leerEntero();
		suma = x + y;
		return suma;
	}

}
