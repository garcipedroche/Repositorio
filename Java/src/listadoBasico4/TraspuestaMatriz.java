package listadoBasico4;

import utiles.Teclado;

/**
 * 10. Defin e la clase Traspuesta Matriz que i nviert a una matriz de enteros.
 * Se piden las dimensiones y toma valores aleatorios entre 1 y 10 .
 * 
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 * 
 */
public class TraspuestaMatriz {
	public static void main(String[] args) {
		int[][] matriz, traspuesta;
		int filas = pedirDimension("Nº de filas:");
		int columnas = pedirDimension("Nº de columnas:");
		matriz = new int[filas][columnas];
		traspuesta = new int[columnas][filas];
		matriz = crearMatrizAleatoriaEnteros(10, 1, filas, columnas);
		System.out.println("\n\nMatriz A:");
		mostrarMatrizEnteros(matriz);
		traspuesta = traspuestaMatriz(matriz);
		System.out.println("\n\nTraspuesta de A:");
		mostrarMatrizEnteros(traspuesta);
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
	
	private static int[][] crearMatrizAleatoriaEnteros(int max, int min,
			int filas, int columnas) {
		int[][] matriz = new int[filas][columnas];
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				matriz[i][j] = ((int) (Math.random() * (max - min) + min));
			}
		}
		return matriz;
	}
/**
 * 
 * @param matriz a la que deseas encontrar la traspuesta
 * @return devuelve la matriz traspuesta de la ingresada por parametro
 */
	private static int[][] traspuestaMatriz(int[][] matriz) {
		int[][] traspuesta = new int[matriz[0].length][matriz.length];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				traspuesta[j][i] = matriz[i][j];
			}
		}
		return traspuesta;
	}
	
	private static int pedirDimension(String string) {
		int dimension;
		System.out.println(string);
		dimension = Teclado.leerEntero();
		return dimension;
	}
}
