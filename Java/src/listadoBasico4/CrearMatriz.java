package listadoBasico4;

import utiles.Teclado;

/**
 * 18. Crea una clase CreaMatriz que solicite al usuario el tamaño de una nueva
 * matriz y que le pida los enteros necesarios para inicializarlo. Utiliza los
 * métodos pedirFila(), pedirColumna() y pedirDatos(int[])
 * 
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 * 
 */
public class CrearMatriz {
	public static void main(String[] args) {
		int filas = pedirDimension("Nº de filas:");
		int columnas = pedirDimension("Nº de columnas:");
		int[][] matriz = new int[filas][columnas];
		matriz = pedirDatos(matriz);
	}
	
	private static int pedirDimension(String string) {
		int dimension;
		System.out.println(string);
		dimension = Teclado.leerEntero();
		return dimension;
	}

	private static int[][] pedirDatos(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.println("Introduce el valor de fila " + i
						+ " y columna " + j + ":");
				matriz[i][j] = Teclado.leerEntero();
			}
		}
		return matriz;
	}
}
