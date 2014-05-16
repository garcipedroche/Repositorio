package listadoBasico4;

import utiles.Teclado;

/**
 * 16. Crea una clase MenorDelVector que cree un vector con enteros aleatorios y
 * muestre el valor m�nimo. Para ello, implementa los m�todos pedirDimension(),
 * inicializarVector Aleatoriamente(int[], min, max) y hallarMinimo(int[])
 * 
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 * 
 */
public class MenorDelVector {
	public static void main(String[] args) {
		int longitud = pedirDimension("Longitud del vector:");
		int max = pedirDimension("N� m�ximo aleatorio:");
		int min = pedirDimension("N� minimo aleatorio:");
		int[] vector = new int[longitud];
		vector = crearVectorAleatorioEnteros(max, min, longitud);
		System.out.println("Vector:");
		mostrarVectorEnteros(vector);
		hallarMinimo(vector);
	}
	
	private static void mostrarVectorEnteros(int[] vector) {
		for (int i = 0; i < vector.length; i++) {
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
	
	private static int pedirDimension(String string) {
		int dimension;
		System.out.println(string);
		dimension = Teclado.leerEntero();
		return dimension;
	}

	private static void hallarMinimo(int[] vector) {
		int min = vector[0];
		for (int i = 1; i < vector.length; i++) {
			if (vector[i] < min) {
				min = vector[i];
			}
		}
		System.out.println("El menor elemento del vector es: " + min);
	}
}
