package listadoBasico4;

import utiles.Teclado;

/**
 * 11. Define la clase Multiplica Matrices que multiplique dos matrices de
 * enteros. El usuario introducirá por teclado las dimensiones de las matrices
 * (m x n, n x o). Las matrices se inicializarán de forma aleatoria con enteros
 * entre 1 y 10. Se visualizarán factores y resultado.
 * 
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 * 
 */
public class MultiplicaMatrices {
	public static void main(String[] args) {
		int m = pedirDimension("Nº de filas de la matriz A:");
		int n = pedirDimension("Nº de columnas de la matriz A y Nº de filas de la matriz B (deben ser iguales):");
		int o = pedirDimension("Nº de columnas de la matriz B:");
		int[][] matrizA = new int[m][n];
		int[][] matrizB = new int[n][o];
		int[][] matrizProducto = new int[m][o];
		matrizA = crearMatrizAleatoriaEnteros(10, 1, m, n);
		System.out.println("\n\nMatriz A:");
		mostrarMatrizEnteros(matrizA);
		matrizB = crearMatrizAleatoriaEnteros(10, 1, n, o);
		System.out.println("\n\nMatriz B:");
		mostrarMatrizEnteros(matrizB);
		matrizProducto = productoMatrices(matrizA, matrizB);
		System.out.println("\n\nMatriz Producto:");
		mostrarMatrizEnteros(matrizProducto);

	}

	private static int[][] productoMatrices(int[][] matrizA, int[][] matrizB) {
		int[][] matrizProducto = new int[matrizA.length][matrizB[0].length];
		System.out.println("\n\nOperaciones de Matriz Producto:");
		for (int i = 0; i < matrizProducto.length; i++) {
			System.out.print("|");
			for (int j = 0; j < matrizProducto[0].length; j++) { // Dos bucles
																	// que
																	// recorren
																	// la matriz
																	// Producto
				matrizProducto[i][j] = 0;
				for (int k = 0; k < matrizA[0].length; k++) {
					matrizProducto[i][j] += matrizA[i][k] * matrizB[k][j];
					System.out.print("("+matrizA[i][k]+"*"+matrizB[k][j]+")");
					if(k!=(matrizA[0].length-1))
						System.out.print("+");
				}// filas de A y columnas de B
				System.out.print("\t");
			}// matriz producto
			System.out.print("|\n");
		}// matriz producto
		return matrizProducto;
	}
	
	private static int pedirDimension(String string) {
		int dimension;
		System.out.println(string);
		dimension = Teclado.leerEntero();
		return dimension;
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
	
	private static void mostrarMatrizEnteros(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			System.out.print("|");
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}

			System.out.print("| \n");
		}
	}
}
