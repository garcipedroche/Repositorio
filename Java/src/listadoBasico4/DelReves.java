package listadoBasico4;

import utiles.Teclado;

/**
 * 13. Crea una clase DelReves que implemente el método mostrarDelReves(int []).
 * Se le pasará como argumento un vector de enteros que muestre el vector del
 * revés.
 * 
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 * 
 */
public class DelReves {
	public static void main(String[] args) {
		int longitud = pedirDimension("Longitud del vector:");
		int[] vector = new int[longitud];
		vector = crearVectorAleatorioEnteros(100, 0, longitud);
		System.out.println("Vector:");
		mostrarVectorEnteros(vector);
		System.out.println("\nVector del reves:");
		mostrarVectorEnterosDelReves(vector);
	}
	
	private static int pedirDimension(String string) {
		int dimension;
		System.out.println(string);
		dimension = Teclado.leerEntero();
		return dimension;
	}
	
	private static void mostrarVectorEnteros(int[] vector) {
		for (int i = 0; i < vector.length; i++) {
			System.out.print(" "+vector[i]+" ");
		}
		System.out.println("");
	}
	
	private static void mostrarVectorEnterosDelReves(int[] vector) {
		for (int i = vector.length-1; i >=0; i--) {
			System.out.print(" "+vector[i]+" ");
		}
		System.out.println("");
	}
	
	private static int[] crearVectorAleatorioEnteros(int max, int min,
			int longitud) {
		int[] vector = new int[longitud];
		for (int i = 0; i < longitud; i++) {
			vector[i] = ((int) (Math.random() * (max - min) + min));
		}
		return vector;
	}
}
