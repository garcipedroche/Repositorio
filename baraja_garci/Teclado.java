package baraja;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Permite lectura desde teclado
 * 
 * @author MariaLourdes
 * 
 */
public class Teclado {

	/**
	 * Lee un caracter del teclado
	 * 
	 * @return caracter introducido por el usuario
	 */
	public static char leerCaracter(String cadena) {
		System.out.println(cadena);
		char caracter;
		try {
			caracter = leerCadena().charAt(0);
		} catch (Exception e) {
			caracter = 0;
		}
		return caracter;
	}// Examen de Marzo2014

	/**
	 * Muestra cadena pedida por parametro y lee una cadena del teclado
	 * 
	 * @param texto cadena introducida para mostrar en pantalla
	 * @return cadena introducida por el usuario
	 */

	public static String leerCadena(String texto) {
		System.out.println(texto);
		BufferedReader bReader = new BufferedReader(new InputStreamReader(
				System.in));
		String cadena;
		try {
			cadena = bReader.readLine(); // Lee una linea de texto (hasta intro)
		} catch (Exception e) {
			cadena = "";
		}
		return cadena;
	}

	/**
	 * Lee una cadena del teclado
	 * 
	 * @return cadena introducida por el usuario
	 */

	public static String leerCadena() {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(
				System.in));
		String cadena;
		try {
			cadena = bReader.readLine(); // Lee una linea de texto (hasta intro)
		} catch (Exception e) {
			cadena = "";
		}
		return cadena;
	}

	/**
	 * Lee un entero del teclado
	 * 
	 * 
	 * @return entero introducido por el usuario
	 */
	public static int leerEntero(String cadena) {
		System.out.println(cadena);
		int x;
		try {
			x = Integer.parseInt(leerCadena().trim()); // Quita los espacios del
														// String y convierte a
														// int
		} catch (Exception e) {
			x = 0;
		}
		return x;
	}

	/**
	 * Lee un decimal del teclado
	 * 
	 * @return decimal introducido por el usuario
	 */
	public static double leerDecimal(String cadena) {
		System.out.println(cadena);
		double x;
		try {
			x = Double.parseDouble(leerCadena().trim()); // Quita los espacios
															// del String y
															// convierte a
															// double
		} catch (Exception e) {
			x = 0;
		}
		return x;
	}

}