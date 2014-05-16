package argumentos;

import utiles.Teclado;

/**
 * Crea una clase Metodos tal y como se explica:
 * 
 * Un m�todo incrementa(int i) que incremente y muestre el argumento dentro.
 * (par�metro por valor) Un m�todo modifica(int i, char c, double d) que
 * modifique y muestre los tres argumentos dentro. (par�metro por valor) Un
 * m�todo incrementa(int [] v) que incremente y muestre el primer elemento del
 * vector dentro (par�metro por valor)
 * 
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 * 
 */
public class Metodos {
	
	public static void incrementa(int i) {
		i++;
		System.out.println("Valor introducido + 1: " + i);
	}

	public static void modifica(int i, char c, double d) {
		System.out.println("Modifica i:");
		i=Teclado.leerEntero();
		System.out.println("Modifica c:");
		c=Teclado.leerCaracter();
		System.out.println("Modifica d:");
		d=Teclado.leerDecimal();
		System.out.println("Valor de i modificado: "+i);
		System.out.println("Valor de c modificado: "+c);
		System.out.println("Valor de d modificado: "+d);
		
	}

	public static void incrementa(int[] v) {
		v[0]++;
		System.out.println("Valor del primer elemento del vector + 1: " + v[0]);

	}
}
