package listadoBasico4;

import utiles.Teclado;

/**
 * 9. Define la clase SumaMatrices que sume dos matrices de enteros. El usuario
 * introducirá por teclado las dimensiones de las matrices (m x n) . Las
 * matrices se inicializarán de forma aleatoria con enteros entre 0 y 10. Se
 * visualizarán sumandos y suma.
 * 
 * @author Miguel Rodriguez Lopez
 * @version 1.0
 * 
 */
public class SumaMatrices {
	public static void main(String[] args) {
		int filas = pedirDimension("Dame las filas: ");
		int columnas = pedirDimension("Dame las columnas: ");

		System.out.println("Introducir matriz 1:");
		int[][] sumando1 = crearMatrizAleatoriaEnteros(10, 0, filas,
				columnas);
		System.out.println("Mostrar matriz 1:");
		mostrarMatrizEnteros(sumando1);
		System.out.println("Introducir matriz 2:");
		int[][] sumando2 = crearMatrizAleatoriaEnteros(10, 0, filas,
				columnas);
		System.out.println("Mostrar matriz 2:");
		mostrarMatrizEnteros(sumando2);

		int[][] suma = sumar(sumando1, sumando2);
		System.out.println("Mostrar matriz suma:");
		mostrarMatrizEnteros(suma);
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

	/**
	 * 
	 * @param sumando1
	 *            Matriz A que deseas sumar
	 * @param sumando2
	 *            Matriz B que deseas sumar
	 * @return Devuelve la matriz A+B
	 */
	private static int[][] sumar(int[][] sumando1, int[][] sumando2) {
		int[][] suma = new int[sumando1.length][sumando1[0].length];
		for (int i = 0; i < sumando1.length; i++) {
			for (int j = 0; j < sumando1[i].length; j++) {
				suma[i][j] = sumando1[i][j] + sumando2[i][j];
			}
		}
		return suma;
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
}
