package listadoBasico4;

import utiles.Teclado;

/**
 * 19. Crea una clase MostrarMatriz que solicite al usuario el tamaño de una
 * nueva matriz y que le pida los enteros necesarios para inicializarla. Utiliza
 * los métodos pedirFila(), pedirColumna(), pedirDatos(int[]) y mostrarMatriz();
 * 
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 * 
 */
public class MostrarMatriz {
	public static void main(String[] args) {
		int filas = pedirDimension("Nº de filas:");
		int columnas = pedirDimension("Nº de columnas:");
		int[][] matriz = new int[filas][columnas];
		matriz = pedirDatos(matriz);
		System.out.println("\nMatriz:");
		mostrarMatrizEnteros(matriz);
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
	
	private static void mostrarMatrizEnteros(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			System.out.print("|");
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}

			System.out.print("| \n");
		}
	}
	
	private static int pedirDimension(String string) {
		int dimension;
		System.out.println(string);
		dimension = Teclado.leerEntero();
		return dimension;
	}
}
