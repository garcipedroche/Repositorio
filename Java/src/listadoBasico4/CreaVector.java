package listadoBasico4;

import utiles.Teclado;
/**
 * 14. Crea una clase CreaVector que solicite al usuario el tamaño de un nu evo
 * vector y que le pida los enteros necesarios para inicializarlo. Utiliza los
 * métodos pedirDimension() y pedirDatos(int[])
 * 
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 * 
 */
public class CreaVector {
	public static void main(String[] args) {
		int longitud = pedirDimension("Longitud del vector:");
		int[] vector=new int[longitud];
		vector=pedirDatos(vector);
		System.out.println("Vector:");
		mostrarVectorEnteros(vector);
		
	}
	
	private static int[] pedirDatos(int[] vector) {
		for (int i = 0; i < vector.length; i++) {
				System.out.println("Introduce el valor de la posicion " + i
						+ ":");
				vector[i] = Teclado.leerEntero();
			}
		return vector;
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
}
