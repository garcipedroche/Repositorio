package listadoBasico4;

import utiles.Teclado;

/**
 * 15. Crea una clase MayorDelVector que cree un vector con enteros aleatorios y
 * muestre el valor máximo. Para ello, implementa los métodos pedirDimension(),
 * inicializarVectorAleatoriamente(int[], i, max) y hallarMaximo(int[])
 * 
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 * 
 */
public class MayorDelVector {
	public static void main(String[] args) {
		int longitud = pedirDimension("Longitud del vector:");
		int max = pedirDimension("Nº máximo aleatorio:");
		int min = pedirDimension("Nº minimo aleatorio:");
		int[] vector = new int[longitud];
		vector = crearVectorAleatorioEnteros(max, min, longitud);
		System.out.println("Vector:");
		mostrarVectorEnteros(vector);
		hallarMaximo(vector);
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

	private static void hallarMaximo(int[] vector) {
		int max=vector[0];
		for(int i=1;i<vector.length;i++){
			if(vector[i]>max){
				max=vector[i];
			}
		}
		System.out.println("El mayor elemento del vector es: "+max);
	}
}
