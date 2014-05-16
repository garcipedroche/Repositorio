package listadoBasico4;

import utiles.Teclado;

/**
 * 7. Define la clase Secuencia que busque la secuencia en orden creciente más
 * larga dentro de un vector de enteros inicializado aleatoriamente
 * (Math.random()) . Se mostrará tanto la posición de la primera componente de
 * la secuencia como el tamaño de la misma.
 * 
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 * 
 */
public class Secuencia {
	public static void main(String[] args) {
		int longitud = pedirDimension("Longitud del vector:");
		int[] v, posytam;
		posytam = new int[2]; // posytam guarda el tamaño y la posicion de la
								// secuencia
		posytam[0] = 0; // inicializamos posicion inicio a 0
		posytam[1] = 0; // inicializamos tamaño a 0
		v = crearVectorAleatorioEnteros(100, 0, longitud);
		mostrarVectorEnteros(v);
		posytam = secuenciaCreciente(posytam, v);

		System.out.println("\n\nLongitud de la secuencia: " + posytam[1]
				+ "\nPosicion del primer elemento: " + posytam[0]);
	}
	
	private static int[] crearVectorAleatorioEnteros(int max, int min,
			int longitud) {
		int[] vector = new int[longitud];
		for (int i = 0; i < longitud; i++) {
			vector[i] = ((int) (Math.random() * (max - min) + min));
		}
		return vector;
	}
	
	private static void mostrarVectorEnteros(int[] vector) {
		for (int i = 0; i < vector.length; i++) {
			System.out.print(" "+vector[i]+" ");
		}
		System.out.println("");
	}
	
	private static int pedirDimension(String string) {
		int dimension;
		System.out.println(string);
		dimension = Teclado.leerEntero();
		return dimension;
	}

	private static int[] secuenciaCreciente(int[] posytam, int[] v) {
		int cont = 1;
		int i;
		for (i = 1; i < v.length; i++) {
			if (v[i] > v[i - 1]) {
				cont++;
			} else {
				if (posytam[1] < cont) {
					posytam[0] = i - cont;
					posytam[1] = cont;
				}
				cont = 1;
			}
		}
		if (posytam[1] < cont) {
			posytam[0] = i - cont;
			posytam[1] = cont;
		}
		return posytam;
	}
}
