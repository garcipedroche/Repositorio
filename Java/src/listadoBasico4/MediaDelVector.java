package listadoBasico4;

import utiles.Teclado;

/**
 * 17. Crea una clase MediaDelVector que cree un vector con enteros aleatorios y
 * muestre la media del vector. Para ello, implementa los métodos
 * pedirDimension(), inicializarVectorAleatoriamente(int[], min, max) y
 * hallarMedia(int[])
 * 
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 * 
 */
public class MediaDelVector {
	public static void main(String[] args) {
		int longitud = pedirDimension("Longitud del vector:");
		int max = pedirDimension("Nº máximo aleatorio:");
		int min = pedirDimension("Nº minimo aleatorio:");
		int[] vector = new int[longitud];
		vector = crearVectorAleatorioEnteros(max, min, longitud);
		System.out.println("Vector:");
		mostrarVectorEnteros(vector);
		hallarMedia(vector);
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

	private static void hallarMedia(int[] vector) {
		double media = 0;
		for (int i = 0; i < vector.length; i++) {
			media += vector[i];
		}
		media /= vector.length;
		System.out.println("La media de los elementos del vector es: " + media);
	}
}
