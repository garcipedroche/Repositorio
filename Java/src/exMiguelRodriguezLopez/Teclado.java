package exMiguelRodriguezLopez;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
* Permite lectura desde teclado
*/
public class Teclado {
	/**
	* Lee una cadena desde el teclado
	*/
	public static String leerCadena() {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		String cadena;
		try {
			cadena = bReader.readLine(); //Lee una linea de texto (hasta intro)
		} catch( Exception e ) {
			cadena = "";
		}
		return cadena;
	}

	/**
	* Lee un caracter desde el teclado
	*/
	 public static char leerCaracter() {
		char caracter;
		try {
			caracter = leerCadena().charAt(0);
		} catch( Exception e ) {
			caracter = 0;
		}
		return caracter;
	}
	
	/**
	* Lee un entero desde el teclado
	*/
	public static int leerEntero() {
		int x;
		try {
			x = Integer.parseInt(leerCadena().trim()); //Quita los espacios del String y convierte a int
		} catch( Exception e ) {
			x = 0;
		}
		return x;
	}
	
	/**
	* Lee un decimal desde el teclado
	*/
	public static double leerDecimal() {
		double x;
		try {
			x = Double.parseDouble(leerCadena().trim()); //Quita los espacios del String y convierte a double
		} catch( Exception e ) {
			x = 0;
		}
		return x;
	}
}